package lang_p;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Java";
		String str2 = new String("Hello Java");
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str2);
		System.out.println(str=="Hello Java");
		System.out.println(str==str2);
		System.out.println();
		System.out.println(str.equals("Hello Java"));
		System.out.println(str2.equals("Hello Java"));
		System.out.println(str.length());
		System.out.println("Hello Java".length());
		System.out.println("Hello Java");
		
		String str3 = new String(new char[]{'a','s','d','f'});
		
		System.out.println(str3);
		
		String a="¼±»ý´Ô ±Í¿©¿ö¿ä AbcD eF Java ¸¸¼¼ 1234";
		//        01 234---------------------> 28
		String email ="aaa_bbb@abc.co.kr";
		  
		System.out.println(a.charAt(5));  
		
		for (int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i)+",");
		}
		System.out.println();
		System.out.println(a.substring(6));
		System.out.println(a.substring(6,11));
		
		String [] emailArr = email.split("@");
		
		System.out.println(emailArr[0]);
		System.out.println(emailArr[1]);
		
		String [] domain = emailArr[1].split("[.]");
		System.out.println(Arrays.toString(domain));
		
		System.out.println(a.indexOf("a"));  
		System.out.println(a.indexOf("a",19));
		System.out.println(email.lastIndexOf("."));
		
		String ff = "dfs.fewfwe.efewf.txt";
		System.out.println(ff.substring(
				ff.lastIndexOf(".")+1
				));
	}

}
