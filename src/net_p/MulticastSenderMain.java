package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MulticastSocket ms = new MulticastSocket();
			String msg = "�������� �Ϳ�����";
			InetAddress ia = InetAddress.getByName("231.0.0.1");
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(),
					msg.getBytes().length,
					ia,
					7777
			);
			ms.send(data);
			ms.close();
			System.out.println("��Ƽĳ��Ʈ �۽� ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
