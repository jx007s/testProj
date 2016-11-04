package extends_p;

class CapStudPar
{
	private double [] rate;

	public CapStudPar(double kor, double eng, double mat) {
		super();
		this.rate = new double[]{kor,  eng,  mat};
		
	}

	public double getRate(int i) {
		return rate[i];
	}	
}
class CapStudChild extends CapStudPar
{
	private String name;
	private int [] jum;
	private int sum, avg;
	private double res;
	public CapStudChild( String name, int kor, int eng, int mat) {
		super(0.5,0.3,0.2);
		this.name = name;
		this.jum = new int[]{kor,  eng,  mat};
		
		cal();
		print();
	}
	
	void cal()
	{
		sum=0;
		res=0;
		
		for (int i = 0; i < jum.length; i++) {
			sum+=jum[i];
			res+=jum[i]*getRate(i);
		}
		avg=sum/jum.length;
	}
	
	void print()
	{
		String str = name+"\t";
		for (int i = 0; i < jum.length; i++) {
			str+=jum[i]+"\t";
		}
		str+=sum+"\t"+avg+"\t"+res;
		
		System.out.println(str);
	}
	
	
}

public class CapStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapStudChild cc = new CapStudChild("aaa", 77,88,99);
		
	}

}
