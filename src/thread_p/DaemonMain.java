package thread_p;

class DaeMonnn extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				sleep(3000);
				System.out.println("�ڵ�����");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Dae extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				sleep(1000);
				System.out.println("������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class DaemonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaeMonnn nnn = new DaeMonnn();
		//new Dae().start();
		
		nnn.setDaemon(true);
		
		nnn.start();
		
		
		for (int i = 0; i <10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
