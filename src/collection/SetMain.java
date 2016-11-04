package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set ss = new HashSet<>();
		List ll = new ArrayList<>();
		
		for (int i = 0; i <10; i++) {
			int buf = (int)(Math.random()*20);
			System.out.print(buf+",");
			ss.add(buf);
			ll.add(buf);
		}
		System.out.println();
		System.out.println(ss);
		System.out.println(ll);
		
		
		List lotto1 = new ArrayList<>();
		Set lotto2 = new HashSet<>();
		
		while(true)
		{
			if(lotto1.size()==7)
				break;
			
			lotto1.add((int)(Math.random()*45)+1);
		}
		
		while(true)
		{
			if(lotto2.size()==7)
				break;
			
			lotto2.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(lotto1);
		System.out.println(lotto2);
		
		Iterator it = lotto2.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		


		 
	}

}
