package arr;

public class MulExam {

	public static void main(String[] args) {
		// main ���� ----1

		String [] name ={"�Ѱ���","�ѳ���","�Ѵ���","�Ѷ���"};
		//// ���ڿ� �迭 ���� ( �̸����� ����� 4�� ��������)  --- 2
		int max = -1;   
		/// �ִ� ���� ������ �ޱ� ���� ���� �ּҰ����� �޴´�   ---3
		/// �ֳ��ϸ� ������ ������ ���̳ʽ��� �ɼ��� ���� ����
		int [][] jum = {
			//  ��, ��, ��, ��
				{77,70,75,78,73}, //�Ѱ���
				{90,95,95,98},    //�ѳ���
				{60,65,65,68,63}, //�Ѵ���
				{80,85,88,87},    //�Ѷ���
		};
		
		
		                      //���,        ���(����, ���, ���)
		int [][] res = new int[name.length][3];
		
		///�����
		for (int i = 0; i < jum.length; i++) {
			///�ʱ�ȭ ----11,  ���� ----12
			if(max < jum[i].length) max = jum[i].length;
			
			///for�� ���� (�������� ������ �����ϴ� ����)
			for (int j = 0; j < jum[i].length; j++) {
				///�ʱ�ȭ --13, ����(���񰺼�����) ---14,17,20,  ���� --16,19
				res[i][0]+=jum[i][j];
				///res[i�� ���][0�� ����] �� �� ����� ������ ���� ---15,18
			}
			res[i][1]=res[i][0]/jum[i].length;
		}
		
		/////���
		for (int i = 0; i <res.length; i++) {
			res[i][2]=1;
			for (int j = 0; j < res.length; j++) {
				if(res[i][1]<res[j][1])
					res[i][2]++;
			}
			
		}
		
		///��º�
		
		String [] index = {"����","����"};
		for (int r = 1; r <= jum.length; r++) {
			for (int i = 0; i < jum.length; i++) {
				
				if(res[i][2]==r)
				{
					String str = name[i]+"\t"+index[jum[i].length-max+1]+"\t";
					for (int j = 0; j < jum[i].length; j++) {
						str+=jum[i][j]+"\t";
					}
					if(jum[i].length<max)
						str+="\t";
					for (int j = 0; j < res[i].length; j++) {
						str+=res[i][j]+"\t";
					}
					
					System.out.println(str);
				}
			}
		}
	}

}
