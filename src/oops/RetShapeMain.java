package oops;
class RetShape
{
	
	double pi=3.14, area;
	
	int pm=1;
	
	void initRec(int w, int h)
	{
		area = w*h;
	}
	
	void initCir(int r)
	{
		area = pi*r*r;
	}
}

class RetMethShape
{
	RetShape [] arr = new RetShape[0];
	
	RetShape rec(int w, int h, char pm)
	{
		RetShape rs = new RetShape();
		rs.initRec(w, h);
		
		if(pm=='-') rs.pm =-1;
		
		return rs;
	}
	
	void area()
	{
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].pm*arr[i].area;
		}
		System.out.println(sum);
	}
	
	void append(int w, int h, char pm)
	{
		RetShape [] buf = new RetShape[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i]=arr[i];
		}
		buf[arr.length] = rec(w, h, pm);
		arr = buf;
	}
}
public class RetShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetMethShape rms = new RetMethShape();
		
		/*rms.arr = new RetShape[]{
				rms.rec(20,10,'+'),	
				rms.rec(15,7,'-')
		};*/
		rms.append(20,10,'+');
		rms.append(15,7,'-');
		rms.append(13,9,'+');
		rms.area();
	}

}
