package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MapStud
{
	String name;
	Integer  sum, avg, rank;
	
	int [] jum;
	Integer [] kind = new Integer [2];
	public MapStud(String name, int ban, int kor, int eng, int mat) {
		super();
		this.name = name;
		kind[0] = ban;
		this.jum = new int[]{kor, eng,  mat};
		kind[1] = 0;
		
		cal();
	}
	
	public MapStud(String name, int ban, int kor, int eng, int mat, int lol) {
		super();
		this.name = name;
		kind[0] = ban;
		this.jum = new int[]{kor, eng,  mat, lol};
		kind[1] = 1;
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
		String str= name + "\t" + kind[0] + "\t" + "여남".charAt(kind[1]) + "\t";
		
		for (int i : jum) {
			str+= i+ "\t";
		}
		if(kind[1]==0)  str+="\t";
		str+= sum + "\t" + avg + "\t" + rank;
		return str;
	}	
}

class MapStudCom implements Comparator
{
	int kind;

	public MapStudCom(int kind) {
		super();
		this.kind = kind;
	}



	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		MapStud me = (MapStud)o1;
		MapStud com = (MapStud)o2;
		
		int res =1;
		if(kind!=1)
			res= me.kind[0].compareTo(com.kind[0]);
		if((res==0 && kind==2) || kind==1)
			res= me.kind[1].compareTo(com.kind[1]);
		
		
		if(res==0)
			res = com.avg.compareTo(me.avg);
		if(res==0)
			res = me.name.compareTo(com.name);
		if(res==0)
			res = 1;
		return res;
	}
}
public class StudMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList data = new ArrayList();
		
		data.add(new MapStud("정우성", 1,87,83,87));
		data.add(new MapStud("감우성", 1,67,67,67));
		data.add(new MapStud("조우성", 2,87,90,87,87));
		data.add(new MapStud("조인성", 2,97,97,97));
		data.add(new MapStud("꺼져", 1,97,82,70,87));
		
		int kind = 2;
		TreeSet ts = new TreeSet<>(new MapStudCom(kind));
		ts.addAll(data);
		
		for (Object obj1: data) {
			MapStud me = (MapStud)obj1;
			me.rank=1;
			for (Object obj2: data) {
				MapStud com = (MapStud)obj2;
				
				if(me.avg<com.avg)
				{
					if(kind<2 && me.kind[kind]==com.kind[kind])
					{
							me.rank++;	
					}
						
					if(kind==2 && me.kind[0]==com.kind[0])
					{
						if(me.kind[1]==com.kind[1])
						{
							me.rank++;
						}
					}
				}
			}
		}
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
