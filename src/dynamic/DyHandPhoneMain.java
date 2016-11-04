package dynamic;
class DyHandPhone
{
	Battery bat;
	String name;
	public DyHandPhone(Battery bat, String name) {
		super();
		this.bat = bat;
		this.name = name;
	}
	
	void gogogo()
	{
		bat.run();
	}
	
}

class DyAndroid extends DyHandPhone
{
	Camera cam;

	public DyAndroid(Rocket bat, String name, Camera cam) {
		super(bat, name);
		this.cam = cam;
	}
	
}

class DyAdult extends DyHandPhone
{
	

	public DyAdult(Misale bat, String name) {
		super(bat, name);
		
	}
	
}

class Battery
{
	void run()
	{}
}

class Rocket extends Battery
{
	void run()
	{
		System.out.println("난 터짐"); 
		
	}
}

class Misale extends Battery
{
	void run()
	{
		System.out.println("난 안 터짐"); 
		
	}
}
class Camera
{
	
}

public class DyHandPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DyHandPhone p1 = new DyAdult(new Misale(), "아이폰6S");
		DyHandPhone p2 = new DyAndroid(new Rocket(), "아이폰6S", new Camera());
		
		p1.gogogo();
		p2.gogogo();
	}

}
