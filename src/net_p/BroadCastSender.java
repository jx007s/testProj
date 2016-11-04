package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BroadCastSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket ds = new DatagramSocket();
			String msg = "난 선생이지";
			
			InetAddress addr = InetAddress.getByName("192.168.30.255");
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(),
					msg.getBytes().length,
					addr,
					7777
					);
			ds.send(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
