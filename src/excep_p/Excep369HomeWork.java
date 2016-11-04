package excep_p;

public class Excep369HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=100; i++)
		{
			
			int ten = i/10;
			int one = i%10;
			 
			int tenZZ = 1, oneZZ=1;
			String str = "";
			try {
				int a = 1234/(ten%3);
			} catch (Exception e) {
				// TODO: handle exception
				
				try {
					int a = 1234/(ten);
					tenZZ = 0;
					str+="¦";
				} catch (Exception ee) {
					// TODO: handle exception		
				}
			}
			
			try {
				int a = 1234/(one%3);
			} catch (Exception e) {
				// TODO: handle exception
				try {
					int a = 1234/(one);
					oneZZ = 0;
					str+="¦";
				} catch (Exception ee) {
					// TODO: handle exception	
				}				
			}

			try {
				int a = 1234/(tenZZ*oneZZ);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
				
				System.out.println(str);
			}
			
		}
	}

}
