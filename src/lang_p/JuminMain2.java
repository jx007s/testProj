package lang_p;

import java.util.Scanner;

///회원 가입을 구현하세요

/// 증명사진 : jpg,bmp,png,gif 만 올리세요
/// 이메일 유효성 검사하세요

////  아이디@도메인   형태일 것 : @ 한개
///  아이디 영문만
//// 도메인 영문으로 구성 도메인 종류는 2,3개로
         //// naver.com,   yahoo.co.kr 
/// 전화번호는 숫자만
/// 예외처리 사용할 것



public class JuminMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String id = "박영태.jpg";
		String [] idp = {"jpg","bmp","png","gif"};
		String [] email = {"naver.com","yahoo.co.kr"};
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println("증명사진을 올리세요");
		//System.out.println(id.substring(id.lastIndexOf(".")+1));//뒤에 확장자
		
		for (int i = 0; i < idp.length; i++) {
			/*if(idp[i]!=id.substring(id.lastIndexOf(".")+1))
				System.out.println("jpg,bmp,png,gif만 올리세요");*/
			if(idp[i]==id.substring(id.lastIndexOf(".")+1))
				System.out.println("증명사진 확장자:"+idp[i]);
			else
				System.out.println("jpg,bmp,png,gif만 올리세요");
		}
		
		String nemail = sc.nextLine();
		System.out.println("이메일을 입력하세요");
		
		for (int i = 0; i < email.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
