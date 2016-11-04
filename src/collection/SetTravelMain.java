package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class SetTvl
{
	String name;
	int day, money;
	
	public SetTvl(SetTvl tvl) {
		// TODO Auto-generated constructor stub
		name = tvl.name;
		day = tvl.day;
		money = tvl.money;
	}
	
	public SetTvl(String name, int day, int money) {
		super();
		this.name = name;
		this.day = day;
		this.money = money;
	}
	@Override
	public String toString() {
		return name + "(" + day + "):" + money;
	}
	
}



public class SetTravelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] conArr = {"아시아_서울","아시아_북경","아시아_타이페이",
				"아메리카_뉴욕","아메리카_시카고","유럽_이스탄불",
				"유럽_런던","아메리카_상파올로","아프리카_아크라"};
		List conti = new ArrayList<>();
		List conData = new ArrayList<>();
		for (String cc : conArr) {
			String [] ccArr = cc.split("_");
			ArrayList now;
			if(conti.contains(ccArr[0]))
			{
				now = (ArrayList)(conData.get(conti.indexOf(ccArr[0])));
			}else{
				now = new ArrayList();
				conti.add(ccArr[0]);
				conData.add(now);
			}
			now.add(ccArr[1]);
				
		}
		
		System.out.println(conti);
		System.out.println(conData);
		
		SetTvl [] arr = {
				new SetTvl("뉴욕", 7, 500),
				new SetTvl("이스탄불", 3, 300),
				new SetTvl("타이페이", 2, 100),
				new SetTvl("서울", 1, 80),
				new SetTvl("이스탄불", 3, 260),
				new SetTvl("런던", 6, 400),
				new SetTvl("상파울로", 6, 600)
		};
		
		Set index = new HashSet<>();
	
		for (SetTvl tvl : arr) {
			Iterator it = index.iterator();
			
			boolean res = true;
			while(it.hasNext())
			{
				SetTvl com = (SetTvl)it.next();
				if(com.name.equals(tvl.name))
				{
					res = false;
					
					if(com.money>tvl.money)
					{
						it.remove();
						res = true;
					}
				}
			}
			if(res)
				index.add(tvl);
			
		}
		System.out.println(index);
		
		String [] gogo = {"이스탄불","타이페이","상파울로","런던"};
		
		ArrayList goList = new ArrayList<>();
		
		
		for (Object conDataList : conData) {
			ArrayList ar = new ArrayList();
			goList.add(ar);
			for (Object con: (ArrayList)conDataList) {
				String sss = (String)con;
				for (String gg : gogo) {
					if(sss.equals(gg))
						ar.add(sss);
				}
			}
			if(ar.size()==0)
				goList.remove(ar);
		}
		
		System.out.println(goList);
		
		int ttMoney=0,ttday=0;
		
		for (Object ggList : goList) {
			for (Object obj : (ArrayList)ggList) {
				
				Iterator it = index.iterator();
				while(it.hasNext())
				{
					SetTvl com = (SetTvl)it.next();
					if(com.name.equals(obj))
					{
						ttMoney+=com.money;
						ttday+=com.day;
					}
				}
			}
			ttday++;
		}
		
		ttday--;
		System.out.println("총경비:"+ttMoney);
		System.out.println("총여행일:"+ttday);
			
	}

}
