package oops;

public class StudArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaStud [] arr2 = new ClaStud[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new ClaStud();
		}
		arr2[0].name = "¼Â¼î¸¶·ç";
		arr2[1].name = "°¡¿µÀÌ";
		arr2[2].name = "³ª¶ô";
		
		arr2[0].jum = new int[]{88,87,85};
		arr2[1].jum = new int[]{99,98,95};
		arr2[2].jum = new int[]{77,79,76};
		
		///ÃÑÁ¡, Æò±Õ
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].jum.length; j++) {
				arr2[i].sum+=arr2[i].jum[j];
			}
			arr2[i].avg = arr2[i].sum/arr2[i].jum.length;
		}
		
		
	}

}
