package dynamic;

class MovieReser
{
	String title;
	
	
	
	public MovieReser(String title) {
		super();
		this.title = title;
	}

	void reservation(int cnt)
	{
		
	}
}
class Adult extends MovieReser
{
	int age;

	public Adult(String title, int age) {
		super(title);
		this.age = age;
	}
	
	@Override
	void reservation(int cnt) {
		// TODO Auto-generated method stub
		System.out.println("���ο�ȭ:"+title+"("+age+")"+cnt +"���ſϷ�");
	}
}

class Solid extends MovieReser
{
	String kind;
	int height;
	public Solid(String title, String kind, int height) {
		super(title);
		this.kind = kind;
		this.height = height;
	}
	
	@Override
	void reservation(int cnt) {
		// TODO Auto-generated method stub
		System.out.println("��ü��ȭ:"+"("+kind+")"+title+cnt +"���ſϷ�");
	}
}

public class DyMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MovieReser [] arr = {
				 
				 new Adult("������ ����", 20),
				 new Solid("�̹㿡 ���� ���", "4D", 150)
		 };
		 
		 arr[0].reservation(3);
		 arr[1].reservation(2);
	}

}


///////////
//////�ڵ����� �����ؼ� �Ǹ��ϼ���
/// ������� : �ڵ��� ---> ��ȭ, �������, ���ͳ� 
///  ���Ÿ�� : �ȵ���̵���, ������, ms��
////  �ȵ���̵� - ���� ũ��, ���� �÷���, ��ź, ī�޶�
///   ������  - ����, �ȵ鸲, ī�޶�
///   ms�� - �ͽ��÷η�, ��������, ����, ���伥, ī�޶�







