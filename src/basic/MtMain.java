package basic;

public class MtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String team = "������";
		String mt;
		switch(team)
		{
		 case "������":
			 mt = "��";
			 break;
		 case "�λ��":
			 mt = "�ٴ�";
			 break;
		 case "�κ�":
			 mt = "�ȹ�";
			 break;
		 case "�κ�":
			 mt = "���";
			 break;
		 default:
			 mt = "�ܾ�";
		
		}
		
		System.out.println(team+":"+mt);
		
		 //���� : 50%, ���� : 30%, �븮 : 20%, ���:10%
		String grade = "�븮";
		int base = 300;
		double bonus=0.123456;
		switch(grade)
		{
			case "����":
				bonus = 0.5;
				break;
			case "����":
				bonus = 0.3;
				break;
			case "�븮":
				bonus = 0.2;
				break;
			case "���":
				bonus = 0.1;
				break;
		}
		
		int money = (int)(base * (1+bonus));
		System.out.println(money);
	}

}
