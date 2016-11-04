package thread_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import javax.swing.JOptionPane;



class MulExam extends Thread{
	MulData md;
	LinkedHashMap<String, String>map=
			new LinkedHashMap<>();
	
	boolean chk = false;
	String subject;
	
	int cnt;
	public MulExam(MulData md,String subject, String [][] arr) {
		// TODO Auto-generated constructor stub
		this.md = md;
		this.subject = subject;
		md.subject.add(this);
		for (String[] sss : arr) {
			map.put(sss[0], sss[1]);
		}
		
		
		
		
	}
	@Override
	public void run() {
		
		new MulTimer(this).start();
		
		cnt=0;
		
		 Iterator<String> it = map.keySet().iterator();
		 System.out.println(map.size());
		 String key= it.next();
		 while(it.hasNext())
		 {
			 try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(this.equals(md.curr))
			{
				  
				 String answer = JOptionPane.showInputDialog(md.name+":"+key);
				 
				 if(chk)
					 break;
				
				if(md.subjectChk(answer))
				{
					
				}else{
				 
					if(map.get(key).equals(answer))
					{
						key= it.next();
						cnt++;
					}
					if(answer.equals("p"))
					{
						System.out.println(key+"통과");
						key= it.next();
					}
				}
			}
		 }
		 chk=true;
		 System.out.println(md.name+":"+subject+" 시험종료");
	}
	
	void endPrint()
	{
		System.out.println(md.name+":"+subject+" 맞힌갯수:"+cnt);
	}
	
	class MulTimer extends Thread
	{
		MulExam me;
		
		
		public MulTimer(MulExam me) {
			super();
			this.me = me;
		}


		@Override
		public void run() {
			// TODO Auto-generated method stub
			int i = 10;
			while(i>=0)
			{
				try {
					if(chk)
						 break;
					sleep(1000);
					if(me.equals(md.curr))
					{
						System.out.println(me.md.name+"=>"+subject+":"+i);
						i--;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			chk=true;
			System.out.println(me.md.name+"=>"+subject+" 타이머 종료");
			md.endSub.add(subject);
			md.next();
		}
	}
}

class MulData{
	
	String name;
	MulExam curr;
	boolean end = false;
	ArrayList<MulExam>subject = new ArrayList<>();
	ArrayList<String>endSub = new ArrayList<>();
	
	
	
	public MulData(String name) {
		super();
		this.name = name;
	}

	boolean subjectChk(String answer)
	{
		boolean res = false;
		
		if(endSub.contains(answer))
		{
			System.out.println("과목이전불가");
		}else{
			for (MulExam mul : subject) {
				if(mul.subject.equals(answer))
				{
					curr = mul;
					res = true;
				}
			}
		}
		
		return res;
	}
	
	void next()
	{
		int num = subject.indexOf(curr)+1;
		if(num>=subject.size())
		{
			end();
			
		}else
			curr = subject.get(num);
		
	}
	
	void end()
	{
		System.out.println(name+" 전체 시험종료");
		end = true;
	}
}

class Student extends Thread
{
	String name;
	MulData md;
	
	
	
	
	public Student(String name) {
		super();
		this.name = name;
		md = new MulData(name);
		
		start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		MulExam kor = new MulExam(md,"국어",
				new String [][]{
			{"부릉부릉", "부르미즈"},
			{"헬로", "카봇"},
			{"로보카", "폴리"},
			{"터닝", "메카드"},
			{"",""}
		});
		md.curr = kor;
		kor.start();
		new MulExam(md,"영어",
				new String [][]{
			{"에이", "a"},
			{"비", "b"},
			{"씨", "c"},
			{"디", "d"},
			{"",""}
		}).start();
		new MulExam(md,"수학",
				new String [][]{
			{"일", "1"},
			{"이", "2"},
			{"삼", "3"},
			{"사", "4"},
			{"",""}
		}).start();
	}
}

class StudTotal
{
	ArrayList<Student> arr=new ArrayList<>();
	
	public StudTotal() {
		// TODO Auto-generated constructor stub
		arr.add(new Student("점우섬"));
		arr.add(new Student("김영아"));
		arr.add(new Student("정쟁황"));
	
		while(true)
		{
			try {
				Thread.sleep(2);
				
				boolean res = true;
				
				for (Student st : arr) {
					if(!st.md.end) res = false;
				}
				
				if(res) break;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("모든 학생 시험종료");
		
		for (Student st : arr) {
		  for (MulExam me : st.md.subject) {
			me.endPrint();
		  }	   
		}
	}
}

public class MultiThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StudTotal();
		
		
		
	}

}
