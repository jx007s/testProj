package io_p;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ff = new File("img");
		
		System.out.println(ff.getName());
		System.out.println(ff.getPath());
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getParent());
		System.out.println(ff.exists());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		
		//ff.mkdir();
		File [] arr = ff.listFiles();
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		for (File file : arr) {
			String str=file.getName()+"\t";
			//System.out.println(file.getName());
			if(file.isDirectory())
				str+="dir";
			else{
				str+=file.length()+"\t";
				str+= file.canRead()?"R":" "; 
				str+= file.canWrite()?"W":" "; 
				str+= file.isHidden()?"H":" "+"\t";
				str+= sdf.format(new Date(file.lastModified()));
			}
			System.out.println(str);
		}
		
	}

}
