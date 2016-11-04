package lang_p;

import java.util.Scanner;

///// �Է°��� ���� ����Ŭ������ �����Ͽ� ������ ���̸� ����ϼ���
/// 1. �������̽��� �̿��� ���������·� �����
/// 2. �Է����� 0: �簢��   1:��   2:�ﰢ��
/// 3. ����޼ҵ� void excute()
/// 4. ���� ���ε� ����� ��
interface OOShape{
	 void excute();
}

class OORec implements OOShape
{
	String name="�簢��";
	int w, h;
	
	public OORec(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ����:"+w*h);
	}
}

class OOCircle implements OOShape
{
	String name=" ��";
	int r;
	double pi=3.14;
	
	public OOCircle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ����:"+r*r*pi);
	}
}

class OOTriangle implements OOShape
{
	String name="�ﰢ��";
	int w, h;
	
	
	
	public OOTriangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}



	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ����:"+w*h/2);
	}
}

class MakeCla
{
	String name;
	Class[] cla;
	Object[] oo;
	public MakeCla(String name, Class[] cla, Object[] oo) {
		super();
		this.name = name;
		this.cla = cla;
		this.oo = oo;
	}
	
	
}
public class BindingShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�:");
		
		int input = sc.nextInt();
		
		MakeCla [] arr = {
				new MakeCla("lang_p.OORec",new Class[]{int.class, int.class},new Object[]{5,6}),
				new MakeCla("lang_p.OOCircle",new Class[]{int.class},new Object[]{5}),
				new MakeCla("lang_p.OOTriangle",new Class[]{int.class, int.class},new Object[]{5,6})
		};
		
		
	
	
		
		try {
			OOShape sh = (OOShape)Class.forName(arr[input].name)
					.getConstructor(arr[input].cla)
					.newInstance(arr[input].oo);
		
			sh.excute();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
