/*
 * 1�� ������
 *   - : ����ǥ�� (����)
 *   ! : ���� (boolean)
 *   ++,-- : ����(1�� ����, ����) 
 *    ����ó�� ����  ++���� : ���� ����Ͽ� ������ �Է�
 *    ����ó�� ����  ����++ : ���� ���� �� ++ ����
 * 
 * 2�� ������
 * 
 *   2.1 ���   ---> return ������
 *    +,-,*,/,%
 *    ���ڴ� ������ ���� ���� ���� --> ���ڸ� ����
 *    �� + �� ���� ���� ���ڿ��� �����ϴ� �����ڷ� ���
 *   2.2 ��  ---> return boolean (true,false)
 *    >  ũ��    �ʰ�
 *    >=  ũ�ų� ���� �̻�  =�� ���� ���� ��� �ݵ�� �ڿ���� �Ѵ�
 *    <=  �۰ų� ����  ����    = �� ���� �ԷµǴ� ��� �������� ����
 *    <  �۴�    �̸� 
 *    ==  ����
 *    !=  �ٸ���
 *   2.3 ��  ---> return boolean (true,false)
 *    && - and (�������� ��� ���϶� ��)
 *    || -or (������ �� �ϳ��� ���̸� ��)
 *    ^ -xor (�������� ���� �ٸ����� ��)   
 *    Boolean�� ���������� ���
 * 2.4 shift ��Ʈ ���� ----> return 2�� �ڸ��̵�
 *    x<<n  ����x�� n��Ʈ �������� �̵� �������� 0���� ä��

      x>>n  ����x�� n��Ʈ ���������� �̵�    �������� ��� :0, ����:1�� ä��

     x>>>n ����x�� n��Ʈ ���������� �̵�    �������� 0���� ä��
 
 
         a:1110��    14
         b:0101��     5
         
       &   0100
       |   1111
       ^   1011
         
         c=a&b=0100��   4
         c=a|b=1111��   15
         c=a^b=1011��   11
 


 * 
 * 3�� ������ ---> if�� 
 *   ���� ?  ���϶� ��  : �����϶� ��
 *   
 *   ������ boolean ������ ����� ���ߵǾ� ��
 *   ������ true -> ���϶� ��
 *   ������ false -> �����϶� ��
 * 
 * 
 * ����ȯ --> ����ȯ�� �ƹ��ų� �Ǵ� ���� �ƴ� ���������� �ڷ����� �ȴ�
 *           ���� <--> ����,  char <--> int  char�� ���ڰ��� �־� int������ ����
 *    
 *   ������ ����ȯ
 *   : ����������� �ڽŰ� ����Ǵ� �ڷ������� ����� �ٲپ� ���� ����ȯ
 * 
 *   ����� ����ȯ
 *   : ������ ����ȯ�� ���ϱ� ���� ���Ǵ� �������� �Ͻ������� ���� ��ȯ
 *      (�ڷ���)��;  ���·� ��ȯ
 * 
 */
package basic;

public class Calc2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2�� ������
		 * 
		 *   2.1 ���   ---> return ������
		 *    +,-,*,/,%
		 *    ���ڴ� ������ ���� ���� ���� --> ���ڸ� ����
		 *    �� + �� ���� ���� ���ڿ��� �����ϴ� �����ڷ� ���*/
		int xx = 15, yy = 7;
		int res = xx+yy;
		System.out.println(xx + " + " + yy +" = "+(xx+yy));
		System.out.println(xx + " - " + yy +" = "+(xx-yy));
		System.out.println(xx + " * " + yy +" = "+(xx*yy));
		System.out.println(xx + " / " + yy +" = "+(xx/yy));
		System.out.println(xx + " % " + yy +" = "+(xx%yy));
		
		String str1="�̽���", str2="�嵿��";
		String str3 = str1+str2;
		System.out.println(str1+str2);
		
		String cc = str1+xx;
		
		/*System.out.println(str1-str2);
		System.out.println(str1*str2);
		System.out.println(str1/str2);
		System.out.println(str1%str2);*/
		
		System.out.println();
		 /*2.2 ��  ---> return boolean (true,false)
				 *    >  ũ��    �ʰ�
				 *    >=  ũ�ų� ���� �̻�  =�� ���� ���� ��� �ݵ�� �ڿ���� �Ѵ�
				 *    <=  �۰ų� ����  ����    = �� ���� �ԷµǴ� ��� �������� ����
				 *    <  �۴�    �̸� 
				 *    ==  ����
				 *    !=  �ٸ���*/
		boolean bo = xx > yy;
		System.out.println(xx + " > " + yy +" = "+ (xx > yy));
		System.out.println(xx + " >= " + yy +" = "+ (xx >= yy));
		System.out.println(xx + " <= " + yy +" = "+ (xx <= yy));
		System.out.println(xx + " < " + yy +" = "+ (xx < yy));
		System.out.println(xx + " == " + yy +" = "+ (xx == yy));
		System.out.println(xx + " != " + yy +" = "+ (xx != yy));
		
		//System.out.println(str1 == yy); �ڷ����� ��ȯ���� �ʴ� ��� �� �Ұ�
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		//System.out.println(str1 > str2);
		//System.out.println(str1 >= str2);
		
		System.out.println();
		/*
	2.3 ��  ---> return boolean (true,false)
 *    && - and (�������� ��� ���϶� ��)
 *    || -or (������ �� �ϳ��� ���̸� ��)
 *    ^ -xor (�������� ���� �ٸ����� ��)   
 *    Boolean�� ���������� ���
		 */
		
		boolean bo1 = false, bo2 = false;
		System.out.println(bo1 && bo2);
		System.out.println(bo1 || bo2);
		System.out.println(bo1 ^ bo2);
		
		////   ���� >= 1000 ,  Ű >=185
		////And ��ȥ����ȸ��   and
		////Or ��ȥ����ȸ�� or
		////Xor ��ȥ����ȸ��  xor
		
		int money = 300;
		double height = 189.6;
		
		/*boolean mm = money >=1000, hh = height >= 185;
		
		System.out.println("And:"+(mm && hh));
		System.out.println("Or:"+(mm || hh));
		System.out.println("Xor:"+(mm ^ hh));*/
		
		System.out.println("And:"+(money >=1000 && height >= 185));
		System.out.println("Or:"+(money >=1000 || height >= 185));
		System.out.println("Xor:"+(money >=1000 ^ height >= 185));
		
		
		
		System.out.println();
		/*
		 * 2.4 shift ��Ʈ ���� ----> return 2�� �ڸ��̵�
 *    x<<n  ����x�� n��Ʈ �������� �̵� �������� 0���� ä��

      x>>n  ����x�� n��Ʈ ���������� �̵�    �������� ��� :0, ����:1�� ä��

     x>>>n ����x�� n��Ʈ ���������� �̵�    �������� 0���� ä��
 
 
         a:1110��    14
         b:0101��     5
         
       &   0100
       |   1111
       ^   1011
         
         c=a&b=0100��   4
         c=a|b=1111��   15
         c=a^b=1011��   11
         
         
         0000 0000  0
         0000 0001  1
         0000 0010  2
         ...
         0111 1111 127
         
         -------
         1000 0000 -128
         1000 0001 -127  ==> 129
         1000 0010 -126
         1111 1111 -1   ==> 255
		 */
		
		
		System.out.println(215 & 432);
		System.out.println(215 | 432);
		System.out.println(215 ^ 432);
		
		int aaa = 255;
		
		byte by = (byte)aaa;
		
		System.out.println(by);
		
		//5 ->     0000 0101
		// 5<<2 -> 0001 0100
