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
		System.out.println("�¾��!!! ����� ���� ������");
		this.a=a;
		c=3000;
	}
	
	ClaCon(int a, String str) {
		System.out.println("����� ������2");
		this.a = a;
		this.str = str;
	}

	ClaCon() {
		// TODO Auto-generated constructor stub
		//System.out.println("�⺻������"); ������ ������ ������ ����Ұ�!!!
		this(20000,"õ����");
		//this(123);
		System.out.println("�⺻������");
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
		System.out.println("�޼ҵ尡 ��Ÿ����!!!!");
	}
	
	void meth2()
	{
		//this();
		System.out.println("�޼ҵ�2�� ��Ÿ����!!!!");
		
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaCon cc1 = new ClaCon(1111);
		System.out.println("--------------");
		ClaCon cc2 = new ClaCon();
		System.out.println("--------------");
		ClaCon cc3 = new ClaCon(1234,"�ٶ��� ��ó!");
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
