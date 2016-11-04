package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadCastReciever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket ds = new DatagramSocket(7777);
			byte [] arr = new byte [1024];
			
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			ds.receive(data);
			System.out.println(data.getAddress());
			//System.out.println(new String(data.getData()));
			System.out.println(new String(arr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
