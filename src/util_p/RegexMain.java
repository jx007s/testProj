package util_p;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pp = "��.*";
		
		//System.out.println(pp=="������");
		System.out.println(Pattern.matches(pp, "������"));
		
		String [] arr = {"����ȯ","������","�ֽ�ȣ","������","������","�輺��"};
		
		for (String str : arr) {
			
			// arr[i] -> 0x12345678
			// str = arr[i]  <- 0x12345678
			str = "���� �Ŀ�!"; // str = 0x98765432
			
			//arr[i] �ּҿ� str�� �ּҰ� �ٸ���!!!
			System.out.print(str+",");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
			// arr[i] -> 0x12345678
			arr[i]="��ĳ�� ����";  // 0x88776655
			//arr[i] <- 0x88776655
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

}
