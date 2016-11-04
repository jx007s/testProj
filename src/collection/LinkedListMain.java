package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	static void add_1(String name, List list)
	{
		long start = System.currentTimeMillis();
		for (int i = 0; i <2000000; i++) {
			list.add(100);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println(name+" 순차 추가:"+time);
	}
	
	static void add_2(String name, List list)
	{
		long start = System.currentTimeMillis();
		for (int i = 0; i <5000; i++) {
			list.add(500,100);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println(name+" 비순차 추가:"+time);
	}
	
	static void remove_1(String name, List list)
	{
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i >=0; i--) {
			list.remove(i);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println(name+" 순차 삭제:"+time);
	}
	
	static void remove_2(String name, List list)
	{
		long start = System.currentTimeMillis();
		for (int i = 0; i <5000; i++) {
			list.remove(100);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println(name+" 비순차 삭제:"+time);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList<>();
		LinkedList ll = new LinkedList<>();
		
		add_1("ar",ar);
		add_1("ll",ll);
		
		add_2("ar",ar);
		add_2("ll",ll);
		
		remove_2("ar",ar);
		remove_2("ll",ll);
		
		remove_1("ar",ar);
		remove_1("ll",ll);
	}

}
