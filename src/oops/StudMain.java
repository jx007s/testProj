package oops;

import java.util.Arrays;

//// 이름,  점수 [국어, 영어, 수학], 총점, 평균
class ClaStud
{
	String name, str;
	int [] jum;
	int sum, avg, rank;
}
public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaStud st = new ClaStud();
		st.name = "캔디";
		st.jum = new int[] {99,88,77};
		
		for (int i = 0; i < st.jum.length; i++) {
			st.sum+=st.jum[i];
		}
		st.avg = st.sum/st.jum.length;
		
		System.out.println(st.name);
		System.out.println(Arrays.toString(st.jum));
		System.out.println(st.sum);
		System.out.println(st.avg);
		
		ClaStud st2 = st;
		System.out.println();
		System.out.println(st2.name);
		System.out.println(Arrays.toString(st2.jum));
		System.out.println(st2.sum);
		System.out.println(st2.avg);
		
	}

}
