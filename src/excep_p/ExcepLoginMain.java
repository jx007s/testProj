package excep_p;

import java.util.Scanner;
/// 5명의 정보 로그인 유효성 검사하세요
/// 아이디, 암호, 이름
/// 로그인 성공시 ---> 이름 로그인 했습니다. 출력
class Member
{
	String id, pw, name;

	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
}
public class ExcepLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Member [] mm = {
				new Member("aaa", "11", "조인성"),
				new Member("bbb", "22", "정근우"),
				new Member("ccc", "33", "이용규"),
				new Member("ddd", "44", "김태균")
		};
		
		//String rid = "aaa", rpw = "1234";
		int chk = -1;
		while(true)
		{
			chk = -1;
			try {
				System.out.print("어른디:");
				String id = sc.next();
				
				
				for (int i = 0; i < mm.length; i++) {
					if(id.equals(mm[i].id))
						chk = i;
				}
				
				
				if(chk<0)
					throw new Exception("어른디를 입력해주세요");
				
				System.out.print("아모:");
				String pw = sc.next();
				if(!pw.equals(mm[chk].pw))
					throw new Exception("암호를 입력해주세요");
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		System.out.println(mm[chk].name+" 로그인 성공");
	}

}
