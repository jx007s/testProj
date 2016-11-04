package basic;

public class ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		////1
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			//System.out.print(" ");
			System.out.println();
		}
		
		////2
		System.out.println();
		for (int i = 0; i <5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		////3
		
	/*   
	 ????*
	 ???**
	 ??***
	 ?****
	 *****
	 *
	*/
		System.out.println();
		//물음표2개
		/*int i = 3;
		for (int j = 4; j >i; j--) {
			System.out.print("?");
		}
		///별표3개
		for(int j=0 ;j<=i ;j++ )
		{
			System.out.print("*");
		}*/
		
		
		for (int i = 0; i <5; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print(" ");
			}//물음표2개
			
			///별표3개
			for(int j=0 ;j<=i ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
