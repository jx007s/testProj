package excep_p;
class ClaReThrow
{
	void meth_1() throws Exception
	{
		System.out.println("  meth_1() ����");
		try {
			meth_2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\tmeth_1����ó��:"+e.getMessage());
			throw e;		///re~ throwing
		}
		System.out.println("  meth_1() ��");
	}
	void meth_2() throws Exception
	{
		System.out.println("\tmeth_2() ����");
		try {
			throw new Exception("meth_2���� �߻�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\t\tmeth_2����ó��:"+e.getMessage());
			throw e;		///re~ throwing
		}
		//System.out.println("\tmeth_2() ��");
	}
}
public class ReThrowMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ClaReThrow ct = new ClaReThrow();
		System.out.println("���ν���");
	//	try {
			ct.meth_1();
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	System.out.println("���� ����ó��:"+e.getMessage());
		//}
		System.out.println("���γ�");
	}

}
