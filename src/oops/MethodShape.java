package oops;
class MeShape
{
	String name;
	double pi = 3.14, area, border;
	
	
	void rec(int w, int h)
	{
		name="�簢��";
		area = w*h;
		border = (w+h)*2;
		print();
	}
	
	void cir(int r)
	{
		name="��";
		area = pi*r*r;
		border = pi*2*r;
		print();
	}
	void print()
	{
		System.out.println(name+"�� ����:"+area);
		System.out.println(name+"�� �ѷ�:"+border);
	}
}
public class MethodShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeShape ms = new MeShape();
		ms.rec(4, 5);
		ms.cir(5);
		//ms.print();
	}

}
