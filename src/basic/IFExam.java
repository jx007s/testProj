package basic;

public class IFExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5, kor = 98, eng = 97, mat = 99;
		String name = "장동건", grade;
		int sum = kor+eng+mat;
		double avg = sum / 3;
		
		
		if(avg>=90)
		{
			grade="수";
			if(kor >=90 && eng  >=90 && mat >=90)
				//grade=grade+"(우등생)";
				grade+="(우등생)";
			
		}
		else if(avg>=80)
		{
			grade="우";
		}
		else if(avg>=70)
		{
			grade="미";
		}else if(avg>=60)
		{
			grade="양";
		}else
		{
			grade="가";
		}
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(grade);
	}

}
