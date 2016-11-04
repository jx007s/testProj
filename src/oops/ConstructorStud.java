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
				new String[]{"남자","여자"}[gender]+"\t";
		/*for (int i = 0; i < jum.length; i++) {
			str+=jum[i]+"\t";
		}
		if(gender=="여자")
			str+="\t";*/
		str+=sum+"\t"+avg+"\t"+rank+"\t"+order;
		
		System.out.println(str);
	}
	
	
}

class ChickenBan   ////////한반의 인원수
{
	String name;    ///반이름
	int []cnt=new int[2];///0:남자, 1:여자
	public ChickenBan(ConStud st) {   ////나를 매개변수로
		super();
		this.name = st.ban;
		cnt[st.gender]=1;  ///나의 성별번호를 이용하여 반클래스의 성별자리에 인원수 1로 설정
	}
	
}
class ConStudAdmin{
	ChickenBan [] ckb = new ChickenBan[0];
	ConStud [] arr;
	String [] index = {"전체","등수","반등수","성별등수","반성별등수","반번호","반성별번호"};
	int kind;
	
	
	
	
	public ConStudAdmin(ConStud[] arr) {
		super();
		this.arr = arr;
		for (int i = 0; i < index.length; i++) {
			System.out.print(i+"-"+index[i]+",");
		}
		System.out.print("\n입력:");
		
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
		for (int i = 0; i < arr.length; i++) {////나
		
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
		int res =findCkb(st.ban);///반 배열번호가 뭐냐?
		if(res<0)////등록된 반이 없어
		{
			ChickenBan [] buf = new ChickenBan[ckb.length+1];///배열칸늘려
			for (int i = 0; i < ckb.length; i++) {
				buf[i]=ckb[i];////기존반 집어넣어
			}
			////맨마지막 자리에 내 반 등록해줘
			buf[ckb.length] = new ChickenBan(st);
			//buf[ckb.length].cnt[st.gender]++;
			ckb = buf;////멤버변수 바꿔치기
			
		}else  ///반 배열번호 찾았어
			ckb[res].cnt[st.gender]++;
	}
	void rank()
	{
		for (int i = 0; i < arr.length; i++) {//////나
			banCal(arr[i]);   //반의갯수,각반의 인원수(남/여)
			
			arr[i].rank=1;
			for (int j = 0; j < arr.length; j++) {///비교
				
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
					new ConStud("후라이드반","원빈",1, 77,75,74,77),
					new ConStud("양념반","투빈",3, 67,65,64),
					new ConStud("양념반","골빈",2, 87,85,84,87),
					new ConStud("양념반","미스터빈",4, 57,55,54,54),
					new ConStud("후라이드반","장희빈",5, 97,95,94)	
		});
	
	}

}
