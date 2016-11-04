package oops;
class Traval
{
	static int total=0;
	String name;
	int dist;
	
	void init(String name,	int dist)
	{
		this.name = name;
		this.dist = dist;
	}
}

class Wide
{
	Traval [] arr = new Traval[0];
	String name;
	int dist;
	
	void append(String name, int dist)
	{
		Traval [] buf = new Traval[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			buf[i]=arr[i];
		}
		
		buf[arr.length]= new Traval();
		buf[arr.length].init(name, dist);
		arr = buf;
	}
	void init(String name,	int dist)
	{
		this.name = name;
		this.dist = dist;
	}
}

class WideAdmin
{
	int currWide = -1;
	
	Wide [] arr = new Wide[0];
	void append(String name, int dist)
	{
		Wide [] buf = new Wide[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			buf[i]=arr[i];
		}
		
		buf[arr.length]= new Wide();
		buf[arr.length].init(name, dist);
		arr = buf;
	}
	
	void append(String name, String tr, int dist)
	{
		Wide findWide = sch(name);
		findWide.append(tr, dist);
	}
	
	Wide sch(String name)
	{
		Wide res = null;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].name==name)
				res = arr[i];
		}
		
		return res;
	}
	
	void init()
	{
		append("부산", 0);
		append("부산","해운대", 20);
		append("부산","광안리", 10);
		append("부산","자갈치시장", 15);
		append("춘천", 300);
		append("춘천", "소양강",10);
		append("춘천", "닭갈비",20);
		append("춘천", "춘천호",30);
		append("수원", 200);
		append("수원", "수원성",10);
		append("수원", "수원역",10);
		append("수원", "수원집",5);
		append("수원", "수원강",15);
		append("수원", "수원공항",10);
		append("수원", "수원 운동장",20);
		append("수원", "수원산",10);
		append("대전", 200);
		append("대전", "엑스포",5);
		append("대전", "대전역",7);
		append("대전", "대전강",5);
		append("대전", "대전집",10);
		append("대전", "대전산",20);
		append("대전", "대전공항",15);
	}
	
	void traval(String name)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].arr.length; j++) {
				if(arr[i].arr[j].name==name)
				{
					if(currWide<0)
						currWide=i;
					else
						goWide(i);
					
					arr[i].arr[j].total+=arr[i].arr[j].dist;
					print(arr[i].arr[j]);
				}
			}
		}
	}
	void goWide(int ww)
	{
		int start = currWide, end = ww;
		
		if(currWide>ww)
		{
			start = ww; 
			end = currWide;
		}
		
		for (int i = start+1; i <=end; i++) {

			Traval.total+=arr[i].dist;
		}
		currWide = ww;
	}
	
	void print(Traval tr)
	{
		System.out.println("도시:"+arr[currWide].name);
		System.out.println("여행지:"+tr.name+"("+tr.dist+")");
		System.out.println("여행거리:"+tr.total);
	}
	
}
public class TravalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WideAdmin wa = new WideAdmin();
		wa.init();
		wa.traval("대전산");
		wa.traval("수원공항");
		wa.traval("해운대");
		wa.traval("광안리");	
	}
}