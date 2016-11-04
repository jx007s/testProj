package basic;

public class Switch2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jum = 88;
		String grade;
		switch(jum/10)
		{
			case 10:
				grade = "수";
				break;
			case 7:
				grade = "미";
				break;
			case 9:
				grade = "수";
				break;
			case 8:
				grade = "우";
				break;
			
			case 6:
				grade = "양";
				break;
			default :
				grade = "가";
				break;
		}
		
		System.out.println(jum+":"+grade);
		
		double jumsu = 3.7;
		
		//int jum2 = (int)(jumsu *10);
		
		
		switch((int)(jumsu*2))
		{
			case 9:
				grade = "A+";
				break;
			case 8:
				grade = "A";
				break;
			case 7:
				grade = "B+";
				break;
			case 6:
				grade = "B";
				break;
			case 5:
				grade = "C+";
				break;
			case 4:
				grade = "C";
				break;
			case 3:
				grade = "D+";
				break;
			case 2:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			
		}
		
		System.out.println(jumsu+":"+ grade);
	}

}
