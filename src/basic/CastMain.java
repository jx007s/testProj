package basic;
/*
 * * ����ȯ --> ����ȯ�� �ƹ��ų� �Ǵ� ���� �ƴ� ���������� �ڷ����� �ȴ�
 *           ���� <--> ����,  char <--> int  char�� ���ڰ��� �־� int������ ����
 *    
 *   ������ ����ȯ
 *   : ����������� �ڽŰ� ����Ǵ� �ڷ������� ����� �ٲپ� ���� ����ȯ
 * 
 *   ����� ����ȯ
 *   : ������ ����ȯ�� ���ϱ� ���� ���Ǵ� �������� �Ͻ������� ���� ��ȯ
 *      (�ڷ���)��;  ���·� ��ȯ
 */
public class CastMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte by = -123;
		int it = by;			///������ ����ȯ
		it = 129;
		byte by2 = (byte)it;	///����� ����ȯ
		
		System.out.println("by:"+by);
		System.out.println("it:"+it);
		System.out.println("by2:"+by2);
		
		boolean bo = true;
		
		//it = (int)bo;  ����ȯ�� ������ �ڷ����� �ִ�
		
		char ch = 'a';
		
		System.out.println("ch:"+ch);
		
		it = ch;
		
		System.out.println("it:"+it);
		
		System.out.println('a'-10);
		
		it = '0';
		
		System.out.println(it);
		
		ch = 99;
		
		System.out.println(ch);
		
		it = 99;
		
		ch = (char)it;
		
		System.out.println(ch);
		
		System.out.println((char)97);
		System.out.println((int)'a');
		System.out.println("��:"+(int)'��');
		
		double dd = it;
		
		System.out.println(dd);
		
		dd = -123.456;
		
		it = (int)dd;
		
		System.out.println(it);
	}

}
