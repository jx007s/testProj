package arr;

public class ArrStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �Էº�
		String [] name = {"����","����","�̽��ͺ�","Ŀ�Ǻ�"};
		
		int [] kor = {88,77,68,96};
		int [] eng = {82,79,65,93};
		int [] mat = {89,72,66,90};
		int [] lol = {-1,78,-1,92};
		
		int [] sum = new int[name.length];
		int [] avg = new int[name.length];
		int [] rank= new int[name.length];
		
		for (int i = 0; i < name.length; i++) {
			sum[i]= kor[i]+eng[i]+mat[i];
			int div = 3;
			if(lol[i]>=0)
			{
				sum[i]+=lol[i];
				div++;
			}
			avg[i]=sum[i]/div;
		}
		
		for (int i = 0; i < avg.length; i++) {
			///i: ���� ����
			rank[i]=1;
			for (int j = 0; j < avg.length; j++) {
				///j: ������
				if(avg[i]<avg[j])
					rank[i]++;
			}
		}
		
		
		///3. ��º�
				String [] grade = {"��","��","��","��","��","��","��","��","��","��","��"};
				
		for (int i = 0; i < name.length; i++) {
		
			String str = 
					name[i]+"\t"+
					kor[i]+"\t"+
					eng[i]+"\t"+
					mat[i]+"\t";
			if(lol[i]>=0)
				str+= lol[i];
			str+= "\t"+sum[i]+"\t"+
					avg[i]+"\t"+
					grade[avg[i]/10]+
					"("+rank[i]+")";
				System.out.println(str);
		}
 
					
		



	


		
	}

}
