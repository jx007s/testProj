package io_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileReader fr = new FileReader("img/one.jpeg");
			FileWriter fw = new FileWriter("img/www.jpeg");
			int data;
			
			while((data = fr.read())!=-1)
			{
				System.out.print((char)data);
				fw.write(data);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
