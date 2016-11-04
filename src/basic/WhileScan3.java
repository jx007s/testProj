package basic;

import java.util.Scanner;

public class WhileScan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*int ii = sc.nextInt();
		
		System.out.println("출력:"+ii);*/
		
		sss: while(true)   // 
		{
			System.out.println("오늘의 운세!!!!!");
			System.out.println("1~3 : 운세  ,   0: 종료");
			System.out.print("입력:");
			int input = sc.nextInt();
			
			/*if(input==0)
				break;
			
			else if(input==1)
				System.out.println("복권을 사세요!!!");
			else if(input==2)
				System.out.println("어저께나 오늘이나..");
			else if(input==3)
				System.out.println("그 사람이랑 헤어져!!!!");*/
			
			switch(input)
			{
				case 0:
					break sss; 
					          
				case 1:
					System.out.println("복권을 사세요!!!");
					break;
				case 2:
					System.out.println("어저께나 오늘이나..");
					break;
				case 3:
					System.out.println("그 사람이랑 헤어져!!!!");
					break;
			}
		}
		
		System.out.println("오늘의 운세 종료");
	}

}

