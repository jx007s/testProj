/*
 * �ڷ��� -- ������ ���� ����


���� - �Ҽ����� ���� ����
int   32bit( 4byte) -2147483648 ~ 2147483647
long   64b   8     �ſ� ū ���ڱ��� ����  �ڿ� l(�ҹ���L) �� ���δ�
short   16b   2     -32768 ~ 32767
 byte   8b   1     -128 ~ 127

�Ǽ� - �Ҽ����� �����ϴ� ����
 float   32    => ���� f ����
 double  64

����
 char    16   2       ������ �Է� '  '�ȿ� �Է�
          �ѱ��ڸ� ����
 
 ���ڿ� �迭?      //���ڿ��� �Է�" "�ȿ� �Է�
 String 


��/����
boolean  1
 */
 
package basic;

public class ValueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bb = true;
		bb = false;
		//bb = 0;
		//bb = TRUE;
		System.out.println(bb);
		
		char ch = 'a';
		//ch = "a";
		//ch = 'avde';
		ch = '��';
		System.out.println(ch);
		
		byte by = 127;
		//byte by2 = by +1;
		System.out.println(by);
		
		short sh = 32767;
		
		System.out.println(sh);
		
		int ii = 2123456789;
		System.out.println(ii);
		
		long lo = 2123456789234L;
		System.out.println(lo);
		
		float ff = 1234.456F;
		System.out.println(ff);
		
		double dd = 123456.456;
		System.out.println(dd);
		
		String str = "�������� �Ϳ�����";
		
		System.out.println(str);
		
		/// �ø��� ������� -  ����
		String name = "��̶�";
		
		int insang = 105;
		
		int jinsang = 130;
		
		int sum = insang + jinsang;
		
		System.out.println(name);
		System.out.println(insang);
		System.out.println(jinsang);
		System.out.println(sum);
	}

}
