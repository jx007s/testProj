package extends_p;

class ClaGrand
{
	int a = 9999;
	int d = 5555;
}

class ClaPar extends ClaGrand
{
	int a = 10;
	int ssa = super.a;
	void meth_1()
	{
		System.out.println("�� �θ� �޼ҵ�1");
	}
	public ClaPar(int a) {
		super();
		this.a = a;
		System.out.println("�� �θ� �����ڴ�!!!!");
	}
	
	
}

class ClaPar2
{
	int c = 10;
	void meth_3()
	{
		System.out.println("�� �θ�2 �޼ҵ�3");
	}
}

class ClaChild extends ClaPar //, ClaPar2
{
	static int b = 2000;
	int a = 1000;
	
	int sa = super.a;
	//int ssa = super.sa;
	//int ssa = super.super.a;
	public ClaChild() {
		// TODO Auto-generated constructor stub
		super(b);
		System.out.println("�ڽ�������");
		
	}
	void meth_2()
	{
		System.out.println("�� �ڽ� �޼ҵ�2");
	}
	
	void meth_1()
	{
		System.out.println("�� �ڽ� �޼ҵ�1");
	}
	
	void meth_1_s()
	{
		super.meth_1();
	}
}

class ClaChild2 extends ClaPar 
{
	int c = 3000;
	void meth_2()
	{
		System.out.println("�� �ڽ�2 �޼ҵ�2");
	}
	
	public ClaChild2(int asdf) {
		// TODO Auto-generated constructor stub
		super(asdf);
	}
}
public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaChild cc = new ClaChild();
		ClaPar pp = new ClaPar(9012);
		
		System.out.println(pp.a);
		pp.meth_1();
		System.out.println(cc.a);
		System.out.println("cc.sa:"+cc.sa);
		System.out.println(cc.ssa);
		System.out.println(cc.d);
		//System.out.println(cc.c);
		//System.out.println(cc.super.a);
		cc.meth_1();
		cc.meth_1_s();
		
		//System.out.println(pp.b);
		//pp.meth_2();
		System.out.println(cc.b);
		cc.meth_2();
	}

}
