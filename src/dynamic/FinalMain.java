package dynamic;
class FinalPar
{
	static int a=10;
	int b=20;
	final int c=30;
	
	static void meth_1()
	{
		System.out.println("�� �θ� �޼ҵ�_1()");
	}
	void meth_2()
	{
		System.out.println("�� �θ� �޼ҵ�_2()");
	}
	final void meth_3()
	{
		System.out.println("�� �θ� �޼ҵ�_3()");
	}
}

class FinalChild extends FinalPar
{
	public FinalChild() {
		// TODO Auto-generated constructor stub
		a=10000;
		b=20000;
		//c=30000;
	}
	
	static void meth_1()
	{
		System.out.println("�� �ڽ� �޼ҵ�_1()");
	}
	void meth_2()
	{
		System.out.println("�� �ڽ� �޼ҵ�_2()");
	}
	/*final void meth_3()
	{
		System.out.println("�� �ڽ� �޼ҵ�_3()");
	}*/
	
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalPar pp = new FinalPar();
		
		
		System.out.println(pp.a);
		System.out.println(pp.b);
		System.out.println(pp.c);
		
		pp.a = 100;
		pp.b = 200;
		//pp.c = 300;
		
		System.out.println(pp.a);
		System.out.println(pp.b);
		System.out.println(pp.c);
		pp.meth_1();
		pp.meth_2();
		pp.meth_3();
		
		
		System.out.println();
		FinalChild cc = new FinalChild();
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
	
	}

}
