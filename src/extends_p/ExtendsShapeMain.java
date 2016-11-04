package extends_p;

class ExShape
{
	String name;
	double area, border;
	
	public ExShape(String name) {
		super();
		this.name = name;
	}

	void print()
	{
		System.out.println(name+"�� ����:"+area);
		System.out.println(name+"�� �ѷ�:"+ border);
	}
}

class ExRec extends ExShape
{
	public ExRec(int w, int h) {
		// TODO Auto-generated constructor stub
		super("�簢��");
		area = w*h;
		print();
	}
}

class ExCir extends ExShape
{
	double pi = 3.14;
	public ExCir( int r) {
		// TODO Auto-generated constructor stub
		super("��");
		area = r*r*pi;
		print();
	}
}


public class ExtendsShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExRec er = new ExRec(4, 5);
		ExCir ec = new ExCir(5);
	}

}
