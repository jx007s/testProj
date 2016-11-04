package util_p;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
		
		System.out.println(today.get(1));
		System.out.println(today.get(2));
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		//2016-9-30 (금) 19:2:44
		
		System.out.println(toStr(today));
		
		today.set(Calendar.YEAR, 1989);
		
		System.out.println(toStr(today));
		
		today.set(1989,02,20);
		
		String jumin = "880320-1234567";
		int [] birth = new int[jumin.substring(0,jumin.indexOf("-")).length()/2];
		for (int i = 0; i < birth.length; i++) {
			System.out.println(i*2+2);
			birth[i] = Integer.parseInt(jumin.substring(i*2,i*2+2));
		}
		int chk = jumin.charAt(7)-'0';
		birth[0]+=(19+(chk%9==0 ? -1 : (chk-1)%4/2))*100;
		
		
		today.set(birth[0],birth[1]-1,birth[2]);
		System.out.println(toStr(today));
		
		System.out.println(today.getTimeInMillis());
		//today.setTimeInMillis(0);
		System.out.println(toStr(today));
		
		
		Calendar now = Calendar.getInstance();
		
		int age = (int)((now.getTimeInMillis()-today.getTimeInMillis())/(1000*60*60*24)/365);
		
		System.out.println(age);
		
		System.out.println(now.before(today));
		System.out.println(now.after(today));
		
		now.add(Calendar.YEAR, -1);
		System.out.println(toStr(now));
		
		System.out.println(today.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println(today.getActualMaximum(Calendar.MONTH));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		
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
