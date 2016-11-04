package dynamic;

abstract class AbsShape
{
	String name;

	public AbsShape(String name) {
		super();
		this.name = name;
	}

	void print()
	{
		System.out.println(name+"의 넓이:"+area());
	}
	
	abstract double area();
}

class AbsRec extends AbsShape
{
	int w, h;

	public AbsRec(int w, int h) {
		super("사각형");
		this.w = w;
		this.h = h;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return w*h;
	}
	
}


public class AbsShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsShape as = new AbsRec(4, 5);
		as.print();
	}

}
