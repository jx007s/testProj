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
			System.out.println("이전곡이 없습니다.");
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
			System.out.println("다음곡이 없습니다.");
	}
	
	void goTr(int no)
	{
		
		System.out.println("==============goTr("+no+")");
		
		if(go(no))
			print();
		else
			System.out.println("곡 번호가 이상합니다.");
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
				"[가-깋]",
				"[나-닣]",
				"[다-딯]",
				"[라-맇]",
				"[마-밓]",
				"[바-빟]",
				"[사-싷]",
				"[아-잏]",
				"[자-짛]",
				"[차-칳]",
				"[카-킿]",
				"[타-팋]",
				"[파-핗]",
				"[하-힣]"};
		
		String ppStr=str;
		if(Pattern.matches("[ㄱ-ㅎ]*", str))
		{
			ppStr="";
			for(int i =0; i<str.length();i++)
			{
				ppStr +=pp[ "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ".indexOf(str.charAt(i))];
			}
		}
		
		String regex = ".*"+ppStr+".*";
		System.out.println("=================sch("+new String[]{"제목","가수"}[kind]+", "+str+")");
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
		System.out.println("찾으시는 곡이 없습니다.");
		print();
	}
	
	void print()
	{
		System.out.println("현재:"+now);
		System.out.println("이전:"+bb);
		System.out.println("다음:"+nn);
	}
	
	public Mp3Player() {
		// TODO Auto-generated constructor stub
		nn.push(new StMp3(10, "십번노래", "십번"));
		nn.push(new StMp3(9, "애국가", "안익태"));
        nn.push(new StMp3(8, "야생화", "박효신"));
        nn.push(new StMp3(7, "눈의 꽃", "박효신"));
        nn.push(new StMp3(6, "소녀시대", "소녀시대"));
        nn.push(new StMp3(5, "멸공의 횃불", "군인"));
        nn.push(new StMp3(4, "하나면 하나지", "영심이"));
        nn.push(new StMp3(3, "나혼자", "씨스타"));
        nn.push(new StMp3(2, "이등병의 편지", "이등병"));
        nn.push(new StMp3(1, "천년의 사랑", "박완규"));
        
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
		mp.sch(0, "생");
		mp.sch(0, "지");
		mp.sch(0, "뚫");
		mp.sch(0, "천");
		mp.sch(0, "ㄴㅅ");
	}

}
