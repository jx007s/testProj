package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

//ȸ�� ���� ��ȿ�� �˻縦 �ǽ��ϼ���

		
class RegexRegister
{
	String msg, ans, errMsg;
	
	String [] regex;
	
	boolean errChk = false;

	public RegexRegister(String msg) {
		super();
		this.msg = msg;
		
		input();
	}

	public RegexRegister(String msg, String[] regex, String errMsg) {
		super();
		this.msg = msg;
		
		this.regex = regex;
		this.errMsg = errMsg;
		input();
		errTest();
	}
	void input()
	{
		System.out.print(msg+":");
		ans = new Scanner(System.in).nextLine().toLowerCase();
	}
	void errTest()
	{
		errChk = false;
		
		for (String pp : regex) {
			if(!Pattern.matches(pp, ans))
				errChk=true;
		}
	}
	
	
}

public class RegisterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. ���̵� : ���� ���� ���� 
		2. ��� , ���Ȯ�� 
		3. �̸���  -  ���̵�:����,����   @  ������ : ���� ��
		4. ��ȭ��ȣ - ���� :  ###-####-####,   ##(#)-###-####
		6. �ֹι�ȣ 
		7. ���� ÷��-->����,����.�̹��� Ȯ����
		�̹���(jpg, jpeg, bmp, png, gif)  --  ��ҹ��� ���о���
		*/
		while(true)
		{
			RegexRegister [] arr = {
					new RegexRegister("���̵�", 
							new String[]{
									"[a-zA-Z0-9]*",
									".*[a-zA-Z].*",
									".*[0-9].*"},
							"���̵�Ȯ!"),
					//new RegexRegister(""),
			};
		
			try{
				for (int i =0;i<arr.length;i++) {
					if(arr[i].errChk) 
						throw new Exception(arr[i].errMsg);
					
					
				}
				break;
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("�α��� ����");

	}

}
