package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList  list = new ArrayList<>();
		//list.add("asd");
		list.add(16);
		//list.add(true);
		list.add(56);
		list.add(77);
		list.add(90);
		list.add(12);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			int buf = (int)it.next();
			//if(buf%2==0)
			System.out.println(buf);
		}
		
		//it.next();
		System.out.println();
		
		/*while(it.hasPrevious())
		{
			System.out.println("후진:"+it.previous());
		}*/
		
		/*it = list.iterator();
		
		while(it.hasNext())
		{
			int buf = (int)it.next();
			if(buf%2==0)
			System.out.println(buf);
		}*/
		
		ListIterator lit = list.listIterator();
		while(lit.hasPrevious())
		{
			System.out.println("후진:"+lit.previous());
		}
		System.out.println();
		while(lit.hasNext())
		{
			System.out.println("전진:"+lit.next());
		}
		
		
		
	}

}
