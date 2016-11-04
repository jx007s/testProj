package util_p;

class ClaSSS
{
	static ClaSSS me;
	
	int a;
	String b;
	
	private ClaSSS() {
		// TODO Auto-generated constructor stub
		System.out.println("»ý¼ºÀÚ");
	}
	
	static ClaSSS getInstance()
	{
		if(me==null)
			me = new ClaSSS();
		
		return me;
	}
}

public class SSS {

	public static void main(String[] args) {
		
		ClaSSS cs1 = ClaSSS.getInstance();
		ClaSSS cs2 = ClaSSS.getInstance();
		
		cs1.a = 100;
		cs2.a = 200;
		System.out.println(cs1.a);
		System.out.println(cs2.a);
	}
}
