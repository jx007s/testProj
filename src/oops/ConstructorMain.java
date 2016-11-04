package oops;

class ClaCon
{
	int a = goA();
	String str;
	
	/*ClaCon(int a, String str)
	{
		this.a = a;
		this.str = str;
	}*/
	
	
	
	ClaCon(int a)
	{
		System.out.println("태어났다!!! 사용자 정의 생성자");
		this.a=a;
		c=3000;
	}
	
	ClaCon(int a, String str) {
		System.out.println("사용자 생성자2");
		this.a = a;
		this.str = str;
	}

	ClaCon() {
		// TODO Auto-generated constructor stub
		//System.out.println("기본생성자"); 생성자 이전에 무엇도 실행불가!!!
		this(20000,"천본앵");
		//this(123);
		System.out.println("기본생성자");
		meth();
	}
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
	
	void meth()
	{
		System.out.println("메소드가 나타났다!!!!");
	}
	
	void meth2()
	{
		//this();
		System.out.println("메소드2가 나타났다!!!!");
		
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaCon cc1 = new ClaCon(1111);
		System.out.println("--------------");
		ClaCon cc2 = new ClaCon();
		System.out.println("--------------");
		ClaCon cc3 = new ClaCon(1234,"바람의 상처!");
		System.out.println("--------------");
		System.out.println(cc1.a);
		System.out.println(cc2.a);
		System.out.println(cc2.str);
		System.out.println(cc1.c);
		System.out.println(cc2.c);
		System.out.println(cc3.a);
		System.out.println(cc3.str);
	}

}
