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
			System.out.println("더이상 뒤로 갈 수가 없어요");
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
			System.out.println("더이상 앞으로 갈 수가 없어요");
	}
	
	void print()
	{
		System.out.println("현재:"+now);
		System.out.println("이전:"+back);
		System.out.println("다음:"+next);
	}
}
public class BrowserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUrl su = new StackUrl();
		su.goUrl("나베르");
		su.goUrl("나테");
		su.goUrl("....");
		su.goUrl("구그레");
		su.back();
		su.back();
		su.back();
		su.back();
		su.next();
		su.goUrl("KH정보교육원");
		/*su.next();
		su.next();
		su.next();
		su.next();*/
	}

}
