package lang_p;

import java.util.Scanner;

public class ChamChamCham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"����","������"};
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("�߾��� ���� ������!!!!");
			String str="";
			for (int i = 0; i < arr.length; i++) {
				str+=i+". "+arr[i]+", ";
			}
			str+=arr.length+". ����";
			System.out.println(str);
			System.out.print("�Է�:");
			int user = sc.nextInt();
			
			if(user ==arr.length)
				break;
			
			int com = (int)(Math.random()*arr.length);
			
			String res = "��";
			if(user==com)
				res = "��";
			
			System.out.println("���̸�:"+arr[user]);
			System.out.println("��ǻ��:"+arr[com]);
			System.out.println("���:"+res);
			
			
		}
		System.out.println("��������");
	}

}
