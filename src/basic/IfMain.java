package basic;

public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 38;
		
		String grade="��";
		 if(a>=90){
				
			 	grade = "��";
				System.out.println("90�̶���");
				//System.out.println("���� �������");
			}
		
		else if(a>=80){
			grade = "��";
			System.out.println("80�̶���");
			//System.out.println("���� �������");
		}
		
		//////////////////////////
		
		else if(a>=70)
		{
			grade = "��";
			System.out.println("70�̶���");
		}
		else if(a>=60)
		{
			grade = "��";
			System.out.println("60�̶���");
		}
		else{
			
			System.out.println("�� ��������");
		}
		
		System.out.println("�� ������");
		System.out.println("���:"+grade);
	}

}
