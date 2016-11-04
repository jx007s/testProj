package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastRecieverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MulticastSocket ms = new MulticastSocket(7777);
			InetAddress is = InetAddress.getByName("231.0.0.1");
			ms.joinGroup(is);
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			ms.receive(data);
			
			System.out.println(is.getHostName());
			System.out.println(new String(arr));
			
			ms.leaveGroup(is);
			ms.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
