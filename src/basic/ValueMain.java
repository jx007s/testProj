/*
 * 자료형 -- 변수의 형을 정의


정수 - 소수점이 없는 숫자
int   32bit( 4byte) -2147483648 ~ 2147483647
long   64b   8     매우 큰 숫자까지 가능  뒤에 l(소문자L) 을 붙인다
short   16b   2     -32768 ~ 32767
 byte   8b   1     -128 ~ 127

실수 - 소수점이 존재하는 숫자
 float   32    => 끝에 f 기재
 double  64

문자
 char    16   2       문자의 입력 '  '안에 입력
          한글자만 가능
 
 문자열 배열?      //문자열의 입력" "안에 입력
 String 


참/거짓
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
		ch = '한';
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
		
		String str = "선생님은 귀여워요";
		
		System.out.println(str);
		
		/// 올림픽 점수기록 -  역도
		String name = "장미란";
		
		int insang = 105;
		
		int jinsang = 130;
		
		int sum = insang + jinsang;
		
		System.out.println(name);
		System.out.println(insang);
		System.out.println(jinsang);
		System.out.println(sum);
	}

}
