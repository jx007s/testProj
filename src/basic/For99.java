package basic;

public class For99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int change = 4;
		int limit = 9;
		
		for (int i = 1; i <=limit; i+=change) {
			String line="\n";
			
			int jLimit = i+change-1;
			if(jLimit>limit) jLimit=limit;
			for (int j = i; j <=jLimit; j++) {
				System.out.print(" "+j+" ´Ü \t");
				line+="------\t";
			}
			System.out.println(line);
			for (int j = 1; j <10; j++) {
				for (int k = i; k <=jLimit; k++) {
					System.out.print(k+"x"+j+"="+k*j+"\t");
				}
				
				System.out.println();
				
			}
			System.out.println();
		}
	}

}
