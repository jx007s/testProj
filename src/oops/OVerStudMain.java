package oops;
class OVerStud
{
	String name, gender, type;
	int [] jum, rank;
	int sum, avg, ban;
	
	
	void init(String name, int kor, int eng, int mat)
	{
		gender="여자";
		jum = new int[]{kor, eng, mat};
		init(name);
	}
	
	void init(String name, int kor, int eng, int mat, int lol)
	{
		gender="남자";
		jum = new int[]{kor, eng, mat,lol};
		init(name);
	}
	
	void init(String name)
	{
		this.name = name;
		cal();
	}
	
	void cal()
	{
		sum = 0;
		for (int i = 0; i < jum.length; i++) {
			sum += jum[i];
		}
		avg = sum/jum.length;
	}
	
	void print()
	{
		String str = name+"\t"+gender+"\t";
		for (int i = 0; i < jum.length; i++) {
			str += jum[i]+"\t";
		}
		if(gender=="여자") str+="\t";
		str += sum+"\t"+avg;
		System.out.println(str);
	}
	
}
public class OVerStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OVerStud os = new OVerStud();
		os.init("장동건", 88,87,91,86);
		os.print();
	}

}
