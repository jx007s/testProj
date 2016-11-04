package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufferMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte [] arr = {12,23,34,45,56,78,89,90,-23,2,1,0,-128,-127,-3,-2,-1};
		byte [] outArr;
		byte [] buf = new byte[5];
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		while(bis.available()>0)
		{
			try {
				int len = bis.read(buf);
				bos.write(buf,0, len);
				System.out.println(Arrays.toString(buf));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		outArr = bos.toByteArray();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(outArr));
	}

}
