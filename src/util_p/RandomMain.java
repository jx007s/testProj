package util_p;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		Random rd2 = new Random(1);
		Random rd3 = new Random(1);
		
		System.out.println(rd.nextInt(10));
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextLong());
		
		System.out.println();
		for (int i = 0; i <5; i++) {
			System.out.println(rd.nextInt());
		}
		System.out.println();
		for (int i = 0; i <5; i++) {
			System.out.println(rd2.nextInt());
		}
		System.out.println();
		for (int i = 0; i <5; i++) {
			System.out.println(rd3.nextInt());
		}
		
	}

}
