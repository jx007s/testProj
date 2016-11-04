package util_p;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "정우성,조인성,현빈,,원빈,.장동건";
		
		StringTokenizer tok = new StringTokenizer(str,",.");
		
		while(tok.hasMoreElements())
		{
			System.out.println(tok.nextToken());
		}
		System.out.println("---------------------");
		String [] arr = str.split(",");
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
