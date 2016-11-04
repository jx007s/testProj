package oops;

class ClaStatic
{
	int a = c;
	int b = 20;
	static int c = 30;
}
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ClaStatic.c);
		 ClaStatic cs1 = new ClaStatic();
		 ClaStatic cs2 = new ClaStatic();
		 
		 System.out.println(cs1.a);
		 System.out.println(cs1.b);
		 System.out.println(cs1.c);
		 System.out.println();
		 System.out.println(cs2.a);
		 System.out.println(cs2.b);
		 System.out.println(cs2.c);
		 
		 cs1.a = 1000;
		 cs1.c = 3000;
		 ClaStatic.c=3333;
		 System.out.println();
		 System.out.println(cs1.a);
		 System.out.println(cs1.b);
		 System.out.println(cs1.c);
		 System.out.println();
		 System.out.println(cs2.a);
		 System.out.println(cs2.b);
		 System.out.println(cs2.c);
		 
	}

}
