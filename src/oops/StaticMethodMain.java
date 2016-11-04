package oops;

class SMM
{
	int a = goA();
	int b = 20;
	static int c = goC();
	
	
	int goA()
	{
		System.out.println("goA()");
		return 10;
	}
	
	static int goC()
	{
		System.out.println("goC()");
		return 30;
	}
	
	
	void meth_1()
	{
		System.out.println("�ν��Ͻ� �޼ҵ� 1:"+a+c);
		 meth_2();
		 stmeth_2();
		 System.out.println("------------------");
	}
	void meth_2()
	{
		System.out.println("�ν��Ͻ� �޼ҵ� 2");
	}
	
	static void stmeth_1()
	{
		System.out.println("����ƽ �޼ҵ� 1:"+c);
		 //meth_2();
		 stmeth_2();
		 System.out.println("------------------");
	}
	static void stmeth_2()
	{
		System.out.println("����ƽ �޼ҵ� 2");
	}
}

public class StaticMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��̿���0--------------");
		SMM s1 = new SMM();
		System.out.println("��̿���1--------------");
		SMM s2 = new SMM();
		System.out.println("��̿���2--------------");
		s1.meth_1();
		s2.meth_1();
		//SMM.meth_1();
		s1.stmeth_1();
		s2.stmeth_1();
		SMM.stmeth_1();
	}

}
