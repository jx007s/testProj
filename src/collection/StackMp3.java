package collection;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

class StMp3
{
	String [] data;
	int num;
	public StMp3(int num, String singer, String title) {
		
		this.num = num;
		data = new String[]{singer, title};
	}
	@Override
	public String toString() {
		return num + ":" + Arrays.toString(data);
	}
	
}
class Mp3Player
{
	Stack bb = new Stack();
	Stack nn = new Stack();
	StMp3 now = null;
	
	boolean back()
	{
		boolean res = !bb.empty();
		if(res)
		{
			if(now!=null)
				nn.push(now);
			
			now = (StMp3)bb.pop();
	
		}
		
		return res;
	}

	void backTr()
	{
		System.out.println("==============back");
		
		if(back())
			print();
		else
			System.out.println("�������� �����ϴ�.");
	}
	
	boolean next()
	{
		boolean res = !nn.empty();
		if(res)
		{
			if(now!=null)
				bb.push(now);
			
			now = (StMp3)nn.pop();
	
		}
		
		return res;
	}

	void nextTr()
	{
		System.out.println("==============next");
		
		if(next())
			print();
		else
			System.out.println("�������� �����ϴ�.");
	}
	
	void goTr(int no)
	{
		
		System.out.println("==============goTr("+no+")");
		
		if(go(no))
			print();
		else
			System.out.println("�� ��ȣ�� �̻��մϴ�.");
	}
	
	
	
	boolean go(int no)
	{
		int curr = now.num;
		
		
		if(now.num<no)
		{
			while(next())
			{
				if(now.num==no)
				{	
					return true;
				}
			}
		}else if(now.num>no)
		{
			while(back())
			{
				if(now.num==no)
				{
					return true;
				}
			}
		}else{
			
			return false;
		}

		go(curr);
		return false;
	}
	
	void sch(int kind, String str)
	{
		int curr = now.num;
		String [] pp = {
				"[��-��]",
				"[��-��]",
				"[��-�L]",
				"[��-��]",
				"[��-�J]",
				"[��-��]",
				"[��-��]",
				"[��-��]",
				"[��-��]",
				"[��-��]",
				"[ī-�i]",
				"[Ÿ-�M]",
				"[��-��]",
				"[��-�R]"};
		
		String ppStr=str;
		if(Pattern.matches("[��-��]*", str))
		{
			ppStr="";
			for(int i =0; i<str.length();i++)
			{
				ppStr +=pp[ "����������������������������".indexOf(str.charAt(i))];
			}
		}
		
		String regex = ".*"+ppStr+".*";
		System.out.println("=================sch("+new String[]{"����","����"}[kind]+", "+str+")");
		while(next())
		{
			if(Pattern.matches(regex,now.data[kind]))
			{
				print();
				return;
			}
		}
		go(1);
		
		if(Pattern.matches(regex,now.data[kind]))
		{
			print();
			return;
		}
		
		while(now.num<curr && next())
		{
			
			if(Pattern.matches(regex,now.data[kind]))
			{
				print();
				return;
			}
			
		}
		System.out.println("ã���ô� ���� �����ϴ�.");
		print();
	}
	
	void print()
	{
		System.out.println("����:"+now);
		System.out.println("����:"+bb);
		System.out.println("����:"+nn);
	}
	
	public Mp3Player() {
		// TODO Auto-generated constructor stub
		nn.push(new StMp3(10, "�ʹ��뷡", "�ʹ�"));
		nn.push(new StMp3(9, "�ֱ���", "������"));
        nn.push(new StMp3(8, "�߻�ȭ", "��ȿ��"));
        nn.push(new StMp3(7, "���� ��", "��ȿ��"));
        nn.push(new StMp3(6, "�ҳ�ô�", "�ҳ�ô�"));
        nn.push(new StMp3(5, "����� ȶ��", "����"));
        nn.push(new StMp3(4, "�ϳ��� �ϳ���", "������"));
        nn.push(new StMp3(3, "��ȥ��", "����Ÿ"));
        nn.push(new StMp3(2, "�̵�� ����", "�̵"));
        nn.push(new StMp3(1, "õ���� ���", "�ڿϱ�"));
        
	}
	
	
}
public class StackMp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mp3Player mp = new Mp3Player();
		
		mp.backTr();
		mp.nextTr();
		mp.nextTr();
		mp.nextTr();
		mp.goTr(6);
		mp.goTr(15);
		mp.goTr(3);
		mp.goTr(3);
		
		mp.goTr(15);
		mp.nextTr();
		mp.sch(0, "��");
		mp.sch(0, "��");
		mp.sch(0, "��");
		mp.sch(0, "õ");
		mp.sch(0, "����");
	}

}
