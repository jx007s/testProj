package text_p;
//////////�̸�,����, ����, ���� ���� ����� ����Ͽ�
////80�� �̻��� ��� :   �������
///     �����ΰ�� :   ���̸�

import java.text.DecimalFormat;

public class DecimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "���ϰڴ�";
		int [] jum = {38,87,86};
		int sum=0, cutline =80;
		for (int i : jum) {
			sum+=i;
		}
		int avg = sum/jum.length;
		
		String str = new DecimalFormat("��#;��#").format(avg-cutline);
		
		String res = str.substring(0,1);
		if(res.equals("��"))
		{
			res+=avg;
		}else{
			res+=name;
		}
		
		System.out.println(res);
		
	}

}
