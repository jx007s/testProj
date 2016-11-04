package basic;

public class ForHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(" 0123456789");
		for (int i = 0; i <n*2; i++) {
			System.out.print(i);
			for (int j = 0; j < n*2; j++) {
				char ch = ' ';
				if(j<n)
				{
					if(i<n)
					{
						if(j<n-i)
							ch='*';
					}else{
						if(j<=i-n)
							ch='*';
					}
				}else{
					ch = '*';
					if(i<n)
					{
						if(j-n<i)
							ch=' ';
					}else{
						if(j<n*3-i-2)
							ch=' ';
					}
				}
					
				
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
