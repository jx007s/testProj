package collection;

import java.util.ArrayList;

public class ListBaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String [][] player = {
			        {"�����","������","����","�豤��","������","�����","��ȣ��"},
			        {"��ȣ��","������","����ȫ","�̽���","�嵿��"},
			        { "�̺���","�̽¿�","������","�嵿��","�ڿ���","ȫ����"}
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
		 
		 System.out.println("������:");
		 System.out.println("t1:"+t1);
		 System.out.println("t2:"+t2);
		 System.out.println("FA:"+fa);
		 
		 fa.removeAll(t1);
		 fa.removeAll(t2);
		 
		 t1.removeAll(t2);
		 
		 t1.removeAll(buf);
		 t2.removeAll(buf);
		 
		 System.out.println("������:");
		 System.out.println("t1:"+t1);
		 System.out.println("t2:"+t2);
		 System.out.println("FA:"+fa);
	}

}
