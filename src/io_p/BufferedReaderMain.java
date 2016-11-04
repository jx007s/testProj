package io_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileReader fr = new FileReader("img/aaa.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			int cnt=0;
			while((line=br.readLine())!=null)
			{
				
				System.out.println(cnt+":"+line);
				cnt++;
				
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
