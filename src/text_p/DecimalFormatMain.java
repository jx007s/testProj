package text_p;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dd = 987654123.456;
		
		System.out.printf("정수:%d, 문자:%c, 실수:%.1f\n",77,77,dd);
		
		
		
		DecimalFormat df = new DecimalFormat("00000000");
		
		String [] arr = {"0","#","00000","#####","##00","#####00000",//"00000#####"
				"00.0000","#.####","0.00","0.##","0%","0.000%",
				"0-","-0",
				"0,000","#,##0.00","#,#0.00",
				"#.#;음수음수0.000000",
				"▲#;▼#"
				};
		
		
		for (String pp : arr) {
			System.out.println(pp+":"+new DecimalFormat(pp).format(dd));
		}
		//System.out.println(df.format(dd));
		
		
		try {
			dd = (double)(new DecimalFormat("0,000.00").parse("1,345.45"));
			System.out.println(dd+100);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
