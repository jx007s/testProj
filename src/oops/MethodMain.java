package oops;

import java.util.Arrays;

class ClaMethod
{
	int a = 10;
	
	class ClaCla
	{
		void meth()
		{
			System.out.println(a);
		}
	}
	
	void meth_1()
	{
		System.out.println("�޼ҵ� 1�Դϴ�.:"+a);
	}
	
	void meth_2(int aa)
	{
		//int aa;
		a = 10000;
		System.out.println("�޼ҵ� 2�Դϴ�.:"+(aa+a));
	}
	void meth_3(int bb)
	{
		//int aa;
		System.out.println("�޼ҵ� 3�Դϴ�.:"+(bb+a));
	}
	void meth_4(int a)
	{
		
		System.out.println("�޼ҵ� 4�Դϴ�.:"+a);
	}
	void meth_5(int a)
	{
		
		System.out.println("�޼ҵ� 5�Դϴ�.:"+this.a);
	}
	void init(int a)
	{
		this.a = a;
	}
	
	void meth_6(String name,int a,  int b, int c)
	{
		
		System.out.println("�޼ҵ� 6�Դϴ�.:"+name+(a+b+c));
	}
	
	int meth_7()
	{
		System.out.println("�޼ҵ� 7�Դϴ�.");
		
		return 7777;
	}
	
	int meth_8(int a, int b)
	{
		System.out.println("�޼ҵ� 8�Դϴ�.");
		
		return a+b;
	}
	
	int [] meth_9()
	{
		System.out.println("�޼ҵ� 9�Դϴ�.");
		
		return new int[]{10,20};
	}
	
	void meth_10(int [] arr)
	{
		System.out.println("�޼ҵ� 10�Դϴ�.");
		arr[0] = 1234;
		return ;
	}
	
	void meth_11(int aa)
	{
		aa = 1357;
		System.out.println("�޼ҵ� 11�Դϴ�.:"+aa);
	}
	
	void meth_12()
	{
		System.out.println("�޼ҵ� 12�Դϴ�.");
		meth_13(1212);
	}
	void meth_13(int a)
	{
		System.out.println("�޼ҵ� 13�Դϴ�.:"+a);
	}
	
	void meth_14()
	{
		System.out.println("�޼ҵ� 14�Դϴ�");
		
		/*void meth_15()
		{
			System.out.println("�޼ҵ�  15�Դϴ�");
		}*/
		class Abc
		{
			void meth_abc()
			{
				System.out.println("�޼ҵ�  abc�Դϴ�");
			}
		}
		Abc aaa = new Abc();
		aaa.meth_abc();
	}
	
}
public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaMethod cm = new ClaMethod();
		
		System.out.println(cm.a);
		//int ii = 
				cm.meth_1();
		
		System.out.println(cm.a);
		cm.meth_3(1234);
		cm.meth_2(1234);
		cm.meth_4(1234);
		cm.meth_5(1234);
		cm.init(5678);
		System.out.println(cm.a);
		cm.meth_6("Ÿ����", 11,22,33);
		/*int ii = cm.meth_7();
		System.out.println(ii);*/
		System.out.println(cm.meth_7()+8888);
		System.out.println(cm.meth_8(7,8)*3);
		//System.out.println(7+8*3);
		int [] arr = cm.meth_9();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(cm.meth_9()[0]);
		arr[0] = 123456;
		cm.meth_9()[0] = 123456;
		System.out.println(arr[0]);
		System.out.println(cm.meth_9()[0]);
		
		int asdf = 4567;
		cm.meth_11(asdf);
		System.out.println("asdf:"+asdf);
		
		int [] arr2 = {10,20,30,40};
		System.out.println(Arrays.toString(arr2));
		cm.meth_10(arr2);
		System.out.println(Arrays.toString(arr2));
		cm.meth_12();
		System.out.println();
		cm.meth_13(1313);
		cm.meth_14();
		
		ClaMethod.ClaCla cc = cm.new ClaCla();
		cc.meth();
		//System.out.println(cc.a);
		//cm.meth_14().Abc abc;
	}

}
