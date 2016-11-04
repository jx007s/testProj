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
						System.out.println(key+"���");
						key= it.next();
					}
				}
			}
		 }
		 chk=true;
		 System.out.println(md.name+":"+subject+" ��������");
	}
	
	void endPrint()
	{
		System.out.println(md.name+":"+subject+" ��������:"+cnt);
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
			System.out.println(me.md.name+"=>"+subject+" Ÿ�̸� ����");
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
			System.out.println("���������Ұ�");
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
		System.out.println(name+" ��ü ��������");
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
		MulExam kor = new MulExam(md,"����",
				new String [][]{
			{"�θ��θ�", "�θ�����"},
			{"���", "ī��"},
			{"�κ�ī", "����"},
			{"�ʹ�", "��ī��"},
			{"",""}
		});
		md.curr = kor;
		kor.start();
		new MulExam(md,"����",
				new String [][]{
			{"����", "a"},
			{"��", "b"},
			{"��", "c"},
			{"��", "d"},
			{"",""}
		}).start();
		new MulExam(md,"����",
				new String [][]{
			{"��", "1"},
			{"��", "2"},
			{"��", "3"},
			{"��", "4"},
			{"",""}
		}).start();
	}
}

class StudTotal
{
	ArrayList<Student> arr=new ArrayList<>();
	
	public StudTotal() {
		// TODO Auto-generated constructor stub
		arr.add(new Student("���켶"));
		arr.add(new Student("�迵��"));
		arr.add(new Student("����Ȳ"));
	
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
		
		System.out.println("��� �л� ��������");
		
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
