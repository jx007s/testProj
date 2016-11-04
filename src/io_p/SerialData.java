package io_p;

import java.io.Serializable;

public class SerialData implements Serializable{

	private static final long serialVersionUID = 1234L; 
	
	int a;
	String b;
	public SerialData(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "SerialData [a=" + a + ", b=" + b + "]";
	}
	
	
}
