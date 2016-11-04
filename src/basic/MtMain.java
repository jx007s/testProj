package basic;

public class MtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String team = "영업부";
		String mt;
		switch(team)
		{
		 case "영업부":
			 mt = "산";
			 break;
		 case "인사부":
			 mt = "바다";
			 break;
		 case "부부":
			 mt = "안방";
			 break;
		 case "두부":
			 mt = "콩밭";
			 break;
		 default:
			 mt = "잔업";
		
		}
		
		System.out.println(team+":"+mt);
		
		 //부장 : 50%, 과장 : 30%, 대리 : 20%, 사원:10%
		String grade = "대리";
		int base = 300;
		double bonus=0.123456;
		switch(grade)
		{
			case "부장":
				bonus = 0.5;
				break;
			case "과장":
				bonus = 0.3;
				break;
			case "대리":
				bonus = 0.2;
				break;
			case "사원":
				bonus = 0.1;
				break;
		}
		
		int money = (int)(base * (1+bonus));
		System.out.println(money);
	}

}
