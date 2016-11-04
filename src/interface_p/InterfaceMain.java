package interface_p;
interface In_1{
	int a = 10;
	
	/*void meth_1()
	{
		
	}*/
	
	void meth_1();
	String meth_2(int a);
}

interface In_2{
	int a = 10000;
	int b = 20000;
	void meth_1();
	void meth_3();
}

class In_1Impl implements In_1, In_2
{
	int aa;
	int a = 48576;
	int a1 = In_1.a;
	int a2 = In_2.a;
	
	public In_1Impl(int aa) {
		super();
		this.aa = aa;
		//In_1.a = 123456;
		//In_2.a = 987654;
	}

	@Override
	public void meth_1() {
		// TODO Auto-generated method stub
		System.out.println("In_1Impl 재정의한 meth_1:"+aa);
	}
	
	@Override
	public String meth_2(int a) {
		// TODO Auto-generated method stub
		System.out.println("In_1Impl 재정의한 meth_2:"+a);
		return null;
	}
	
	@Override
	public void meth_3() {
		// TODO Auto-generated method stub
		System.out.println("In_1Impl 재정의한 meth_3:"+aa);
	}
}
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		In_1 ii1 = new In_1() {
			
			@Override
			public String meth_2(int a) {
				// TODO Auto-generated method stub
				System.out.println("생성시 재정의한 meth_2:"+a);
				return "메소드 연기2";
			}
			
			@Override
			public void meth_1() {
				// TODO Auto-generated method stub
				System.out.println("생성시 재정의한 meth_1:");
			}
		};
		
		ii1.meth_1();
		ii1.meth_2(100);
		
		System.out.println(ii1.a);
		
		In_1Impl impl = new In_1Impl(1234);
		System.out.println(impl.a);
		System.out.println(impl.aa);
		System.out.println(impl.b);
		System.out.println(impl.a1);
		System.out.println(impl.a2);
		impl.meth_1();
		impl.meth_2(4567);
		impl.meth_3();
		
		ii1 = impl;
		
		ii1.meth_1();
		ii1.meth_2(9876);
		//ii1.meth_3();
		
		In_2 ii2 = impl;
		//ii2.b = 23456;
		System.out.println(ii2.a);
		System.out.println(ii2.b);
		ii2.meth_1();
		//ii2.meth_2(9876);
		ii2.meth_3();
	}

}
