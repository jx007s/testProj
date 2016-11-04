package io_p;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("img/aaa.txt");
			
			/*int data;
			
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
			}*/
			
			byte [] buf = new byte[8];
			
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				System.out.print(new String(buf,0,len));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
