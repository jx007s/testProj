package basic;

public class Home_Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// spe  des yae  sum avg
		
		// 자동차 성능 테스트를 해보세요
		// 각 점수는 만점 :100점 
		/*평점 : 속도 50%, 안정성 : 30%, 연비 : 20%
		
		예시 :  속도 78, 안정성 82  연비 67
		평점 :  78*0.5  +  82 *0.3  +  67 *0.2
		평점 80 이상 -  우수, 70이상 - 보통 , 나머지 - 불량
		모든 점수가 80점이상인 경우 베스트*/
		
		

		String grade;
		int spe = 100 , des = 70 , yae = 80;
		double sum1 = ((spe*0.5) + (des*0.3) + (yae*0.2));
		
		//System.out.println(sum);
		    if( sum1>=80 )
		    {		    	
		    	grade = "우수";
		    	if(spe >=80 && des>=80 && yae>=80)
		    	{
		    	grade = "(Best)";
		    	}	  		    
		    } 
		    else if(sum1 >= 70){
		    	grade= "보통";
		    }
		    else
		    {
		    	grade = "불량";
		    }
		System.out.println("성능점수:"+sum1);
		System.out.println("결과:"+ grade);
		
		System.out.println();
	

		// spe  des yae  sum avg
		/*과목 : 국어  100, 영어 70, 수학  70
	      각대학별 과목 중요도 에 따른 비균등 처리 할 것
	      합격 점수 : 80점

		ex)
		A대학 50%, 30% 20%     50 + 21 + 14 = 85
		B대학 40% 30% 30%
		C대학 30% 20% 50%      30 + 14 + 35 = 79*/
		
		//int, eng  math ; kor
		int kor = 100 ,eng = 60 ,math = 70;
		double    Aun =(kor*0.5)+(eng*0.3)+(math*0.2),
		          Bun =(kor*0.4)+(eng*0.3)+(math*0.3),
		          Cun =(kor*0.3)+(eng*0.2)+(math*0.5);
		String grade1="A대학:",grade2 ,grade3;

		String res = "합격";
		if(Aun < 80)
		{
			res ="불"+res;
		}
			
		grade1 += res;
		
		
		if(Bun >= 80){
			grade2 ="B대학:합격";
		}
		else{
			grade2 = "B대학:불합격";
		}		
		if(Cun >= 80){
			grade3 ="C대학:합격";
		}
		else{
			grade3 ="C대학:불합격";
			
		}
		
		System.out.println(grade1);
		System.out.println(grade2);
		System.out.println(grade3);
		
		System.out.println();
////////////////////////////////////////////////
		/*
		 *  국어, 영어, 수학 의 평균으로 등급을 출력하세요
			수, 우 , 미, 양, 가
			단, 국어, 영어, 수학 모든 과목이 90점 이상일 경우 "우등생" 출력해 주세요

		 */
		
		
		int kor1 = 93, eng1=97, math1 =90; 
		int sum= kor1+eng1+math1;
		double avg = (double)sum/3, avg1= avg*100, avg2 = (int)avg1;
		double avg3 = avg2/100;
		String grade5;
		if(avg3 >= 80)
		{
			grade5 = "수";
			if(kor1>=90 && eng1>=90 && math1>=90){
			grade5 = "우등생"; }
		}
		else if(avg3 >= 70){
			grade5 = "우";
		}
		else if(avg3 >= 60){
			grade5 = "미";
		}		
		else if(avg3 >= 70){
			grade5 = "양";
		}		
		else{
			grade5 = "가";
		}
		System.out.println("이름 :Lee");
		System.out.println("등급:"+ grade5);
		System.out.println("평균:"+ avg3);
		
		
		
		
	}

}
