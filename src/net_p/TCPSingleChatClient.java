package net_p;

import java.io.IOException;
import java.net.Socket;

public class TCPSingleChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket socket = new Socket("192.168.30.88", 7777);
			
			System.out.println("서버 연결 성공");
			
			new TCPSingleSender(socket).start();
			new TCPSingleReceiver(socket).start();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
