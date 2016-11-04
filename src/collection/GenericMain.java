package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Phone
{
	int a = 10;
}
class Galaxy extends Phone
{
	String str = "ÀÌ»Ú´Ï?";
}
class IPhone
{
	double dd = 123.456;
}


public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar1 = new ArrayList();
		ArrayList<Phone> ar2 = new ArrayList();
		ArrayList<Galaxy> ar3 = new ArrayList();
		ArrayList<IPhone> ar4 = new ArrayList();
		
		ar1.add("¿äÁ¶¼÷³à Á¤Áö¿µ");
		ar1.add(new Phone());
		ar1.add(new Galaxy());
		ar1.add(new IPhone());
		
		((Phone)ar1.get(1)).a=100;
		
		//ar2.add("¿äÁ¶¼÷³à Á¤Áö¿µ");
		ar2.add(new Phone());
		ar2.add(new Galaxy());
		//ar2.add(new IPhone());
		System.out.println(ar2.get(0).a);
		System.out.println(ar2.get(1).a);
		//System.out.println(ar2.get(1).str);
		
		
		//ar3.add("¿äÁ¶¼÷³à Á¤Áö¿µ");
		//ar3.add(new Phone());
		ar3.add(new Galaxy());
		//ar3.add(new IPhone());
		System.out.println(ar3.get(0).a);
		System.out.println(ar3.get(0).str);
		
		
		//ar4.add("¿äÁ¶¼÷³à Á¤Áö¿µ");
		//ar4.add(new Phone());
		//ar4.add(new Galaxy());
		ar4.add(new IPhone());
		System.out.println(ar4.get(0).dd);
		
		meth_1(ar1);
		meth_1(ar2);
		meth_1(ar3);
		meth_1(ar4);
		System.out.println();
		//meth_2(ar1);
		meth_2(ar2);
		//meth_2(ar3);
		//meth_2(ar4);
		
		System.out.println();
		//meth_3(ar1);
		//meth_3(ar2);
		meth_3(ar3);
		//meth_3(ar4);
		
		System.out.println();
		//meth_22(ar1);
		meth_22(ar2);
		meth_22(ar3);
		//meth_22(ar4);
		
		
		Iterator<Phone> it = ar2.iterator();
		//it = ar3.iterator();
		
		Iterator<? extends Phone> it2 = ar2.iterator();
		it2 = ar3.iterator();
	}
	
	static void meth_1(ArrayList list)
	{
		System.out.println("±âº»:"+list);
	}
	
	static void meth_2(ArrayList<Phone> list)
	{
		System.out.println("Phone:"+list.get(0).a);
		System.out.println("Phone:"+list.get(1).a);
	}
	
	static void meth_22(ArrayList<? extends Phone> list)
	{
		System.out.println("Phone È®Àå:"+list.get(0).a);
	}
	
	static void meth_3(ArrayList<Galaxy> list)
	{
		System.out.println("Galaxy:"+list.get(0).str);
	}
	
	
	
}
