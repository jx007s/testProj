package collection;

import java.util.ArrayList;

public class ListBaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String [][] player = {
			        {"박재상","박정권","최정","김광현","엄정욱","박희수","이호준"},
			        {"이호준","엄정욱","박재홍","이신협","장동건"},
			        { "이병규","이승엽","박정권","장동건","박용택","홍성흔"}
			    };
		 
		 ArrayList t1 = new ArrayList();
		 ArrayList t2 = new ArrayList();
		 ArrayList fa = new ArrayList();
		 
		 for (String  pp : player[0]) {
			t1.add(pp);
		}
		 
		 for (String  pp : player[1]) {
				t2.add(pp);
			}
		 
		 for (String  pp : player[2]) {
				fa.add(pp);
			}
			    
		 ArrayList buf = new ArrayList(fa);
		 
		 System.out.println("변경전:");
		 System.out.println("t1:"+t1);
		 System.out.println("t2:"+t2);
		 System.out.println("FA:"+fa);
		 
		 fa.removeAll(t1);
		 fa.removeAll(t2);
		 
		 t1.removeAll(t2);
		 
		 t1.removeAll(buf);
		 t2.removeAll(buf);
		 
		 System.out.println("변경후:");
		 System.out.println("t1:"+t1);
		 System.out.println("t2:"+t2);
		 System.out.println("FA:"+fa);
	}

}
