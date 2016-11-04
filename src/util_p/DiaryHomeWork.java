package util_p;

import java.util.Calendar;
import java.util.Scanner;

class HolyDay
{
	int mm, dd;
	String str;
	public HolyDay(int mm, int dd, String str) {
		super();
		this.mm = mm;
		this.dd = dd;
		this.str = str;
		
		for(int i =0; i<5 - str.length(); i++)
		 this.str += " ";
	}
	
}

public class DiaryHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HolyDay [] hh = {
				new HolyDay(3, 20, "탄신일"),
				new HolyDay(3, 1, "삼일절"),
				new HolyDay(5, 5, "어린이날"),
				new HolyDay(2, 7, " <----"),
				new HolyDay(2, 8, "-----"),
				new HolyDay(2, 9, " 설 날 "),
				new HolyDay(2, 10, "-----"),
				new HolyDay(2, 11, "-->"),
				new HolyDay(10, 3, "돐잔치")
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력:");
		int year = sc.nextInt();
		
		String [][][][] arr = new String [12][6][2][8];
		
		                        //월, 주, 일
		
		Calendar today = Calendar.getInstance();
		Calendar hhday = Calendar.getInstance();
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		
		today.set(year, 0, 1);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					for (int m = 0; m < arr[i][j][k].length; m++) {
						arr[i][j][k][m] = "_    ";
					}
				}
			}
		}
		
		for (int i = 0; i < hh.length; i++) {
			hhday.set(year, hh[i].mm-1, hh[i].dd);

			arr[hhday.get(Calendar.MONTH)][hhday.get(Calendar.WEEK_OF_MONTH)-1][1][hhday.get(Calendar.DAY_OF_WEEK)]=hh[i].str ;
		}
		
		for (int i = 1; i <= today.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			
			int curr = today.get(Calendar.DATE);
			String pre=" ";
			String sur=" ";
			
			if(month == today.get(Calendar.MONTH) && 
					day == curr)
			{
				pre="[";
				sur="]";
			}
			
			if(curr<10) pre+=" ";
			
			sur += " ";
			
			arr[today.get(Calendar.MONTH)][today.get(Calendar.WEEK_OF_MONTH)-1][0][today.get(Calendar.DAY_OF_WEEK)]= pre+curr+sur;
			today.add(Calendar.DATE, 1);
		}
		
		
		for (int i = 0; i < arr.length; i+=3) {
			
				for (int j = 0; j < 6; j++) {
					for (int h = 0; h < 2; h++) {
						for (int k = i; k < i+3; k++) {
							
							for (int m = 1; m <8; m++) {
								System.out.print(arr[k][j][h][m]);
							
							}
						
						System.out.print("\t");
						}
						System.out.println();
					}
					System.out.println();
				
			}
			
			System.out.println();
		}
		
	}

}
