package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("img/obj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			System.out.println(ois.readLong());
			System.out.println(ois.readBoolean());
			System.out.println(ois.readUTF());
			SerialData sd = (SerialData)ois.readObject();
			System.out.println(sd.a);
			
			for (int i = 0; i <=3; i++) {
				System.out.println(ois.readObject());
				
			}
			
			for (int i = 0; i <=3; i++) {
				System.out.println(ois.readObject());
			}
			
			ois.close();
			fis.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
