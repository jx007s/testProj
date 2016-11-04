package arr;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReport {
	public static void main(String[] args) {
		// 입력부
		Scanner sc = new Scanner(System.in);

		String[] StuName = { "A", "B", "C", "D","E","F","G","H" };
		
		int[] StuClass = { 1, 1, 1, 1, 2, 2, 2, 2 };

		int[] kor = { 88, 77, 68, 96, 89, 65, 90, 88};
		int[] eng = { 82, 79, 65, 93, 81, 98, 95, 90};
		int[] math = { 89, 72, 66, 90, 76, 75, 70, 72};
		int[] lol = { -1, 78, -1, 92,-1, 77, 98, 80, 95};
		int[] poket = { -1, 80, 80, -1, 85, 90, 72, -1};

		int[] sum = new int[StuName.length];
		int[] avg = new int[StuName.length];
		int[] rank = new int[StuName.length];
		int[] cnt = new int[StuName.length];

		int univA=0, cla1=0, male=0;
		
		int[] univRank = new int[StuName.length];
		int[] univSeq = new int[StuName.length];

		int[] ClassRank = new int[StuName.length];
		int[] ClassSeq = new int[StuName.length];

		int[] maleRank = new int[StuName.length];
		int[] maleSeq = new int[StuName.length];

		
		

		String str; // 출력
		
		
		///////////////////////////////////////////////////////////////
		
		for (int i = 0; i < StuName.length; i++) { // sum , avg
			sum[i] = kor[i] + eng[i] + math[i];
			int div = 3;
			if (lol[i] >= 0) {
				sum[i] += lol[i];
				div++;
				univA++;
			}if (poket[i] >= 0) {
				sum[i] += poket[i];
				div++;
				male++;
			}
			if (StuClass[i]==1){
				cla1++;
			} 
			avg[i] = sum[i] / div;
		}
		
		///////////////////////////////////////////////////////////////
		
		for (int i = 0; i < avg.length; i++) { // rank
			cnt[i] = i+1;
			rank[i] = 1;
			univRank[i] = 1;
			ClassRank[i] = 1;
			maleRank[i] = 1;
			if(lol[i] < 0)
				univSeq[i]+=univA;
			if(StuClass[i]==2)
				ClassSeq[i]+=cla1;
			if(poket[i] <0)
				maleSeq[i]+=male;
			
			for (int j = 0; j < avg.length; j++) {
				
				if (avg[i] < avg[j])
				{
					rank[i]++;
					if (lol[i] > 0 == lol[j] > 0){
						univRank[i]++;
						univSeq[i]++;
						
					}
					if (StuClass[i] == StuClass[j]) {
						ClassRank[i]++;
						ClassSeq[i]++;
						
					}if (poket[i] >0 == poket[j] >0 ) {
							maleRank[i]++;
							maleSeq[i]++;
							
					}
				}
			}
		}




		///////////////////////////////////////////////////////////////


		System.out.print("출력상태를 결정  1.일반   2.등수별  3.대학별   4.반별  5.성별    :  ");
		int select = sc.nextInt();
		System.out.println("rank \t ban \t name \t kor \t eng \t math \t lol\t poket\t sum \t avg");

		int [] seq = new int[avg.length];
		int [] rr = new int[avg.length];
		
		if (select == 1) {
			seq = cnt;
			rr = rank;
		}else if (select == 2) {
			seq = rank;
			rr = rank;
		}else if (select == 3) {
			seq = univSeq;
			rr = univRank;
		}else if (select == 4) {
			seq = ClassSeq;
			rr=ClassRank;
		}else if (select == 5) {
			seq = maleSeq;
			rr = maleRank;
		}
		///////////////////// 일반출력
		for (int j = 0; j <= seq.length; j++) {
			for (int i = 0; i < StuName.length; i++) {
				if(j==seq[i])
				{
					str = rr[i] + "\t" + StuClass[i] + "\t" + StuName[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t";
					if (lol[i] >= 0)
						str += lol[i] + "\t";
					else
						str += "\t";
					if (poket[i] >0)
						str += poket[i] + "\t";
					else
						str += "\t";
					str += sum[i] + "\t" + avg[i] + "\t";
					System.out.println(str);
					}
				}
				
			}
		}
}
