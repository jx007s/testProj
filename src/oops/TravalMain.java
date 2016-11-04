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
		append("�λ�", 0);
		append("�λ�","�ؿ��", 20);
		append("�λ�","���ȸ�", 10);
		append("�λ�","�ڰ�ġ����", 15);
		append("��õ", 300);
		append("��õ", "�Ҿ簭",10);
		append("��õ", "�߰���",20);
		append("��õ", "��õȣ",30);
		append("����", 200);
		append("����", "������",10);
		append("����", "������",10);
		append("����", "������",5);
		append("����", "������",15);
		append("����", "��������",10);
		append("����", "���� ���",20);
		append("����", "������",10);
		append("����", 200);
		append("����", "������",5);
		append("����", "������",7);
		append("����", "������",5);
		append("����", "������",10);
		append("����", "������",20);
		append("����", "��������",15);
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
		System.out.println("����:"+arr[currWide].name);
		System.out.println("������:"+tr.name+"("+tr.dist+")");
		System.out.println("����Ÿ�:"+tr.total);
	}
	
}
public class TravalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WideAdmin wa = new WideAdmin();
		wa.init();
		wa.traval("������");
		wa.traval("��������");
		wa.traval("�ؿ��");
		wa.traval("���ȸ�");	
	}
}