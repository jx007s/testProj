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
			System.out.println("ÀÌÀü°îÀÌ ¾ø½À´Ï´Ù.");
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
			System.out.println("´ÙÀ½°îÀÌ ¾ø½À´Ï´Ù.");
	}
	
	void goTr(int no)
	{
		
		System.out.println("==============goTr("+no+")");
		
		if(go(no))
			print();
		else
			System.out.println("°î ¹øÈ£°¡ ÀÌ»óÇÕ´Ï´Ù.");
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
				"[°¡-ƒ‰]",
				"[³ª-ˆ¢]",
				"[´Ù-‹L]",
				"[¶ó-¡]",
				"[¸¶-“J]",
				"[¹Ù-•½]",
				"[»ç-šï]",
				"[¾Æ-Ÿç]",
				"[ÀÚ-£ ]",
				"[Â÷-¯†]",
				"[Ä«-µi]",
				"[Å¸-»M]",
				"[ÆÄ-À˜]",
				"[ÇÏ-ÆR]"};
		
		String ppStr=str;
		if(Pattern.matches("[¤¡-¤¾]*", str))
		{
			ppStr="";
			for(int i =0; i<str.length();i++)
			{
				ppStr +=pp[ "¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾".indexOf(str.charAt(i))];
			}
		}
		
		String regex = ".*"+ppStr+".*";
		System.out.println("=================sch("+new String[]{"Á¦¸ñ","°¡¼ö"}[kind]+", "+str+")");
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
		System.out.println("Ã£À¸½Ã´Â °îÀÌ ¾ø½À´Ï´Ù.");
		print();
	}
	
	void print()
	{
		System.out.println("ÇöÀç:"+now);
		System.out.println("ÀÌÀü:"+bb);
		System.out.println("´ÙÀ½:"+nn);
	}
	
	public Mp3Player() {
		// TODO Auto-generated constructor stub
		nn.push(new StMp3(10, "½Ê¹ø³ë·¡", "½Ê¹ø"));
		nn.push(new StMp3(9, "¾Ö±¹°¡", "¾ÈÀÍÅÂ"));
        nn.push(new StMp3(8, "¾ß»ıÈ­", "¹ÚÈ¿½Å"));
        nn.push(new StMp3(7, "´«ÀÇ ²É", "¹ÚÈ¿½Å"));
        nn.push(new StMp3(6, "¼Ò³à½Ã´ë", "¼Ò³à½Ã´ë"));
        nn.push(new StMp3(5, "¸ê°øÀÇ È¶ºÒ", "±ºÀÎ"));
        nn.push(new StMp3(4, "ÇÏ³ª¸é ÇÏ³ªÁö", "¿µ½ÉÀÌ"));
        nn.push(new StMp3(3, "³ªÈ¥ÀÚ", "¾¾½ºÅ¸"));
        nn.push(new StMp3(2, "ÀÌµîº´ÀÇ ÆíÁö", "ÀÌµîº´"));
        nn.push(new StMp3(1, "Ãµ³âÀÇ »ç¶û", "¹Ú¿Ï±Ô"));
        
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
		mp.sch(0, "»ı");
		mp.sch(0, "Áö");
		mp.sch(0, "¶Õ");
		mp.sch(0, "Ãµ");
		mp.sch(0, "¤¤¤µ");
	}

}
