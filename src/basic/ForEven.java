package basic;

public class ForEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		for (int i = 0; i <=20; i+=2) {
			//if(i%2==0)
				sum += i;
		}
		
		System.out.println(sum);
		//1,2,¦,4,5,¦,7,8,¦,10,11,12,¦14,15,¦,17,18,¦,20,
		
		for (int i = 1; i <=20; i++) {
			
			int one = i%10;
			if(one%3==0 && one!=0)
				System.out.println("¦");
			else
				System.out.println(i);	
		}
	}

}
