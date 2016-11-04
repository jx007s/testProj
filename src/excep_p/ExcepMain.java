package excep_p;

public class ExcepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int a = 10/2;
			int [] arr = {1,2,3};
			System.out.println("중간처리");
			try {
				int b = 100/0;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("try~try 에러처리");
			}
			
			
			int b;
			
			System.out.println(arr[10]);
			
			System.out.println("정상종료");
		}
		
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("인덱스 에러처리");
		}*/
		catch(Exception e)
		{
			try {
				int b = 100/0;
			} catch (Exception e1) {
				// TODO: handle exception
				System.out.println("catch~try 에러처리");
			}
			System.out.println("에러처리");
			return;
		}finally{
			System.out.println("시스템 종료");
		}
		
		
		
	}

}
