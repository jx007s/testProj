package basic;

import java.util.Scanner;

public class WhileScan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*int ii = sc.nextInt();
		
		System.out.println("���:"+ii);*/
		
		sss: while(true)   // 
		{
			System.out.println("������ �!!!!!");
			System.out.println("1~3 : �  ,   0: ����");
			System.out.print("�Է�:");
			int input = sc.nextInt();
			
			/*if(input==0)
				break;
			
			else if(input==1)
				System.out.println("������ �缼��!!!");
			else if(input==2)
				System.out.println("�������� �����̳�..");
			else if(input==3)
				System.out.println("�� ����̶� �����!!!!");*/
			
			switch(input)
			{
				case 0:
					break sss; 
					          
				case 1:
					System.out.println("������ �缼��!!!");
					break;
				case 2:
					System.out.println("�������� �����̳�..");
					break;
				case 3:
					System.out.println("�� ����̶� �����!!!!");
					break;
			}
		}
		
		System.out.println("������ � ����");
	}

}

