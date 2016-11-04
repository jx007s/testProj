package basic;

public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 12; i++) {
			System.out.println(i+"½Ã >>>>>>>>");
			
			for (int j = 0; j < 60; j++) {
				//System.out.println(i+":"+j);
				
				System.out.print(j+",");
			}
			System.out.print("\n");
		}
		
		
		for (int i = 2; i < 10; i++) {
			System.out.println("<<<<<<<<"+i+"´Ü >>>>>>>>");
			
			for (int j = 1; j <10; j++) {
				
				System.out.println("\t"+i+" x "+j + " = "+i*j);
			}
			System.out.print("\n");
		}
		
		
		
	}

}
