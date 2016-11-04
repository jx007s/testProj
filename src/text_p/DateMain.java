package text_p;

import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today = new Date();
		Date birthDay = new Date(88,2,20,4,50,12);
		System.out.println(today);
		System.out.println(birthDay);
		
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime());
		
		today.setYear(102);
		today.setMonth(5);
		today.setDate(2);
		
		today.setHours(20);
		today.setMinutes(12);
		today.setSeconds(25);
		
		today.setTime(0);
		System.out.println(today);
		
		Calendar bd = Calendar.getInstance();
		
		System.out.println(toStr(bd));
		bd.setTime(today);
		System.out.println(toStr(bd));
		bd.add(Calendar.MONTH, 5);
		System.out.println(toStr(bd));
		
		today = bd.getTime();
		System.out.println(today);
		
		System.out.println(today.before(birthDay));
		System.out.println(today.after(birthDay));
	}

	static String toStr(Calendar day)
	{
		String str=day.get(Calendar.YEAR)+"-"+
				(day.get(Calendar.MONTH)+1)+"-"+
				day.get(Calendar.DATE)+" ("+
				" 일월화수목금토".charAt(day.get(Calendar.DAY_OF_WEEK))+" ) "+
				day.get(Calendar.HOUR_OF_DAY)+":"+
				day.get(Calendar.MINUTE)+":"+
				day.get(Calendar.SECOND);
		
		return str;
	}

}
