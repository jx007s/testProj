package excep_p;

public class Excep369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=20; i++) {
			int one = i%10;
			try {
				int a = 10/(one%3);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
				try {
					int a = 10/(one%10);
					System.out.println("짝");
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(i);
				}
				
			}
		}
	}

}
