package excep_p;

public class ExcepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int a = 10/2;
			int [] arr = {1,2,3};
			System.out.println("�߰�ó��");
			try {
				int b = 100/0;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("try~try ����ó��");
			}
			
			
			int b;
			
			System.out.println(arr[10]);
			
			System.out.println("��������");
		}
		
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�ε��� ����ó��");
		}*/
		catch(Exception e)
		{
			try {
				int b = 100/0;
			} catch (Exception e1) {
				// TODO: handle exception
				System.out.println("catch~try ����ó��");
			}
			System.out.println("����ó��");
			return;
		}finally{
			System.out.println("�ý��� ����");
		}
		
		
		
	}

}
