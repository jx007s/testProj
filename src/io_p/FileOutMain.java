package io_p;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("img/bbb.txt");
			
			String str = "���ȣ�� ��ø�� �и��ϴ�!!!! - �켺�̰� ����";
			
			fos.write(str.getBytes());
			
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
