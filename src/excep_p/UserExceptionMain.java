package excep_p;
class UserExcep extends Exception
{
	int cnt;
	
	public UserExcep(int cnt) {
		super();
		this.cnt = cnt;
	}

	String [] arr = {
			"ぞぞぞぞぞぞぞ",
			"せせせせ",
			"けけけけけ",
			"ししししし"};
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arr[cnt];
	}
}
public class UserExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new UserExcep(1);
		} catch (UserExcep e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
