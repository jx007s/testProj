package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		Queue qq = new LinkedList<>();
		
		ss.push(1);
		ss.push(2);
		ss.push(3);
		
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		
		System.out.println(ss);
		System.out.println(qq);
		
		while(!ss.empty())
		{
			System.out.println(ss.pop());
		}
		System.out.println();
		while(!qq.isEmpty())
		{
			System.out.println(qq.poll());
		}
	}

}
