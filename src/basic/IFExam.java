package basic;

public class IFExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5, kor = 98, eng = 97, mat = 99;
		String name = "�嵿��", grade;
		int sum = kor+eng+mat;
		double avg = sum / 3;
		
		
		if(avg>=90)
		{
			grade="��";
			if(kor >=90 && eng  >=90 && mat >=90)
				//grade=grade+"(����)";
				grade+="(����)";
			
		}
		else if(avg>=80)
		{
			grade="��";
		}
		else if(avg>=70)
		{
			grade="��";
		}else if(avg>=60)
		{
			grade="��";
		}else
		{
			grade="��";
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
