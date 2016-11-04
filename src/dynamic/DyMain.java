package dynamic;
class DyPar
{
	int a = 10;
	int b = 20;
	
	void meth_1()
	{
		System.out.println("부모메소드_1():"+a);
	}
	
	static void methSt()
	{
		System.out.println("경미오빠 왜 눈치봐");
	}
}

class DyPP
{
	int a = 10;
	int b = 20;
	
	void meth_1()
	{
		System.out.println("부모메소드_1():"+a);
	}
	
	static void methSt()
	{
		System.out.println("경미오빠 왜 눈치봐");
	}
}

class DyChild1 extends DyPar
{
	int c = 3000;
	void meth_2()
	{
		System.out.println("자식1 메소드2()");
	}
	void meth_1()
	{
		System.out.println("자식1 메소드1():"+a+c);
	}
	static void methSt()
	{
		System.out.println("대호야 경미가 눈치 봐");
	}
}

class DyChild2 extends DyPar
{
	int c = 333333;
	int d = 444444;
	void meth_1()
	{
		System.out.println("자식2 메소드1():"+a+d);
	}
	void meth_2()
	{
		System.out.println("자식2 메소드2()");
	}
	void meth_3()
	{
		System.out.println("자식2 메소드3()");
	}
}
public class DyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DyPar pp = new DyPar();
		DyPar pc = new DyChild1();
		//DyChild1 cp = new new DyPar();
		DyChild1 cc = new DyChild1();
		DyChild2 cc2 = new DyChild2();
		cc.methSt();
		cc2.methSt();
		
		System.out.println("pp.a:"+pp.a);
		//System.out.println(pp.c);
		
		System.out.println("pc.a:"+pc.a);
		//System.out.println("pc.c:"+pc.c);
		
		cc.c = 3456;
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.c:"+cc.c);
		DyPar pcc = cc;
		
		System.out.println("pcc.a:"+pcc.a);
		//System.out.println("pcc.c:"+pcc.c);
		
		DyChild1 cpcc = (DyChild1)pcc;
		System.out.println("cpcc.a:"+cpcc.a);
		System.out.println("cpcc.c:"+cpcc.c);
		
		pc = new DyChild2();
		System.out.println(pc.a);
		pc.meth_1();
		
		pc = new DyChild1();
		System.out.println(pc.a);
		pc.meth_1();
		
		
		pc = new DyPar();
		System.out.println(pc.a);
		pc.meth_1();
		
		DyPar [] arr = {
				new DyChild2(),
				new DyChild1(),
				new DyPar()
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].meth_1();
			arr[i].methSt();
		}
		
		
		//DyChild1 cp = (DyChild1)pp;
		
		System.out.println(pp instanceof DyChild1);
		
		System.out.println(cc instanceof DyChild1);
		
		System.out.println(cc instanceof DyPar);
		
		//System.out.println(cc instanceof DyPP);
		
		
	}

}
