package collection;

import java.util.ArrayList;

class ListStud
{
	int ban, rank, gender, sum, avg;
	String name;
	ArrayList jum = new ArrayList();
	boolean res;
	public ListStud(int ban, String name, int kor, int eng, int mat) {
		super();
		this.ban = ban;
		this.name = name;
		jum.add(kor);
		jum.add(eng);
		jum.add(mat);
		gender = 0;
		cal();
	}
	
	public ListStud(int ban, String name, int kor, int eng, int mat, int lol) {
		this(ban, name, kor, eng, mat);
		jum.add(lol);
		gender = 1;
		cal();
	}
	
	void cal(){
		sum=0;
		for (Object obj : jum) {
			sum += (int)obj;
		}
		avg = sum/jum.size();
		res = avg>= 70;
	}

	
	public void print() {
		String str= ban + "\t" + name + "\t" + "咯巢".charAt(gender) + "\t";
		
		for (Object obj : jum) {
			str += obj+ "\t";
		};
		if(gender==0)
			str += "\t";
		str += sum+ "\t" + avg + "\t" + res + "\t" + rank;
		
		System.out.println(str);
	}
	
	
	
}


class ListStudTotal
{
	void cal(Object arr)
	{
		rank(arr);
		print(arr);
	}
	void print(Object arr)
	{
		ArrayList oo = (ArrayList)arr;
		for (int i = 0; i <oo.size(); i++) {

			if(oo.get(i) instanceof ArrayList)
			{
				print(oo.get(i));
				System.out.println();
			}else{
				for (Object mm : (ArrayList)arr) {
					ListStud me = (ListStud)mm;
					if(me.rank-1==i)
						me.print();
				}
				
				
			}
		}
		
	}
	
	void rank(Object arr)
	{
		for (Object oo : (ArrayList)arr) {
			if(oo instanceof ArrayList)
			{
				rank(oo);
				
			}else{
				ListStud me = (ListStud)oo;
				me.rank =1;
				for (Object com : (ArrayList)arr) {
					if(me.avg<((ListStud)com).avg)
						me.rank++;
				}
			}
		}
		
	}
	
	
}
public class ListStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListStudTotal lst = new ListStudTotal();
		ListStud [] arr = {
				new ListStud(2, "盔后", 55,56,57,55),
				new ListStud(1, "捧后", 77,78,77),
				new ListStud(1, "泅后", 91,99,96,99),
				new ListStud(3, "辫快后", 98,99,96),
				new ListStud(2, "固胶磐后", 88,87,88,87),
				new ListStud(3, "厘锐后", 76,77,78,78),
				new ListStud(1, "榜后", 56,67,78),
				new ListStud(3, "目乔后", 87,65,55),
		};
		int maxBan = -1;
		for (ListStud st : arr) {
			if(maxBan<st.ban)
				maxBan=st.ban;
		}
		
		
		int [] index = {2,maxBan,maxBan};
		
		ArrayList total = new ArrayList<>();
		
		for (int ii: index) {
			ArrayList curr = new ArrayList();
			total.add(curr);	//己喊
			for (int i = 0; i < ii; i++) {
				curr.add(new ArrayList());
			}
		}
		
		for (Object genArr : (ArrayList)total.get(2)) {
			((ArrayList)genArr).add(new ArrayList());
			((ArrayList)genArr).add(new ArrayList());	
		}
		
		
		for (ListStud st : arr) {
			((ArrayList)((ArrayList)total.get(0)).get(st.gender)).add(st);
			((ArrayList)((ArrayList)total.get(1)).get(st.ban-1)).add(st);
			((ArrayList)((ArrayList)((ArrayList)total.get(2)).get(st.ban-1)).get(st.gender)).add(st);
		}
		String [] str ={"己喊","馆","馆己喊"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			lst.cal(total.get(i));
		}
		
		
	}

}
