package lang_p;

import java.util.Arrays;

public class StringYeot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="������ �Ϳ����� AbcD eF Java ���� 1234";
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		System.out.println(a.replaceAll("a", "����"));
		
		char [] arr = a.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("   gfo fwj ded     ".length());
		System.out.println("   gfo fwj ded     ".trim().length());
		System.out.println(a.concat("���� �Ƚ��"));
		System.out.println(a+"���� �Ƚ��");
		
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
		//������ �Ϳ����� Abcd Ef Java ���� 1234
	}

}
