package arr;

public class ArrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////1. �Էº�
		int [] jum = {88,77,89,65};
		
		int [] rank = new int[jum.length];
		
		int sum=0, max=0, min=1000;
		
		////2. �����
		//2_1 �Ϲ� ���
		for (int i = 0; i < jum.length; i++) {
			sum += jum[i];
			
			if(max<jum[i]) max = jum[i];
			if(min>jum[i]) min = jum[i];
		}
		///2_2 ���
		for (int i = 0; i < jum.length; i++) {
			///i: ���� ����
			rank[i]=1;
			for (int j = 0; j < jum.length; j++) {
				///j: ������
				if(jum[i]<jum[j])
					rank[i]++;
			}
		}
		
		
		///3. ��º�
		String [] grade = {"��","��","��","��","��","��","��","��","��","��","��"};
		
		//System.out.println(grade[87/10]);
		for (int k = 1; k <= rank.length; k++) {
			//System.out.println(k);
			for (int i = 0; i < jum.length; i++) {
				if(k==rank[i])
				System.out.println(i+1+":"+jum[i]+grade[jum[i]/10]+"("+rank[i]+")");
			}
			//System.out.println("/////////////////////////"); 
			
		}
		
		System.out.println("-----------------------------");
		System.out.println(sum);
		System.out.println(sum/jum.length);
		System.out.println(max);
		System.out.println(min);
	}

}
