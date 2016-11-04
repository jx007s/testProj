package arr;

public class MulExam {

	public static void main(String[] args) {
		// main 진입 ----1

		String [] name ={"한가인","한나인","한다인","한라인"};
		//// 문자열 배열 선언 ( 이름으로 사용함 4명 지정했음)  --- 2
		int max = -1;   
		/// 최대 과목 갯수를 받기 위한 변수 최소값으로 받는다   ---3
		/// 왜냐하면 과목의 갯수가 마이너스가 될수는 없기 때문
		int [][] jum = {
			//  국, 영, 수, 롤
				{77,70,75,78,73}, //한가인
				{90,95,95,98},    //한나인
				{60,65,65,68,63}, //한다인
				{80,85,88,87},    //한라인
		};
		
		
		                      //사람,        결과(총점, 평균, 등수)
		int [][] res = new int[name.length][3];
		
		///연산부
		for (int i = 0; i < jum.length; i++) {
			///초기화 ----11,  조건 ----12
			if(max < jum[i].length) max = jum[i].length;
			
			///for문 진행 (실질적인 점수를 누적하는 구문)
			for (int j = 0; j < jum[i].length; j++) {
				///초기화 --13, 조건(과목갰수까지) ---14,17,20,  증감 --16,19
				res[i][0]+=jum[i][j];
				///res[i는 사람][0은 총점] 에 각 사람의 점수를 누적 ---15,18
			}
			res[i][1]=res[i][0]/jum[i].length;
		}
		
		/////등수
		for (int i = 0; i <res.length; i++) {
			res[i][2]=1;
			for (int j = 0; j < res.length; j++) {
				if(res[i][1]<res[j][1])
					res[i][2]++;
			}
			
		}
		
		///출력부
		
		String [] index = {"여자","남자"};
		for (int r = 1; r <= jum.length; r++) {
			for (int i = 0; i < jum.length; i++) {
				
				if(res[i][2]==r)
				{
					String str = name[i]+"\t"+index[jum[i].length-max+1]+"\t";
					for (int j = 0; j < jum[i].length; j++) {
						str+=jum[i][j]+"\t";
					}
					if(jum[i].length<max)
						str+="\t";
					for (int j = 0; j < res[i].length; j++) {
						str+=res[i][j]+"\t";
					}
					
					System.out.println(str);
				}
			}
		}
	}

}
