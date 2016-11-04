package basic;

public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 38;
		
		String grade="가";
		 if(a>=90){
				
			 	grade = "수";
				System.out.println("90이라지");
				//System.out.println("나도 실행되쥐");
			}
		
		else if(a>=80){
			grade = "우";
			System.out.println("80이라지");
			//System.out.println("나도 실행되쥐");
		}
		
		//////////////////////////
		
		else if(a>=70)
		{
			grade = "미";
			System.out.println("70이라지");
		}
		else if(a>=60)
		{
			grade = "양";
			System.out.println("60이라지");
		}
		else{
			
			System.out.println("난 거짓이지");
		}
		
		System.out.println("난 별개지");
		System.out.println("결과:"+grade);
	}

}
