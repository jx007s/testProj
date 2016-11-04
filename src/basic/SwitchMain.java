package basic;

/*
 *  //if  - > 구간에 의한 분기
 *      avg>= 90 : 수
 *
 *  //switch -> 값에 의한 분기,  실수, boolean 사용 불가
 *      gra -> 과장 : 보너스=200%
       //case 에 같은 값을 넣을 수 없다
 * 
 * switch(값)   //분기문
 * {
 *   case 해당값:
 *    실행 프로세스
 *    break;   //해당 내용만 실행하고 switch를 빠져나온다
 *         //break; 빠져나오는 구문
 * 
 *   case 해당값:
 *    실행 프로세스
 *    break;
 * 
 *   case 해당값:
 *    실행 프로세스
 *    break;
 * 
 *   default:    //기본값 ->  if문의 else처럼사용
 *          //맨 마지막에 작성한다
 *    실행 프로세스
 *    break;     //default 에서는 생략해도 됨
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
				System.out.println("십이예요");
				res = 1111;
				break;
			case 7:
				System.out.println("칠이예요");
				res = 7777;
				break;
			case 6:
				System.out.println("육이예요");
				res = 6666;
				break;
			case 32:
				System.out.println("삼십이예요");
				res = 3232;
				break;
			case 3:
				System.out.println("삼이예요");
				res = 3333;
				break;
			default:
				res = 4321;
		}
		
		System.out.println(res);
	}

}
