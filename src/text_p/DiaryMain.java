package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DiaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "740320-1234567";
		int chk = jumin.charAt(7)-'0';
		int year =Integer.parseInt((19+(chk%9==0 ? -1 : (chk-1)%4/2))+jumin.substring(0, 2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		long birth,last, first;
		try {
			birth = sdf.parse(
					year+jumin.substring(2, 6)
					).getTime();
			first = sdf.parse(
					year+"0101"
					).getTime();
			last = sdf.parse(
					year+1+"0100"
					).getTime();
			System.out.println(birth);
			System.out.println(last);
			sdf = new SimpleDateFormat("dd");
			
			
			String [][][][] arr = new String [12][6][2][8];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					for (int k = 0; k < arr[i][j].length; k++) {
						for (int m = 0; m < arr[i][j][k].length; m++) {
							arr[i][j][k][m] = "_    ";
						}
					}
				}
			}
			
			String [] str = {"M","W","E","dd"};
			SimpleDateFormat [] ss = new SimpleDateFormat[str.length];
			for (int i = 0; i < ss.length; i++) {
				ss[i]=new SimpleDateFormat(str[i]);
			}
			
			
			for(long i = first ;i<=last;i+=(1000*60*60*24))
			{
				
				String pre=" ";
				String sur=" ";
				
				if(i == birth)
				{
					pre="[";
					sur="]";
				}
				
				
				
				sur += " ";
				Date today = new Date(i);
				
				arr[Integer.parseInt(ss[0].format(today))-1]
						[Integer.parseInt(ss[1].format(today))-1][0]
										[" 일월화수목금토".indexOf(ss[2].format(today))]=
												pre+ss[3].format(today)+sur;
				
				
				
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
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
