package pac.pac1;

import pac.pac2.DDD;
//import pac.pac2.EEE;
import pac.pac2.*;
import pac.pac1.sub.*;

class AAA
{
	int a = 10;
	private int b = 1212;
	int bb = b;
}

class ExFFF extends FFF
{
	int eXa = a;
	//int eXb = b;
	int eXc = c;
	int eXd = d;
}

public class PacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA p1AAA = new AAA();
		BBB p1BBB = new BBB();
		CCC p1CCC = new CCC();
		DDD p2DDD = new DDD();
		FFF p2FFF = new FFF();
		ExFFF p1ExF = new ExFFF();
		pac.pac1.DDD p1DDD= new pac.pac1.DDD();
		pac.pac2.BBB p2BBB = new pac.pac2.BBB();
		GGG subGGG = new GGG();
		
		System.out.println("p1AAA.a:"+p1AAA.a);
		//System.out.println("p1AAA.b:"+p1AAA.b);
		System.out.println("p1AAA.bb:"+p1AAA.bb);
		System.out.println("p1BBB.a:"+p1BBB.a);
		System.out.println("p1CCC.a:"+p1CCC.a);
		System.out.println("p2DDD.a:"+p2DDD.a);
		System.out.println("p2FFF.a:"+p2FFF.a);
		//System.out.println("p2FFF.b:"+p2FFF.b);
		System.out.println("p1ExF.a:"+p1ExF.a);
		//System.out.println("p1ExF.b:"+p1ExF.b);
		System.out.println("p1ExF.c:"+p1ExF.c);
		//System.out.println("p1ExF.d:"+p1ExF.d);
		System.out.println("p1ExF.eXd:"+p1ExF.eXd);
		System.out.println("p1DDD.a:"+p1DDD.a);
		System.out.println("p2BBB.a:"+p2BBB.a);
		System.out.println("subGGG.a:"+subGGG.a);
	}

}
