package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte [] arr = {12,23,34,45,56,78,89,90,-23,2,1,0,-128,-127,-3,-2,-1};
		byte [] outArr;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int data;
		
		while((data=bis.read())!=-1)
		{
			System.out.println(data+":"+(byte)data);
			bos.write(data);
		}
		outArr = bos.toByteArray();
		
		System.out.println(Arrays.toString(outArr));
		
	}

}
