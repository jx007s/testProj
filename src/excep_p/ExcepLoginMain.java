package excep_p;

import java.util.Scanner;
/// 5���� ���� �α��� ��ȿ�� �˻��ϼ���
/// ���̵�, ��ȣ, �̸�
/// �α��� ������ ---> �̸� �α��� �߽��ϴ�. ���
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
				new Member("aaa", "11", "���μ�"),
				new Member("bbb", "22", "���ٿ�"),
				new Member("ccc", "33", "�̿��"),
				new Member("ddd", "44", "���±�")
		};
		
		//String rid = "aaa", rpw = "1234";
		int chk = -1;
		while(true)
		{
			chk = -1;
			try {
				System.out.print("���:");
				String id = sc.next();
				
				
				for (int i = 0; i < mm.length; i++) {
					if(id.equals(mm[i].id))
						chk = i;
				}
				
				
				if(chk<0)
					throw new Exception("��� �Է����ּ���");
				
				System.out.print("�Ƹ�:");
				String pw = sc.next();
				if(!pw.equals(mm[chk].pw))
					throw new Exception("��ȣ�� �Է����ּ���");
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		System.out.println(mm[chk].name+" �α��� ����");
	}

}
