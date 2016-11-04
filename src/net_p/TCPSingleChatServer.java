package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread
{
	DataOutputStream dos;
	String name;
	public TCPSingleSender(Socket socket) {
		// TODO Auto-generated constructor stub
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			name = "["+socket.getLocalAddress()+"]";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(dos!=null)
		{
			try {
				dos.writeUTF(name+sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class TCPSingleReceiver extends Thread
{
	DataInputStream dis;
	public TCPSingleReceiver(Socket socket) {
		// TODO Auto-generated constructor stub
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(dis!=null)
		{
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class TCPSingleChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료");
			Socket client = server.accept();
			
			new TCPSingleSender(client).start();
			new TCPSingleReceiver(client).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
