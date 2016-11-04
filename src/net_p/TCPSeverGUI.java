package net_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSeverGUI {
	public TCPSeverGUI() {
		try {
			//new TCPClientGUI();
			ServerSocket sever = new ServerSocket(7777);
			System.out.println("서버 준비 완료");
			File file = new File("img/sm.jpeg");
			
			// 파일을 읽어옴
			// System.out.println(file.length());
			// System.out.println(data);

			int data = (int) file.length();// 전체 파일 용량

			while (true) {
				// 클라이언트 기다림.
				Socket client = sever.accept();
				System.out.println(client.getInetAddress() + " 가 접속함.");
				FileInputStream fis = new FileInputStream(file);
				OutputStream os = client.getOutputStream();
				
				
				TCP_KSH ksh = new TCP_KSH();
				ksh.msg ="김성훈 서버 접속 완료";
				ksh.fileName=file.getName();
				ksh.data = new byte[fis.available()];
				fis.read(ksh.data);
				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(ksh);
				
				/*DataOutputStream dos = new DataOutputStream(os);

				dos.writeUTF("김성훈 서버 접속 완료");
				dos.writeUTF(file.getName());// 파일 이름 전송
				dos.writeInt(data);// 파일 전체 크기 전송
				
				

				byte[] buf = new byte[8];
				int len = 0;
				while ((len = fis.read(buf)) != -1) {// 파일을 읽고
					dos.write(buf, 0, len);// 데이터 아웃
				}
				
				dos.close();*/
				oos.close();
				os.close();
				fis.close();
				client.close();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TCPSeverGUI();
	}
}

