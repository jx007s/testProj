package basic;

public class Home_Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// spe  des yae  sum avg
		
		// �ڵ��� ���� �׽�Ʈ�� �غ�����
		// �� ������ ���� :100�� 
		/*���� : �ӵ� 50%, ������ : 30%, ���� : 20%
		
		���� :  �ӵ� 78, ������ 82  ���� 67
		���� :  78*0.5  +  82 *0.3  +  67 *0.2
		���� 80 �̻� -  ���, 70�̻� - ���� , ������ - �ҷ�
		��� ������ 80���̻��� ��� ����Ʈ*/
		
		

		String grade;
		int spe = 100 , des = 70 , yae = 80;
		double sum1 = ((spe*0.5) + (des*0.3) + (yae*0.2));
		
		//System.out.println(sum);
		    if( sum1>=80 )
		    {		    	
		    	grade = "���";
		    	if(spe >=80 && des>=80 && yae>=80)
		    	{
		    	grade = "(Best)";
		    	}	  		    
		    } 
		    else if(sum1 >= 70){
		    	grade= "����";
		    }
		    else
		    {
		    	grade = "�ҷ�";
		    }
		System.out.println("��������:"+sum1);
		System.out.println("���:"+ grade);
		
		System.out.println();
	

		// spe  des yae  sum avg
		/*���� : ����  100, ���� 70, ����  70
	      �����к� ���� �߿䵵 �� ���� ��յ� ó�� �� ��
	      �հ� ���� : 80��

		ex)
		A���� 50%, 30% 20%     50 + 21 + 14 = 85
		B���� 40% 30% 30%
		C���� 30% 20% 50%      30 + 14 + 35 = 79*/
		
		//int, eng  math ; kor
		int kor = 100 ,eng = 60 ,math = 70;
		double    Aun =(kor*0.5)+(eng*0.3)+(math*0.2),
		          Bun =(kor*0.4)+(eng*0.3)+(math*0.3),
		          Cun =(kor*0.3)+(eng*0.2)+(math*0.5);
		String grade1="A����:",grade2 ,grade3;

		String res = "�հ�";
		if(Aun < 80)
		{
			res ="��"+res;
		}
			
		grade1 += res;
		
		
		if(Bun >= 80){
			grade2 ="B����:�հ�";
		}
		else{
			grade2 = "B����:���հ�";
		}		
		if(Cun >= 80){
			grade3 ="C����:�հ�";
		}
		else{
			grade3 ="C����:���հ�";
			
		}
		
		System.out.println(grade1);
		System.out.println(grade2);
		System.out.println(grade3);
		
		System.out.println();
////////////////////////////////////////////////
		/*
		 *  ����, ����, ���� �� ������� ����� ����ϼ���
			��, �� , ��, ��, ��
			��, ����, ����, ���� ��� ������ 90�� �̻��� ��� "����" ����� �ּ���

		 */
		
		
		int kor1 = 93, eng1=97, math1 =90; 
		int sum= kor1+eng1+math1;
		double avg = (double)sum/3, avg1= avg*100, avg2 = (int)avg1;
		double avg3 = avg2/100;
		String grade5;
		if(avg3 >= 80)
		{
			grade5 = "��";
			if(kor1>=90 && eng1>=90 && math1>=90){
			grade5 = "����"; }
		}
		else if(avg3 >= 70){
			grade5 = "��";
		}
		else if(avg3 >= 60){
			grade5 = "��";
		}		
		else if(avg3 >= 70){
			grade5 = "��";
		}		
		else{
			grade5 = "��";
		}
		System.out.println("�̸� :Lee");
		System.out.println("���:"+ grade5);
		System.out.println("���:"+ avg3);
		
		
		
		
	}

}
