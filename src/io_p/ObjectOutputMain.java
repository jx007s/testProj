package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("img/obj.txt");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			
			SerialData sd = new SerialData(123,"www");
			
			oos.writeLong(12345678900L);
			oos.writeBoolean(true);
			oos.writeUTF("asdfg");
			oos.writeObject(sd);
			
			for (int i = 0; i <=3; i++) {
				oos.writeObject(new SerialData(i*10, "aaaa"));
				
				oos.flush();
				oos.reset();
			}
			
			for (int i = 0; i <=3; i++) {
				oos.writeObject(new SerialData(i*10, "aaaa"));
			}
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
