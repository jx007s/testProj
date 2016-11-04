package dynamic;

abstract class AbsPar
{
	int a = 10;
	//abstract int b;
	
	void meth_1()
	{
		System.out.println("난 부모 일반 메소드_1");
	}
	
	abstract void meth_2();
	
}

class AbsChild extends AbsPar
{
	@Override
	void meth_2() {
		// TODO Auto-generated method stub
		System.out.println("난 자식이 재정의한 추상 메소드_2");
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsPar pp = new AbsPar(){
			@Override
			void meth_2() {
				// TODO Auto-generated method stub
				System.out.println("생성시 재정의한 meth_2()");
			}
		};
		AbsChild cc = new AbsChild();
		
		System.out.println(pp.a);
		pp.meth_1();
		pp.meth_2();
		
		System.out.println(cc.a);
		cc.meth_1();		
		cc.meth_2();
		
		pp = cc;
		System.out.println(pp.a);
		pp.meth_1();
		pp.meth_2();
	}

}
