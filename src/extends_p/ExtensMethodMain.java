package extends_p;
class EMPar
{
	int a = setA();
	
	int setA()
	{
		System.out.println("부모 setA()");
		return 10;
	}
	
	public EMPar() {
		// TODO Auto-generated constructor stub
		System.out.println("부모생성자:"+a);
	}
			
}
class EMChild extends EMPar
{
	int a = 10000;
	
	int setA()
	{
		System.out.println("자식 setA()");
		return a;
	}
}
public class ExtensMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EMChild cc = new EMChild();
	}

}
