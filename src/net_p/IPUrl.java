package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			System.out.println(ip);
			
			InetAddress [] ipArr = InetAddress.getAllByName("www.naver.com");
			
			for (InetAddress inet : ipArr) {
				System.out.println(inet);
			}
			
			
			ip = InetAddress.getLocalHost();
			
			System.out.println(ip);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
