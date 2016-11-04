package basic;

public class For369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=100; i++) {
			String str = "";
			
			int ten = i/10;
			if(ten%3==0 && ten!=0)
				str+="¦";
			
			int one=i%10;
			if(one%3==0 && one!=0)
				str+="¦";
			
			if(str=="") str +=i;
			
			System.out.println(str);
		}
	}

}
