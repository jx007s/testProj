package basic;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i = 0;i<=10;i++) //for문 내부 지역변수
		{
			//i = 100;
			sum += i;
			System.out.println("선생님은 귀여워요"+i+","+sum);
			
			if(i%2==0)
				System.out.println(i+"는 짝수");
			
			if(i==8)
				break;
			
		}
		
		System.out.println("sum:"+sum);
	}

}
