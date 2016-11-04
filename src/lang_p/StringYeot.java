package lang_p;

import java.util.Arrays;

public class StringYeot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="선생님 귀여워요 AbcD eF Java 만세 1234";
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		System.out.println(a.replaceAll("a", "에이"));
		
		char [] arr = a.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("   gfo fwj ded     ".length());
		System.out.println("   gfo fwj ded     ".trim().length());
		System.out.println(a.concat("정말 안써요"));
		System.out.println(a+"정말 안써요");
		
		String str = "";
		String [] sss =a.toLowerCase().split(" ");
		for (int i =0;i<sss.length;i++) {
			
			char ch = sss[i].charAt(0);
			if(ch>='a' && ch<='z')
				ch-=('a'-'A');
			
			str += 
					//ch
					sss[i].substring(0,1).toUpperCase()
					+sss[i].substring(1);
			if(i<sss.length-1)
				str+=" ";
		}
		System.out.println(str);
		//선생님 귀여워요 Abcd Ef Java 만세 1234
	}

}
