package oops;

class ClaSelf
{
	 int meth(int n)
	{
		 int res =1;
		System.out.println("������������:"+n+","+res);
		if(n>0)//����
			res =n*meth(n-1);//����
		System.out.println("����������:"+n+","+res);
		
		return res;
	}
}
public class SelfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaSelf cs = new ClaSelf();
		System.out.println(cs.meth(10));//�ʱⰪ
	}

}
