package util_p;

import java.util.Calendar;

public class DiaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		int now = today.get(Calendar.DATE);
		today.set(Calendar.DATE, 1);
		for (int i = 1; i <today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("     ");
		}
		for (int i = 1; i <= today.getActualMaximum(Calendar.DATE); i++) {
			String pre = " ", sur=" ";
			if(i<10) pre+=" ";
			
			if(i==now) 
			{
				pre="[";
				sur="]";
				
			}
			
			System.out.print(pre+i+sur+" ");
			today.set(Calendar.DATE, i);
			if(today.get(Calendar.DAY_OF_WEEK)==7)
				System.out.println();
		}
	}

}
