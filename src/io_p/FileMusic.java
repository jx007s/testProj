package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FM
{
	String dirName;
	String path = "music_after";
	
	
	public FM(String dirName) {
		super();
		this.dirName = dirName;
		
		File pp = new File(path);
		pp.delete();
		
		
		File ff = new File(dirName);
		div(ff);
	}
	
	void div(File ff)
	{
		File [] arr = ff.listFiles();
		
		for (File file : arr) {
			if(file.isDirectory())
				div(file);
			
			else{
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
					String [] str = new String [2];
					
					String pp = path+"/";
					for (int i = 0; i < str.length; i++) {
						str[i] = br.readLine();
						pp+=str[i]+"/";
					}
					
					File dir = new File(pp);
					
					if(!dir.exists())
						dir.mkdirs();
					
					String fileName = pp+file.getName();
					
					fileName = namePolicy(fileName);
					System.out.println(fileName);
					
					FileWriter fw = new FileWriter(fileName);
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i = 0; i < str.length; i++) {
						bw.write(str[i]+"\n" );
					}
					
					int data;
					
					while((data=br.read())!=-1)
					{
						bw.write(data);
					}
					
					bw.close();
					fw.close();
					
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	String namePolicy(String name)
	{
		
		String res = name;
		String path = name.substring(0, name.lastIndexOf("."));
		String ext = name.substring(name.lastIndexOf("."));
		int cnt=1;
		
		while(new File(res).exists())
		{
			res = path+"_"+cnt+ext;
			cnt++;
		}
		
		return res;
	}
	
}
public class FileMusic {

	public static void main(String[] args) {
		new FM("music_before");
	}
}
