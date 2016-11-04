package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ori = new ArrayList<>();
		ArrayList odd = new ArrayList<>();
		ArrayList even = new ArrayList<>();
		
		for (int i = 0; i <10; i++) {
			ori.add((int)(Math.random()*100)+1);
		}
		Iterator it = ori.iterator();
		while(it.hasNext())
		{
			int buf = (int)it.next();
			ArrayList list = odd;
			if(buf%2==0)
				list = even;
			
			list.add(buf);
		}
		System.out.println("¿øº»:"+ori);
		System.out.println("È¦¼ö:"+odd);
		System.out.println("Â¦¼ö:"+even);
	}

}
