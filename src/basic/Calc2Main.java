/*
 * 1항 연산자
 *   - : 음수표현 (숫자)
 *   ! : 부정 (boolean)
 *   ++,-- : 증감(1씩 증가, 감소) 
 *    전위처리 연산  ++변수 : 먼저 계산하여 변수에 입력
 *    후위처리 연산  변수++ : 변수 실행 후 ++ 연산
 * 
 * 2항 연산자
 * 
 *   2.1 산술   ---> return 숫자형
 *    +,-,*,/,%
 *    글자는 연산이 되지 않음 에러 --> 숫자만 가능
 *    단 + 는 글자 사용시 문자열을 결합하는 연산자로 사용
 *   2.2 비교  ---> return boolean (true,false)
 *    >  크다    초과
 *    >=  크거나 같다 이상  =가 같이 들어가는 경우 반드시 뒤에써야 한다
 *    <=  작거나 같다  이하    = 가 먼저 입력되는 경우 대입으로 인지
 *    <  작다    미만 
 *    ==  같다
 *    !=  다르다
 *   2.3 논리  ---> return boolean (true,false)
 *    && - and (연산항이 모두 참일때 참)
 *    || -or (연산항 중 하나라도 참이면 참)
 *    ^ -xor (연산항의 값이 다를때만 참)   
 *    Boolean을 연산항으로 사용
 * 2.4 shift 비트 연산 ----> return 2진 자리이동
 *    x<<n  정수x를 n비트 왼쪽으로 이동 오른쪽은 0으로 채움

      x>>n  정수x를 n비트 오른쪽으로 이동    오른쪽은 양수 :0, 음수:1로 채움

     x>>>n 정수x를 n비트 오른쪽으로 이동    오른쪽은 0으로 채움
 
 
         a:1110₂    14
         b:0101₂     5
         
       &   0100
       |   1111
       ^   1011
         
         c=a&b=0100₂   4
         c=a|b=1111₂   15
         c=a^b=1011₂   11
 


 * 
 * 3항 연산자 ---> if문 
 *   조건 ?  참일때 값  : 거짓일때 값
 *   
 *   조건은 boolean 형으로 결과가 유추되야 함
 *   조건이 true -> 참일때 값
 *   조건이 false -> 거짓일때 값
 * 
 * 
 * 형변환 --> 형변환은 아무거나 되는 것이 아닌 변형가능한 자료형만 된다
 *           숫자 <--> 숫자,  char <--> int  char의 숫자값이 있어 int형으로 가능
 *    
 *   묵시적 형변환
 *   : 연산과정에서 자신과 연산되는 자료형으로 결과를 바꾸어 놓는 형변환
 * 
 *   명시적 형변환
 *   : 묵시적 형변환을 피하기 위해 계산되는 과정전에 일시적으로 형을 변환
 *      (자료형)값;  형태로 변환
 * 
 */
package basic;

