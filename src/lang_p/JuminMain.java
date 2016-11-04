package lang_p;

import java.util.Arrays;

public class JuminMain {

	static int [] mm = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static int toNumber(String str)
	{
		int res =0;
		
		for (int i = 0; i < str.length(); i++) {
			res*=10;
			res+=str.charAt(i)-'0';
		}
		
		return res;
	}
	static int mmAdd(int start, int end)
	{
		int res =0;
		
		for (int i = start; i < end; i++) {
			res+=mm[i];
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jumin="880320-1234567";
		String [][] index = {
				{"여자","남자"},
				{"내국인","외국인"}
				};
		int [] birth = new int[jumin.substring(0,jumin.indexOf("-")).length()/2];
		int [] today = {2016,9,29};
		
		for (int i = 0; i < birth.length; i++) {
			System.out.println(i*2+2);
			birth[i] = toNumber(jumin.substring(i*2,i*2+2));
		}
		int chk = jumin.charAt(7)-'0';
		System.out.println("성별:"+index[0][chk%2]);
		System.out.println("국적:"+index[1][chk%9/5]);
		birth[0]+=(19+(chk%9==0 ? -1 : (chk-1)%4/2))*100;
		
		int age = today[0]-birth[0];
		System.out.println("한국나이:"+(age+1));
		int dday =mm[today[1]]-today[2];
		
		dday +=mmAdd(today[1]+1, 13);
		dday +=mmAdd(1, birth[1]);
		
		dday+=birth[2];
		
		
		if(toNumber(jumin.substring(2,6))>toNumber(""+today[1]+today[2]))
		{
			age--;
			dday = birth[2]-today[2];
			if(today[1]<birth[1])
			{
				dday =mm[today[1]]-today[2];
				dday +=mmAdd(today[1]+1, birth[1]);
				dday +=birth[2];
			}
		}
		
		System.out.println("만나이:"+age);
		System.out.println("D-day:"+dday);
		System.out.println(Arrays.toString(birth));
		
	}

}
