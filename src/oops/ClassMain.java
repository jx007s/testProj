package oops;

class Aaa{	//����
	int a = 10;
	
	void method()
	{
		System.out.println("�� Aaa.method() �Դϴ�.");
	}
	
	//System.out.println("�� Aaa.method() �Դϴ�.");
}

class Bbb{
	int a = 100;
	
	void method()
	{
		System.out.println("�� Bbb.method() �Դϴ�.");
	}
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aaa aa; //Ŭ������ ����
		aa = new Aaa();//Ŭ������ ����
		
		Aaa aa2 = new Aaa();
		Bbb bb = new Bbb();
		//Aaa aa3 = new Bbb();
		
		System.out.println(aa);
		System.out.println(aa2);
		System.out.println(bb);
		System.out.println(aa.a);
		System.out.println(bb.a);
		aa.method();
		bb.method();
	}

}
