package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date today = new Date();
		
		//System.out.println(sdf.format(today)+123);
		
		String [] arr = {
				"yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd",//,"ddd"
				"E","EEEE","F",
				"w","W",
				"a","z","Z",
				"H","HH","k","kk",
				"h","hh","K","KK",
				"m","mm","s","ss","S"
				};
		
		
		for (String str : arr) {
			System.out.println(str+":"+new SimpleDateFormat(str, new Locale("en")).format(today));
		}
		
		
		 //// '89年  nov 28일 (화) 24:07:30 
		
		String str = new SimpleDateFormat("yy年  MMM dd일 (",new Locale("en")).format(today);
		str += new SimpleDateFormat("E) kk:mm:ss",new Locale("ko")).format(today);
		
		System.out.println("'"+str);
		
		
		try {
			Date birth  = sdf.parse("1988-03-20");
			String jumin = "751542-7234567";
			int chk = jumin.charAt(7)-'0';
			int pre =(19+(chk%9==0 ? -1 : (chk-1)%4/2));
			
			birth = new SimpleDateFormat("yyyyMMdd").parse(
					pre+jumin.substring(0, 6)
					);
			System.out.println(birth);
			
			////주민번호로부터 본인의 생년월일을 Date 형태로  변환하세요
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
