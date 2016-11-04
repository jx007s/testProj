package text_p;
//////////이름,국어, 영어, 수학 으로 평균을 계산하여
////80점 이상인 경우 :   평균점수
///     이하인경우 :   ▼이름

import java.text.DecimalFormat;

public class DecimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "못하겠다";
		int [] jum = {38,87,86};
		int sum=0, cutline =80;
		for (int i : jum) {
			sum+=i;
		}
		int avg = sum/jum.length;
		
		String str = new DecimalFormat("▲#;▼#").format(avg-cutline);
		
		String res = str.substring(0,1);
		if(res.equals("▲"))
		{
			res+=avg;
		}else{
			res+=name;
		}
		
		System.out.println(res);
		
	}

}
