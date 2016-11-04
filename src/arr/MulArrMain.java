package arr;

public class MulArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] arr = {					//1차원
				{"0_0","0_1","0_2","0_3"},  //arr[0]
				{"1_0","1_1","1_2","1_3"},  //arr[1]
				{"2_0","2_1","2_2","2_3"}   //arr[2]
		//2차원 arr[?][0],arr[?][1],arr[?][2],arr[?][3]
		};
		
		System.out.println(arr);
		String [] arr1 = {"0","1","2","3"};
		System.out.println(arr1);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"]:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		String [][] arr2 = new String [4][3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr2["+i+"]:");
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
		
		String [] arr4;
		String [][] arr3 = {					//1차원
				{"0_0","0_1","0_2","0_3"},  //arr[0]
				new String [5],
				arr1, //arr[2]
				arr[2],
				arr4 = new String[] {"aaa","bbb"}
		//2차원 arr[?][0],arr[?][1],arr[?][2],arr[?][3]
		};
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("arr3["+i+"]:");
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+",");
			}
			System.out.println();
		}
		
		arr1[1] = "일";
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("arr3["+i+"]:");
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+",");
			}
			System.out.println();
		}
		
		String [] arr5 = {"케로케로케로","중사님","한별아가씨"};
		
		arr3[0] = arr5;
		System.out.println();
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("arr3["+i+"]:");
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+",");
			}
			System.out.println();
		}
		
		String [][] arr7 = new String [3][];
		
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}
		
		String [][][] arr8 = new String [3][5][];
	}

}
