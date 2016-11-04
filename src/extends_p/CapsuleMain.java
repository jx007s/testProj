package extends_p;
class Cap
{
	private int abc;
	/*public void setAbc(int abc)
	{
		this.abc = abc;
	}
	public int getAbc()
	{
		return abc;
	}*/

	public int getAbc() {
		return abc;
	}

	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	
}
public class CapsuleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cap cc = new Cap();
		cc.setAbc(100);
		//cc.abc = 100;
		//System.out.println(cc.abc);
		System.out.println(cc.getAbc());
	}

}
