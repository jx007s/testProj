package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufferMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		byte [] arr = {12,23,34,45,56,78,89,90,-23,2,1,0,-128,-127,-3,-2,-1};
		byte [] outArr;
		byte [] buf = new byte[10];
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//bis.read(buf, 2, 6);
		//bos.write(buf, 3, 4);
		System.out.println(bis.read(buf));
		bos.write(buf);
		
		outArr = bos.toByteArray();
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(buf));
		System.out.println(Arrays.toString(outArr));
		System.out.println(bis.available());
		
		
		///////////////////////
		System.out.println(bis.read(buf));
		bos.write(buf);
		
		outArr = bos.toByteArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(buf));
		System.out.println(Arrays.toString(outArr));
		System.out.println(bis.available());
	}

}
