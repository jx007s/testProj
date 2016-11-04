package collection;

import java.util.Stack;

class StackUrl
{
	Stack back = new Stack();
	Stack next = new Stack();
	String now =null;
	
	void goUrl(String url)
	{
		if(now!=null)
			back.push(now);
		
		next.clear();
		now = url;
		System.out.println("=================goUrl("+url+")");
		print();
	}
	
	void back()
	{
		System.out.println("=================back()");
		
		if(!back.empty())
		{
			next.push(now);
			
			now = (String)back.pop();
			
			print();
		}else
			System.out.println("���̻� �ڷ� �� ���� �����");
	}
	
	void next()
	{
		System.out.println("=================next()");
		
		if(!next.empty())
		{
			back.push(now);
			
			now = (String)next.pop();
			
			print();
		}else
			System.out.println("���̻� ������ �� ���� �����");
	}
	
	void print()
	{
		System.out.println("����:"+now);
		System.out.println("����:"+back);
		System.out.println("����:"+next);
	}
}
public class BrowserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUrl su = new StackUrl();
		su.goUrl("������");
		su.goUrl("����");
		su.goUrl("....");
		su.goUrl("���׷�");
		su.back();
		su.back();
		su.back();
		su.back();
		su.next();
		su.goUrl("KH����������");
		/*su.next();
		su.next();
		su.next();
		su.next();*/
	}

}
