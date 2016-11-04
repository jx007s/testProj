package oops;
class MeStud
{
	String name;
	int [] jum, rank;
	int sum, avg,  ban, gender;
	
	void initW(int ban,String name, int kor,int eng, int mat)
	{
		gender=1;
		
		jum = new int [] {kor,eng, mat};
		init(ban, name);
		//print();
	}
	void initM(int ban,String name, int kor,int eng, int mat, int lol)
	{
		gender=0;
		
		jum = new int [] {kor,eng, mat, lol};
		init(ban, name);
		//print();
	}
	void init(int ban,String name)
	{
		this.ban = ban;
		this.name = name;
		
		cal();
		//print();
	}
	
	void cal()
	{
		sum = 0;
		for (int i = 0; i < jum.length; i++) {
			sum += jum[i];
		}
		avg = sum / jum.length;
	}
	
	void rank(MeStud [] arr)
	{
		rank=new int[]{1,1,1,1};
		for (int j = 0; j < arr.length; j++) {
			if(this == arr[j])
				rank[0] += j;
			if(avg<arr[j].avg)
			{
				rank[1]++;
				if(ban == arr[j].ban)
					rank[2]++;
				if(gender == arr[j].gender)
					rank[3]++;
			}
		}
	}
	
	void print(int r)
	{
		String str =ban+"\t"+ name+"\t"+new String[]{"남자","여자"}[gender]+"\t";
		for (int i = 0; i < jum.length; i++) {
			str += jum[i]+"\t";
		}
		if(gender==1)
			str += "\t";
		str += sum+"\t"+avg+"\t"+rank[r];
		System.out.println(str);
	}
}
class MeStudAdmin
{
	int maxBan = -1;
	MeStud [] ms;
	String [] ppStr = {"그냥","등수","반","성별"};
	void init(int cnt)
	{
		ms = new MeStud[cnt];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = new MeStud();
		}
	}
	
	void rank()
	{
		 for (int i = 0; i < ms.length; i++) {
				if(maxBan<ms[i].ban) maxBan = ms[i].ban; 
				ms[i].rank(ms);
			}
	}
	
	void print()
	{
		int [] max = {0,0,maxBan,new String[]{"남자","여자"}.length-1};
		 int input = 2;
		 System.out.println(ppStr[input]);///0
		 for (int b = 0; b <= max[input]; b++) {
			for (int r = 1; r <= ms.length; r++) {
			 for (int i = 0; i < ms.length; i++) {
				 
				 boolean chk = true;
				 switch(input)
				 {
				 	case 2: chk=ms[i].ban ==b; break;
				 	case 3: chk=ms[i].gender==b; break;
				 }
				 
				 if(ms[i].rank[input]==r && chk)
				 {
					 
					ms[i].print(input);
				 }
				}
			 }
		 }
	}
}
public class MeStudMain {
	 public static void main(String[] args) {
		 
		 MeStudAdmin ma = new MeStudAdmin();
		 /*ma.init(5);
		 
		 ma.ms[0].initW(2,"장동건", 88,87,89);
		 ma.ms[1].initM(2,"장서건", 58,57,54,55);
		 ma.ms[2].initW(3,"장남건", 78,77,74);
		 ma.ms[3].initM(1,"장중건", 98,97,94,97);
		 ma.ms[4].initM(1,"북두신건", 68,67,64,66);*/
		 
		 //ma.ms = ?;
		 ma.rank();
		 ma.print();
		 
	
	}
}
