package lang_p;

import java.lang.reflect.Constructor;

class AAA
{
	public AAA() {
		// TODO Auto-generated constructor stub
	}
	
	public AAA(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}

	int a = 10;
	String str = "�������� �Ϳ�����";
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAA other = (AAA) obj;
		if (a != other.a)
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AAA [a=" + a + ", str=" + str + "]";
	}
	
	
	
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		String res = a+","+str;
		return res;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof AAA))
			return false;
		
		AAA com = (AAA)obj;
		
		return a == com.a && str ==com.str;
	}*/
}
public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = a1;
		AAA a4 = new AAA(20,"�������� �Ϳ�����");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a1.toString());
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.hashCode());
		
		System.out.println(a1 instanceof Object);
		Object o1 = a1;
		System.out.println();
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
		System.out.println(a1==o1);
		
		System.out.println();
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		System.out.println(a1.equals(o1));
		
		try {
			String str = "lang_p.AAA";
			Class ccc = Class.forName(str);
			Object oo = ccc.newInstance();
			System.out.println(oo);
			
			Constructor con = ccc.getConstructor(new Class[]{int.class, String.class});
			Object oo2 = con.newInstance(new Object[]{123,"�ɷ��ɷ��ɷ�"});
			System.out.println(oo2);
			
			Object oo3 = Class.forName("lang_p.AAA")
					.getConstructor(new Class[]{int.class, String.class})
					.newInstance(new Object[]{567,"�ٶ��� ��ó"});
			
			System.out.println(oo3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///// �Է°��� ���� ����Ŭ������ �����Ͽ� ������ ���̸� ����ϼ���
	/// 1. �������̽��� �̿��� ���������·� �����
	/// 2. �Է����� 0: �簢��   1:��   2:�ﰢ��
	/// 3. ����޼ҵ� void excute()
	/// 4. ���� ���ε� ����� ��
	
}
