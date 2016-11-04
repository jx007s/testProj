package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
class MyCom implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//System.out.println(o1+","+o2);
		int com1 = (int)o1;
		int com2 = (int)o2;
		return com2-com1;
	}
}
public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s1 = new HashSet<>();
		Set s2 = new LinkedHashSet();
		TreeSet s3 = new TreeSet<>();
		TreeSet s4 = new TreeSet<>(new MyCom());
		
		Object [] arr = {
				34,5,66,1,89,1,432,//"asq",
				//'1','a',
				34//,345.678
		};
		
		for (Object obj : arr) {
			s1.add(obj);
			s2.add(obj);
			s3.add(obj);
			s4.add(obj);
			//System.out.println("µ·´Ù");
		}
		
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		System.out.println("s4"+s4);
		System.out.println(s3.first());
		System.out.println(s3.last());
		System.out.println(s3.headSet(66));
		System.out.println(s3.tailSet(66));
	}

}
