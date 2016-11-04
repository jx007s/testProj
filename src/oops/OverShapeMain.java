package oops;
class OverShape
{
	String name;
	double area, border,pi = 3.14;
	void init(int w, int h)
	{
		name = "사각형";
		area = w*h;
		border = 2*(w+h);
		print();
	}
	
	void init(int r)
	{
		name = "원";
		area = pi*r*r;
		border = pi*r*2;
		print();
	}
	
	void print()
	{
		System.out.println(name+"의 넓이:"+area);
		System.out.println(name+"의 둘레:"+border);
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
