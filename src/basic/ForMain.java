package basic;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i = 0;i<=10;i++) //for�� ���� ��������
		{
			//i = 100;
			sum += i;
			System.out.println("�������� �Ϳ�����"+i+","+sum);
			
			if(i%2==0)
				System.out.println(i+"�� ¦��");
			
			if(i==8)
				break;
			
		}
		
		System.out.println("sum:"+sum);
	}

}
