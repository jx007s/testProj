package excep_p;
class ClaReThrow
{
	void meth_1() throws Exception
	{
		System.out.println("  meth_1() 시작");
		try {
			meth_2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\tmeth_1예외처리:"+e.getMessage());
			throw e;		///re~ throwing
		}
		System.out.println("  meth_1() 끝");
	}
	void meth_2() throws Exception
	{
		System.out.println("\tmeth_2() 시작");
		try {
			throw new Exception("meth_2에서 발생");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\t\tmeth_2예외처리:"+e.getMessage());
			throw e;		///re~ throwing
		}
		//System.out.println("\tmeth_2() 끝");
	}
}
public class ReThrowMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ClaReThrow ct = new ClaReThrow();
		System.out.println("메인시작");
	//	try {
			ct.meth_1();
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	System.out.println("메인 예외처리:"+e.getMessage());
		//}
		System.out.println("메인끝");
	}

}
