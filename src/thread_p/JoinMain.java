package thread_p;

public class JoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaThread t1 = new ClaThread("+");
		ClaThread t2 = new ClaThread("-");
		ClaThread t3 = new ClaThread("/");
		
		t1.start();
		t2.start();
		try {
			t1.join(2000);
			t2.join(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
	}

}
