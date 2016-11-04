package basic;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		while(a<10)
		{
			System.out.println("선생님은 귀여워요:"+a);
			
			a++;
			
			//if(a==5)
				//continue;
			if(a!=5)
				System.out.println("while문 돌고:"+a);
			//a++;
		}

		System.out.println("종료:"+a);
	}

}
