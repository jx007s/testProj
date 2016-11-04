package thread_p;
class ClaThread extends Thread
{
	
	
	public ClaThread(String ch) {
		super(ch);
		
	}

	public void run()
	{
		for (int i = 0; i < 30; i++) {
			
			try {
				System.out.print(getName());
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ClaThread2 implements Runnable
{
	char ch;
	
	public ClaThread2(char ch) {
		super();
		this.ch = ch;
	}

	public void run()
	{
		for (int i = 0; i < 30; i++) {
			
			try {
				System.out.print(ch);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaThread t1 = new ClaThread("+");
		ClaThread t2 = new ClaThread("-");
		Runnable r1 = new ClaThread2('#');
		Thread tt = new Thread(r1);
		//int a = 10/0;
		
		
		t1.start();
		t2.start();
		//r1.start();
		tt.start();
		System.out.println(Thread.activeCount());
	}

}
