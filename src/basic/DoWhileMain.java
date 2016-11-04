package basic;

public class DoWhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15;
		
		while(a<10)
		{
			System.out.println("while:"+a);
			a++;
		}
		
		System.out.println();
		//////////////////////////
		a = 15;
		
		do
		{
			System.out.println("do~while:"+a);
			a++;
		}while(a<10);
	}

}
