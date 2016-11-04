package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료");
			
			while(true)
			{
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+" 접속");
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("스윙으로 만들어 오세요 ");
				
				dos.close();
				os.close();
				client.close();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
