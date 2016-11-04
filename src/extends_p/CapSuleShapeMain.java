package extends_p;

class CapShape
{
	private String name;
	private double area, border;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public double getBorder() {
		return border;
	}

	public CapShape(String name,double area) {
		super();
		this.name = name;
		this.area = area;
	}

	void print()
	{
		System.out.println(name+"의 넓이:"+area);
		System.out.println(name+"의 둘레:"+ border);
	}
}

class CapRec extends CapShape
{
	private int [] data;
	
	public CapRec(int w, int h) {
		// TODO Auto-generated constructor stub
		super("사각형",w*h);
		//area = w*h;
		print();
		data = new int[]{w, h};
	}

	public int getData(int cnt) {
		return data[cnt];
	}
	
	
}

class CapCir extends CapShape
{
	double pi = 3.14;
	public CapCir( int r) {
		// TODO Auto-generated constructor stub
		super("원",r*r*3.14);
		//area = r*r*pi;
		print();
	}
}


public class CapSuleShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapRec er = new CapRec(4, 5);
		CapCir ec = new CapCir(5);
		
		er.setName("직사각형");
		
		System.out.println(er.getArea());
		System.out.println(er.getName());
		
		/*er.getData()[0] = 444;
		System.out.println(er.getData()[0]);
		System.out.println(er.getData()[1]);*/
		System.out.println(er.getData(0));
		
	}

}
