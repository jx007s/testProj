package excep_p;

public class ExceptionMathodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("try 시작");
			
			/*Exception ex = new Exception();
			
			throw ex;*/
			throw new Exception("에러다 에러!!!");
			//System.out.println("try 끝");
		}catch(Exception e)
		{
			System.out.println("에러처리");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
