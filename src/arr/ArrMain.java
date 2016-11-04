package arr;

import java.util.Arrays;

public class ArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {10,20,30,40};
		int [] arr4 = new int []{10,20,30,40};
		int arr2 [];
		
		arr2 = new int []{11,22,33,44,55};//;
		byte bb = 123;
		int ii = 123456;
		double dd = 123.456;
		int [] arr6 = {10,'a',bb, ii,(int)dd, (int)123L};
		
		//arr1 = {10,20,30,40,50};
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		//System.out.println(arr1[4]);
		System.out.println(arr2[0]);
		
		int [] arr3 = arr1;
		
		System.out.println("arr1:"+arr1);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		
		
		int [] arr5 = new int[arr1.length];
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = arr1[i];
		}
		/*
		arr5[0] = arr1[0];
		arr5[1] = arr1[1];
		arr5[2] = arr1[2];
		arr5[3] = arr1[3];*/
		
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr3:"+Arrays.toString(arr3));
		System.out.println("arr4:"+Arrays.toString(arr4));
		System.out.println("arr5:"+Arrays.toString(arr5));
		
		arr1[1] = 2000;
		
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr3:"+Arrays.toString(arr3));
		System.out.println("arr4:"+Arrays.toString(arr4));
		System.out.println("arr5:"+Arrays.toString(arr5));
		
		System.out.println(arr1.length);

		
	}

}
