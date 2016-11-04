package oops;
class ClaRet
{
	int meth_1()
	{
		System.out.println("meth_1() �Դϴ�.");
		return 10;
	}
	int meth_2(int a, int b)
	{
		System.out.println("meth_2() �Դϴ�.");
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
		
		/// �� ���� �μ��� ����Ͽ� �μ� ������ ���� �հ踦 �����ϴ� �޼ҵ带 ���弼��
		System.out.println(cr.sum(5,55));
		
		System.out.println(cr.retArr(10, 20, 30)[0]);
		
		RetAAA a1 = cr.retAAA(10,"�ɷ��ɷ��ɷ�");
		a1.print();
		
		RetAAA [] arr = {
				cr.retAAA(20,"��η�"),
				cr.retAAA(30,"����"),
				cr.retAAA(40,"���η�"),
				cr.retAAA(50,"Ÿ����")
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
	}

}
