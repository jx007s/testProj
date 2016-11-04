package thread_p;

class Pri extends Thread
{
	public Pri(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
		}
	}
}
public class PriorityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pri p1 = new Pri("+");
		Pri p2 = new Pri("-");
		p1.setPriority(1);
		p2.setPriority(10);
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		p1.start();
		p2.start();
		
		
	}

}
