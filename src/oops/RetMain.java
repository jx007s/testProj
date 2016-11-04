package oops;
class ClaRet
{
	int meth_1()
	{
		System.out.println("meth_1() 입니다.");
		return 10;
	}
	int meth_2(int a, int b)
	{
		System.out.println("meth_2() 입니다.");
		return a+b;
	}
	int sum(int a, int b)
	{
		int first = a, end = b;
		if(a>b)
		{
			first = b; end = a;
		}
		int sum =0;
		for (int i = first; i <=end; i++) {
			sum +=i;
		}
		
		return sum;
	}
	
	int [] retArr(int a, int b, int c)
	{
		return new int[]{a, b, c};
	}
	
	RetAAA retAAA(int a, String str)
	{
		RetAAA ret = new RetAAA();
		/*ret.a = a;
		ret.str = str;*/
		ret.init(a, str);
		return ret;
	}
}

class RetAAA
{
	int a;
	String str;
	
	void init(int a, String str)
	{
		this.a = a;
		this.str = str;
	}
	
	void print()
	{
		String sss = a+","+str;
		System.out.println(sss);
	}
}

public class RetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaRet cr = new ClaRet();
		System.out.println(cr.meth_1());
		System.out.println(cr.meth_2(10,20));
		
		/// 두 수를 인수로 사용하여 두수 사이의 누적 합계를 리턴하는 메소드를 만드세요
		System.out.println(cr.sum(5,55));
		
		System.out.println(cr.retArr(10, 20, 30)[0]);
		
		RetAAA a1 = cr.retAAA(10,"케로케로케로");
		a1.print();
		
		RetAAA [] arr = {
				cr.retAAA(20,"기로로"),
				cr.retAAA(30,"쿠루루"),
				cr.retAAA(40,"도로로"),
				cr.retAAA(50,"타마마")
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
	}

}
