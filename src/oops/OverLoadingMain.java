package oops;
class ClaOver
{
	void method(int a, String b)
	{
		System.out.println("���� �����̴�.");
	}
	
	void method(int a)
	{
		System.out.println("�μ��� ������ �ٸ���");
	}
	void method(int a, int b)
	{
		System.out.println("�μ��� �ڷ����� �ٸ���");
	}
	void method(String a, int b)
	{
		System.out.println("�μ��� ������ �ٸ���");
	}
	
	/*void method(int a, String c)
	{
		System.out.println("�μ��� �̸��� �����ε��� ������ ���� �ʴ´�.");
	}
	int method(int a, String b)
	{
		System.out.println("�������� �����ε��� �ƹ��� ����� ����.");
	}*/
	
}
public class OverLoadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaOver co = new ClaOver();
		
		co.method(10, "�޷�");
		co.method(10);
		co.method(10,20);
		co.method("�޷�",10);
	}

}
