package basic;
/*
 * * 형변환 --> 형변환은 아무거나 되는 것이 아닌 변형가능한 자료형만 된다
 *           숫자 <--> 숫자,  char <--> int  char의 숫자값이 있어 int형으로 가능
 *    
 *   묵시적 형변환
 *   : 연산과정에서 자신과 연산되는 자료형으로 결과를 바꾸어 놓는 형변환
 * 
 *   명시적 형변환
 *   : 묵시적 형변환을 피하기 위해 계산되는 과정전에 일시적으로 형을 변환
 *      (자료형)값;  형태로 변환
 */
public class CastMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte by = -123;
		int it = by;			///묵시적 형변환
		it = 129;
		byte by2 = (byte)it;	///명시적 형변환
		
		System.out.println("by:"+by);
		System.out.println("it:"+it);
		System.out.println("by2:"+by2);
		
		boolean bo = true;
		
		//it = (int)bo;  형변환도 가능한 자료형이 있다
		
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
		System.out.println("ㄱ:"+(int)'ㄱ');
		
		double dd = it;
		
		System.out.println(dd);
		
		dd = -123.456;
		
		it = (int)dd;
		
		System.out.println(it);
	}

}
