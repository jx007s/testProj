package excep_p;

public class ExceptionMathodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("try ����");
			
			/*Exception ex = new Exception();
			
			throw ex;*/
			throw new Exception("������ ����!!!");
			//System.out.println("try ��");
		}catch(Exception e)
		{
			System.out.println("����ó��");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
