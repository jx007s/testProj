package lang_p;

import java.util.Scanner;

///ȸ�� ������ �����ϼ���

/// ������� : jpg,bmp,png,gif �� �ø�����
/// �̸��� ��ȿ�� �˻��ϼ���

////  ���̵�@������   ������ �� : @ �Ѱ�
///  ���̵� ������
//// ������ �������� ���� ������ ������ 2,3����
         //// naver.com,   yahoo.co.kr 
/// ��ȭ��ȣ�� ���ڸ�
/// ����ó�� ����� ��



public class JuminMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String id = "�ڿ���.jpg";
		String [] idp = {"jpg","bmp","png","gif"};
		String [] email = {"naver.com","yahoo.co.kr"};
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println("��������� �ø�����");
		//System.out.println(id.substring(id.lastIndexOf(".")+1));//�ڿ� Ȯ����
		
		for (int i = 0; i < idp.length; i++) {
			/*if(idp[i]!=id.substring(id.lastIndexOf(".")+1))
				System.out.println("jpg,bmp,png,gif�� �ø�����");*/
			if(idp[i]==id.substring(id.lastIndexOf(".")+1))
				System.out.println("������� Ȯ����:"+idp[i]);
			else
				System.out.println("jpg,bmp,png,gif�� �ø�����");
		}
		
		String nemail = sc.nextLine();
		System.out.println("�̸����� �Է��ϼ���");
		
		for (int i = 0; i < email.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