public class Calc2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2항 연산자
		 * 
		 *   2.1 산술   ---> return 숫자형
		 *    +,-,*,/,%
		 *    글자는 연산이 되지 않음 에러 --> 숫자만 가능
		 *    단 + 는 글자 사용시 문자열을 결합하는 연산자로 사용*/
		int xx = 15, yy = 7;
		int res = xx+yy;
		System.out.println(xx + " + " + yy +" = "+(xx+yy));
		System.out.println(xx + " - " + yy +" = "+(xx-yy));
		System.out.println(xx + " * " + yy +" = "+(xx*yy));
		System.out.println(xx + " / " + yy +" = "+(xx/yy));
		System.out.println(xx + " % " + yy +" = "+(xx%yy));
		
		String str1="이신협", str2="장동건";
		String str3 = str1+str2;
		System.out.println(str1+str2);
		
		String cc = str1+xx;
		
		/*System.out.println(str1-str2);
		System.out.println(str1*str2);
		System.out.println(str1/str2);
		System.out.println(str1%str2);*/
		
		System.out.println();
		 /*2.2 비교  ---> return boolean (true,false)
				 *    >  크다    초과
				 *    >=  크거나 같다 이상  =가 같이 들어가는 경우 반드시 뒤에써야 한다
				 *    <=  작거나 같다  이하    = 가 먼저 입력되는 경우 대입으로 인지
				 *    <  작다    미만 
				 *    ==  같다
				 *    !=  다르다*/
		boolean bo = xx > yy;
		System.out.println(xx + " > " + yy +" = "+ (xx > yy));
		System.out.println(xx + " >= " + yy +" = "+ (xx >= yy));
		System.out.println(xx + " <= " + yy +" = "+ (xx <= yy));
		System.out.println(xx + " < " + yy +" = "+ (xx < yy));
		System.out.println(xx + " == " + yy +" = "+ (xx == yy));
		System.out.println(xx + " != " + yy +" = "+ (xx != yy));
		
		//System.out.println(str1 == yy); 자료형이 변환되지 않는 경우 비교 불가
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		//System.out.println(str1 > str2);
		//System.out.println(str1 >= str2);
		
		System.out.println();
		/*
	2.3 논리  ---> return boolean (true,false)
 *    && - and (연산항이 모두 참일때 참)
 *    || -or (연산항 중 하나라도 참이면 참)
 *    ^ -xor (연산항의 값이 다를때만 참)   
 *    Boolean을 연산항으로 사용
		 */
		
		boolean bo1 = false, bo2 = false;
		System.out.println(bo1 && bo2);
		System.out.println(bo1 || bo2);
		System.out.println(bo1 ^ bo2);
		
		////   월급 >= 1000 ,  키 >=185
		////And 결혼정보회사   and
		////Or 결혼정보회사 or
		////Xor 결혼정보회사  xor
		
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
		 * 2.4 shift 비트 연산 ----> return 2진 자리이동
 *    x<<n  정수x를 n비트 왼쪽으로 이동 오른쪽은 0으로 채움

      x>>n  정수x를 n비트 오른쪽으로 이동    오른쪽은 양수 :0, 음수:1로 채움

     x>>>n 정수x를 n비트 오른쪽으로 이동    오른쪽은 0으로 채움
 
 
         a:1110₂    14
         b:0101₂     5
         
       &   0100
       |   1111
       ^   1011
         
         c=a&b=0100₂   4
         c=a|b=1111₂   15
         c=a^b=1011₂   11
         
         
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
		//  11111111111111111111111111111010  O   (부호에 맞춰서 0, 1을 앞쪽에 추가)	
		System.out.println(Integer.toBinaryString(-6));
		//  11111111111111111111111111111010
		
		
		//20 ->     00000000 00000000 00000000  0001 0100
		//20>>2 ->  00000000 00000000 00000000  0000 0101
		
		System.out.println(20>>>2);   //5
		System.out.println(Integer.toBinaryString(5));
		
		//  11111111111111111111111111101000   -24
		//  00111111111111111111111111111010
		System.out.println(-24>>>2);  //1073741818  //부호와 상관없이 앞에 0 추가
		System.out.println(Integer.toBinaryString(1073741818));
		
		
		
		/*
		  * 3항 연산자 ---> if문 
			 *   조건 ?  참일때 값  : 거짓일때 값
			 *   
			 *   조건은 boolean 형으로 결과가 유추되야 함
			 *   조건이 true -> 참일때 값
			 *   조건이 false -> 거짓일때 값
		 		 
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
		
		String str7 = jum >=80 ? "합격" : "불합격";
		
		System.out.println(str7);
		
		
		String grade  = 
				 
				jum >=90 ? "수":
					jum >=80 ? "우":
						jum >=70 ? "미":
							jum >=60 ? "양":"가"	;
		
							
		System.out.println(sum /3);
		System.out.println("합계:"+sum);
		System.out.println("평균:"+jum);
		System.out.println("등급:"+grade);
		
		
		
		/*
		 * * 1항 연산자
 *   - : 음수표현 (숫자)
 *   ! : 부정 (boolean)
 *   ++,-- : 증감(1씩 증가, 감소) 
 *    전위처리 연산  ++변수 : 먼저 계산하여 변수에 입력
 *    후위처리 연산  변수++ : 변수 실행 후 ++ 연산
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
