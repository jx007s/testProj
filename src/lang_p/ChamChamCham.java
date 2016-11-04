package lang_p;

import java.util.Scanner;

public class ChamChamCham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"왼쪽","오른쪽"};
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("추억의 게임 참참참!!!!");
			String str="";
			for (int i = 0; i < arr.length; i++) {
				str+=i+". "+arr[i]+", ";
			}
			str+=arr.length+". 종료";
			System.out.println(str);
			System.out.print("입력:");
			int user = sc.nextInt();
			
			if(user ==arr.length)
				break;
			
			int com = (int)(Math.random()*arr.length);
			
			String res = "패";
			if(user==com)
				res = "승";
			
			System.out.println("게이머:"+arr[user]);
			System.out.println("컴퓨터:"+arr[com]);
			System.out.println("결과:"+res);
			
			
		}
		System.out.println("게임종료");
	}

}
