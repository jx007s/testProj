package oops;

import java.util.Scanner;

class ConStud
{
	String name,  ban;
	int [] jum;
	int sum, avg, rank,num,gender, order;
	public ConStud(String ban, String name,int num, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.jum = new int[]{kor, eng,  mat};
		gender = 1;
		cal();
	}
	
	public ConStud(String ban, String name,int num, int kor, int eng, int mat, int lol) {
		this(ban, name, num, kor, eng, mat);
		this.jum = new int[]{kor, eng,  mat, lol};
		gender = 0;
		cal();
	}
	
	
	void cal()
	{
		sum=0;
		for (int i = 0; i < jum.length; i++) {
			sum+=jum[i];
		}
		avg = sum/jum.length;
	}
	
	void rank(ConStud [] arr)
	{
		rank=1;
		for (int j = 0; j < arr.length; j++) {
			if(avg<arr[j].avg)
				rank++;
		}
	}
	
	void print()
	{
		String str = ban+"\t"+num+"\t"+name+"\t"+
				new String[]{"����","����"}[gender]+"\t";
		/*for (int i = 0; i < jum.length; i++) {
			str+=jum[i]+"\t";
		}
		if(gender=="����")
			str+="\t";*/
		str+=sum+"\t"+avg+"\t"+rank+"\t"+order;
		
		System.out.println(str);
	}
	
	
}

class ChickenBan   ////////�ѹ��� �ο���
{
	String name;    ///���̸�
	int []cnt=new int[2];///0:����, 1:����
	public ChickenBan(ConStud st) {   ////���� �Ű�������
		super();
		this.name = st.ban;
		cnt[st.gender]=1;  ///���� ������ȣ�� �̿��Ͽ� ��Ŭ������ �����ڸ��� �ο��� 1�� ����
	}
	
}
class ConStudAdmin{
	ChickenBan [] ckb = new ChickenBan[0];
	ConStud [] arr;
	String [] index = {"��ü","���","�ݵ��","�������","�ݼ������","�ݹ�ȣ","�ݼ�����ȣ"};
	int kind;
	
	
	
	
	public ConStudAdmin(ConStud[] arr) {
		super();
		this.arr = arr;
		for (int i = 0; i < index.length; i++) {
			System.out.print(i+"-"+index[i]+",");
		}
		System.out.print("\n�Է�:");
		
		this.kind = new Scanner(System.in).nextInt();
		rank();
		order();
		print();
	}
	int findCkb(String name)
	{
		int res = -1;
		
		for (int i = 0; i < ckb.length; i++) {
			if(ckb[i].name == name)
				res = i;
		}
		
		return res;
	}
	void order() ///////
	{
		for (int i = 0; i < arr.length; i++) {////��
		
			switch(kind)
			{
				case 4: case 6:
					if(arr[i].gender==1)
						arr[i].order+=ckb[findCkb(arr[i].ban)].cnt[0];
				case 2: case 5:
					for (int j = 0; j < findCkb(arr[i].ban); j++) {
						
						arr[i].order+=ckb[j].cnt[0]+ckb[j].cnt[1];
						//System.out.println(arr[i].name+" "+ckb[j].cnt[0]+ckb[j].cnt[1]);
					}
					
					break;
				case 3:
					for (int j = 0; j < ckb.length; j++) {
						if(arr[i].gender==1)
							arr[i].order+=ckb[j].cnt[0];
					}
					break;
				
				
			}
			if(kind>=1 && kind<=4)
				arr[i].order+=arr[i].rank;
			else if(kind==0)
				arr[i].order = i+1;
			else if(kind>=5)
				arr[i].order++;
				
		}
		
	}
	void banCal(ConStud st) //////////
	{
		int res =findCkb(st.ban);///�� �迭��ȣ�� ����?
		if(res<0)////��ϵ� ���� ����
		{
			ChickenBan [] buf = new ChickenBan[ckb.length+1];///�迭ĭ�÷�
			for (int i = 0; i < ckb.length; i++) {
				buf[i]=ckb[i];////������ ����־�
			}
			////�Ǹ����� �ڸ��� �� �� �������
			buf[ckb.length] = new ChickenBan(st);
			//buf[ckb.length].cnt[st.gender]++;
			ckb = buf;////������� �ٲ�ġ��
			
		}else  ///�� �迭��ȣ ã�Ҿ�
			ckb[res].cnt[st.gender]++;
	}
	void rank()
	{
		for (int i = 0; i < arr.length; i++) {//////��
			banCal(arr[i]);   //���ǰ���,������ �ο���(��/��)
			
			arr[i].rank=1;
			for (int j = 0; j < arr.length; j++) {///��
				
				boolean chk = true;
				
				switch(kind)
				{
					case 0:
					case 1:break;
					case 5:
					case 2: chk= arr[i].ban == arr[j].ban; break;
					case 3: chk= arr[i].gender == arr[j].gender; break;
					case 6:
					case 4: chk= arr[i].ban == arr[j].ban && arr[i].gender == arr[j].gender; break;
				}
				
				if(chk && arr[i].avg<arr[j].avg)
				{
					arr[i].rank++;
				}
				
				if(chk && kind>=5 && arr[i].num>arr[j].num)
				{
					arr[i].order++;
				}
			}
			
			
		}
	}
	
	void print()
	{
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			
				if(arr[j].order==i)
					arr[j].print();
			}
			
			
		}
	}
	
}
public class ConstructorStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConStudAdmin(
				new ConStud[] {
					new ConStud("�Ķ��̵��","����",1, 77,75,74,77),
					new ConStud("����","����",3, 67,65,64),
					new ConStud("����","���",2, 87,85,84,87),
					new ConStud("����","�̽��ͺ�",4, 57,55,54,54),
					new ConStud("�Ķ��̵��","�����",5, 97,95,94)	
		});
	
	}

}
