package thread_p;
class SRS extends Thread
{
	public SRS(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				sleep(1000);
				System.out.println(getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SRSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SRS t1 = new SRS("*");
		SRS t2 = new SRS("**");
		SRS t3 = new SRS("***");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend();
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(2000);
			t1.resume();
			Thread.sleep(2000);
			t1.stop();
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
			
			t1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
