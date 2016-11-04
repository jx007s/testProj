package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

//회원 가입 유효성 검사를 실시하세요

		
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
		/*1. 아이디 : 영문 숫자 조합 
		2. 비번 , 비번확인 
		3. 이메일  -  아이디:영문,숫자   @  도메인 : 영문 점
		4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
		6. 주민번호 
		7. 사진 첨부-->영문,숫자.이미지 확장자
		이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
		*/
		while(true)
		{
			RegexRegister [] arr = {
					new RegexRegister("아이디", 
							new String[]{
									"[a-zA-Z0-9]*",
									".*[a-zA-Z].*",
									".*[0-9].*"},
							"아이디확!"),
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
		
		System.out.println("로그인 성공");

	}

}
