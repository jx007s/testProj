package util_p;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pp = "정.*";
		
		//System.out.println(pp=="정지영");
		System.out.println(Pattern.matches(pp, "정지영"));
		
		String [] arr = {"정승환","조찬봉","최승호","김은아","윤문구","김성훈"};
		
		for (String str : arr) {
			
			// arr[i] -> 0x12345678
			// str = arr[i]  <- 0x12345678
			str = "번개 파워!"; // str = 0x98765432
			
			//arr[i] 주소와 str의 주소가 다르다!!!
			System.out.print(str+",");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
			// arr[i] -> 0x12345678
			arr[i]="스캐럽 만세";  // 0x88776655
			//arr[i] <- 0x88776655
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

}
