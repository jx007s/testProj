package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			if(args.length!=2)
			{
				System.out.println("모야모야");
				return;
			}
			
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			byte [] buf = new byte[8];
			
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				fos.write(buf, 0, len);
				
			}
			
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
