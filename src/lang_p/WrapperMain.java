package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1234";
		int ii = Integer.parseInt(str);
		double dd = Double.parseDouble("123.456");
		System.out.println(ii+100);
		System.out.println(dd+100);
		
		Double dd2 = new Double(123.456);
		System.out.println(dd2+100);
		System.out.println(dd2.doubleValue()+100);
		System.out.println(dd2.toString()+100);
		
		Double dd3 = new Double("789.543");
		System.out.println(dd3+100);
		System.out.println(dd3.doubleValue()+100);
		System.out.println(dd3.toString()+100);
		
	}

}
