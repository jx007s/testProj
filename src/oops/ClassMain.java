package oops;

class Aaa{	//정의
	int a = 10;
	
	void method()
	{
		System.out.println("난 Aaa.method() 입니다.");
	}
	
	//System.out.println("난 Aaa.method() 입니다.");
}

class Bbb{
	int a = 100;
	
	void method()
	{
		System.out.println("난 Bbb.method() 입니다.");
	}
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aaa aa; //클래스의 선언
		aa = new Aaa();//클래스의 생성
		
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
