package lang_p;

import java.util.Scanner;

///// 입력값에 따라 도형클래스를 생성하여 도형의 넓이를 계산하세요
/// 1. 인터페이스를 이용한 다형성형태로 만들것
/// 2. 입력형태 0: 사각형   1:원   2:삼각형
/// 3. 실행메소드 void excute()
/// 4. 동적 바인딩 사용할 것
interface OOShape{
	 void excute();
}

class OORec implements OOShape
{
	String name="사각형";
	int w, h;
	
	public OORec(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 넓이:"+w*h);
	}
}

class OOCircle implements OOShape
{
	String name=" 원";
	int r;
	double pi=3.14;
	
	public OOCircle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 넓이:"+r*r*pi);
	}
}

class OOTriangle implements OOShape
{
	String name="삼각형";
	int w, h;
	
	
	
	public OOTriangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}



	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 넓이:"+w*h/2);
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
		
		System.out.println("입력:");
		
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
