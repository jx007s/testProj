package oops;
class DragonMoney
{
	String name;
	static int total = 100;
	
	int myMoney=0;
	
	void showMeTheMoney(int money)
	{
		total -= money;
		myMoney += money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\tภÜพื:"+total);
	}
}
public class DragonMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DragonMoney son = new DragonMoney();
		DragonMoney dau = new DragonMoney();
		son.name="พฦต้";
		dau.name="ตþ";
		
		son.showMeTheMoney(7);
		dau.showMeTheMoney(8);
		son.showMeTheMoney(5);
		dau.showMeTheMoney(9);
		
	}

}
