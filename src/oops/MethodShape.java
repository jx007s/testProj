package oops;
class MeShape
{
	String name;
	double pi = 3.14, area, border;
	
	
	void rec(int w, int h)
	{
		name="사각형";
		area = w*h;
		border = (w+h)*2;
		print();
	}
	
	void cir(int r)
	{
		name="원";
		area = pi*r*r;
		border = pi*2*r;
		print();
	}
	void print()
	{
		System.out.println(name+"의 넓이:"+area);
		System.out.println(name+"의 둘레:"+border);
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
