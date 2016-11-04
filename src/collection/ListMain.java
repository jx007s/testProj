package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li_1 = new ArrayList();
		li_1.add("선생님은");
		li_1.add("귀여워요");
		li_1.add(1);
		li_1.add(true);
		li_1.add(new ArrayList<>());
		li_1.add(new int[]{1,2,3,4});
		li_1.add(true);
		li_1.add(2,"asdf");
		li_1.add(true);
		
		System.out.println(li_1);
		li_1.set(5, "정우성");
		System.out.println(li_1);
		li_1.remove(2);
		System.out.println(li_1);
		
		System.out.println(li_1.get(1));
		((int [])(li_1.get(5)))[2] = 300;
		System.out.println(Arrays.toString((int [])(li_1.get(5))));
		System.out.println(li_1.size());
		System.out.println(li_1.indexOf(true));
		System.out.println(li_1.lastIndexOf(true));
		
		
		List li_2 = li_1.subList(2, 5);
		List li_3 = new ArrayList(li_1.subList(2, 5));
		System.out.println(li_2);
		
		System.out.println(li_2 == li_3);
		System.out.println(li_2.equals(li_3));
		
		
		li_2.set(1, "케로케로케로");
		li_3.add("타마마");
		System.out.println(li_1);
		System.out.println(li_2);
		System.out.println(li_3);
		
		System.out.println(li_1.contains("정우성"));
		System.out.println(li_1.contains("감우성"));
		
		//li_1.removeAll(li_2);
		li_1.retainAll(li_3);
		System.out.println(li_1);
	}

}
