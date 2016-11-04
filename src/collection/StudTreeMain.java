package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ComStud
{
	String name;
	Integer ban, gender, sum, avg;
	int [] jum;
	public ComStud(String name, int ban, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.ban = ban;
		this.jum = new int[]{kor, eng,  mat};
		
		cal();
	}
	
	void cal()
	{
		sum =0;
		
		for (int i : jum) {
			sum+= i;
		}
		avg=sum/jum.length;
	}

	@Override
	public String toString() {
		String str= name + "\t" + ban + "\t" + gender + "\t";
		
		for (int i : jum) {
			str+= i+ "\t";
		}
		str+= sum + "\t" + avg;
		return str;
	}	
}

class StudCom implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		ComStud me = (ComStud)o1;
		ComStud com = (ComStud)o2;
		
		int res = com.avg.compareTo(me.avg);
		if(res==0)
			res = me.name.compareTo(com.name);
		//res = res==0? 1: res;
		//System.out.println(res);
		return res;
	}
}
public class StudTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList data = new ArrayList();
		
		data.add(new ComStud("沥快己", 1,87,87,87));
		data.add(new ComStud("皑快己", 1,67,67,67));
		data.add(new ComStud("炼快己", 2,87,87,87));
		data.add(new ComStud("炼牢己", 2,97,97,97));
		data.add(new ComStud("波廉", 1,97,87,77));
		
		TreeSet ts = new TreeSet<>(new StudCom());
		ts.addAll(data);
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
