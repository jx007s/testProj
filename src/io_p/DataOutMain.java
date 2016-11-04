package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("F:/lee/public/ddd.abc");
			DataOutputStream dos = new DataOutputStream(fos);
			
			
			dos.writeUTF("¾êµé¾Æ Á¹·Á");
			dos.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
