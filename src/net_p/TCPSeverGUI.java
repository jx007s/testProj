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
			System.out.println("���� �غ� �Ϸ�");
			File file = new File("img/sm.jpeg");
			
			// ������ �о��
			// System.out.println(file.length());
			// System.out.println(data);

			int data = (int) file.length();// ��ü ���� �뷮

			while (true) {
				// Ŭ���̾�Ʈ ��ٸ�.
				Socket client = sever.accept();
				System.out.println(client.getInetAddress() + " �� ������.");
				FileInputStream fis = new FileInputStream(file);
				OutputStream os = client.getOutputStream();
				
				
				TCP_KSH ksh = new TCP_KSH();
				ksh.msg ="�輺�� ���� ���� �Ϸ�";
				ksh.fileName=file.getName();
				ksh.data = new byte[fis.available()];
				fis.read(ksh.data);
				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(ksh);
				
				/*DataOutputStream dos = new DataOutputStream(os);

				dos.writeUTF("�輺�� ���� ���� �Ϸ�");
				dos.writeUTF(file.getName());// ���� �̸� ����
				dos.writeInt(data);// ���� ��ü ũ�� ����
				
				

				byte[] buf = new byte[8];
				int len = 0;
				while ((len = fis.read(buf)) != -1) {// ������ �а�
					dos.write(buf, 0, len);// ������ �ƿ�
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

