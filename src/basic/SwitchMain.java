package basic;

/*
 *  //if  - > ������ ���� �б�
 *      avg>= 90 : ��
 *
 *  //switch -> ���� ���� �б�,  �Ǽ�, boolean ��� �Ұ�
 *      gra -> ���� : ���ʽ�=200%
       //case �� ���� ���� ���� �� ����
 * 
 * switch(��)   //�б⹮
 * {
 *   case �ش簪:
 *    ���� ���μ���
 *    break;   //�ش� ���븸 �����ϰ� switch�� �������´�
 *         //break; ���������� ����
 * 
 *   case �ش簪:
 *    ���� ���μ���
 *    break;
 * 
 *   case �ش簪:
 *    ���� ���μ���
 *    break;
 * 
 *   default:    //�⺻�� ->  if���� elseó�����
 *          //�� �������� �ۼ��Ѵ�
 *    ���� ���μ���
 *    break;     //default ������ �����ص� ��
 * 
 * }
 * 
 * 
 * 
 */
public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res ;//= 1234;
		switch(6)
		{
			case 10:
				System.out.println("���̿���");
				res = 1111;
				break;
			case 7:
				System.out.println("ĥ�̿���");
				res = 7777;
				break;
			case 6:
				System.out.println("���̿���");
				res = 6666;
				break;
			case 32:
				System.out.println("����̿���");
				res = 3232;
				break;
			case 3:
				System.out.println("���̿���");
				res = 3333;
				break;
			default:
				res = 4321;
		}
		
		System.out.println(res);
	}

}