//		              4 3210
     		//      16+0+4+0+0
		System.out.println();
		
		System.out.println(5<<2);
		
		//20 ->     00000000 00000000 00000000  0001 0100
		//20>>2 ->  00000000 00000000 00000000  0000 0101
		// 5>>2 ->  00000000 00000000 00000000  0000 0001
		System.out.println(20>>2);
		System.out.println(5>>2);
		
		System.out.println(-24);
		System.out.println(Integer.toBinaryString(-24));
		//  11111111111111111111111111101000
		//  11111111111111111111111110100000

		System.out.println(-24<<2);
		System.out.println(Integer.toBinaryString(-96));
		//  11111111111111111111111110100000
		
		System.out.println(-24>>2);  //-6
		//  11111111111111111111111111101000   -24
		//  00111111111111111111111111111010  x
		//  11111111111111111111111111111010  O   (��ȣ�� ���缭 0, 1�� ���ʿ� �߰�)	
		System.out.println(Integer.toBinaryString(-6));
		//  11111111111111111111111111111010
		
		
		//20 ->     00000000 00000000 00000000  0001 0100
		//20>>2 ->  00000000 00000000 00000000  0000 0101
		
		System.out.println(20>>>2);   //5
		System.out.println(Integer.toBinaryString(5));
		
		//  11111111111111111111111111101000   -24
		//  00111111111111111111111111111010
		System.out.println(-24>>>2);  //1073741818  //��ȣ�� ������� �տ� 0 �߰�
		System.out.println(Integer.toBinaryString(1073741818));
		
		
		
		/*
		  * 3�� ������ ---> if�� 
			 *   ���� ?  ���϶� ��  : �����϶� ��
			 *   
			 *   ������ boolean ������ ����� ���ߵǾ� ��
			 *   ������ true -> ���϶� ��
			 *   ������ false -> �����϶� ��
		 		 
		 */
		
		int xxx = false ?  10  : 5 ;
		
		System.out.println(xxx);
		
		
		int kor = 87, eng = 98, mat =66;
		int sum = kor+eng+mat;
		
		// 8333.0 / 100
		int pos = 10000;
		
		double jum = (double)(int)((double)sum /3*pos +0.5)/pos;
		
		
		
		
		/*int ii = (int)jum;
		
		jum = (double)ii;
		
		jum = jum /100;*/
		
		String str7 = jum >=80 ? "�հ�" : "���հ�";
		
		System.out.println(str7);
		
		
		String grade  = 
				 
				jum >=90 ? "��":
					jum >=80 ? "��":
						jum >=70 ? "��":
							jum >=60 ? "��":"��"	;
		
							
		System.out.println(sum /3);
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+jum);
		System.out.println("���:"+grade);
		
		
		
		/*
		 * * 1�� ������
 *   - : ����ǥ�� (����)
 *   ! : ���� (boolean)
 *   ++,-- : ����(1�� ����, ����) 
 *    ����ó�� ����  ++���� : ���� ����Ͽ� ������ �Է�
 *    ����ó�� ����  ����++ : ���� ���� �� ++ ����
		 */
		
		
		int a = 56;
		
		System.out.println(-a);
		
		boolean boo = true;
		
		System.out.println(boo);
		
		System.out.println(!boo);
		
		int xyz = 10;
		
		System.out.println(xyz);
		
		//xyz = xyz +1;
		
		//++xyz;
		
		System.out.println(++xyz);
		
		System.out.println(xyz);
	}

}
