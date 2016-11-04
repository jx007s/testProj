package basic;

import java.util.Scanner;

public class SosuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input, i, cnt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		input = sc.nextInt();
		
		i = 2; cnt = 0;
		while (i <=input) {
			
			int j, chk;
			j = 2; chk =0;
			
			while (j <i) {
				if(i%j==0)
					chk++;
				
				j++;
			}
			if(chk==0)
				cnt++;
			i++;
		}
		System.out.println("소수갯수:"+cnt);
	}

}
