package thread_p;
class Mother
{
	int total =100;
	
	boolean showMeTheMoney(int money)
	{
		synchronized (this) {
			///°´Ã¼¿¡ Àû¿ëÇÑ °æ¿ì
			boolean res = false;
			
				if(res = total>=money)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			return res;
		}
	}
}

class Child extends Thread{
	Mother mm;
	int myMoney;
	
	public Child(Mother mm, String name) {
		super(name);
		this.mm = mm;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(mm.total>0)
		{
			int money = (int)(Math.random()*50+1);
			
			if(mm.showMeTheMoney(money))
			{
				mm.total-=money;
				myMoney+=money;
				
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\tÀÜ¾×:"+mm.total);
			}
		}
	}
	
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother mm = new Mother();
		
		Child son = new Child(mm, "¾Æµé");
		Child dau = new Child(mm, "µþ");
		
		son.start();
		dau.start();
	}

}
