package oops;
class ConsShape
{
	String name;
	double pi = 3.14;
	double area;
	
	public ConsShape(int w,int h) {
		// TODO Auto-generated constructor stub
		name = "�簢��";
		area = w*h;
		//print();
	}
	
	public ConsShape(int r) {
		// TODO Auto-generated constructor stub
		name = "��";
		area = r*r*pi;
		//print();
	}
	
	void print()
	{
		System.out.println(name+"�� ����:"+area);
	}
}
public class ConstructorShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConsShape cs = new ConsShape(4, 5);
		//cs.print();
		ConsShape [] arr ={
			new ConsShape(4, 5),
			new ConsShape(5)
		};
	}

}
