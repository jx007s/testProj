package oops;
class OverShape
{
	String name;
	double area, border,pi = 3.14;
	void init(int w, int h)
	{
		name = "�簢��";
		area = w*h;
		border = 2*(w+h);
		print();
	}
	
	void init(int r)
	{
		name = "��";
		area = pi*r*r;
		border = pi*r*2;
		print();
	}
	
	void print()
	{
		System.out.println(name+"�� ����:"+area);
		System.out.println(name+"�� �ѷ�:"+border);
	}
}
public class OverShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverShape os = new OverShape();
		os.init(4, 5);
		os.init(5);
	}

}
