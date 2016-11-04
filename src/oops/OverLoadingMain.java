package oops;
class ClaOver
{
	void method(int a, String b)
	{
		System.out.println("내가 원본이다.");
	}
	
	void method(int a)
	{
		System.out.println("인수의 갯수가 다르다");
	}
	void method(int a, int b)
	{
		System.out.println("인수의 자료형이 다르다");
	}
	void method(String a, int b)
	{
		System.out.println("인수의 순서가 다르다");
	}
	
	/*void method(int a, String c)
	{
		System.out.println("인수의 이름은 오버로딩에 영향을 주지 않는다.");
	}
	int method(int a, String b)
	{
		System.out.println("리턴형과 오버로딩은 아무런 상관이 없다.");
	}*/
	
}
public class OverLoadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaOver co = new ClaOver();
		
		co.method(10, "메롱");
		co.method(10);
		co.method(10,20);
		co.method("메롱",10);
	}

}
