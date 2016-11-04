package jdbc_p;

import java.util.ArrayList;

import jdbc_p.model.StudDao;
import jdbc_p.model.StudDto;

public class StudDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudDto> list = new StudDao().list();
		
		for (StudDto dto : list) {
			System.out.println(dto);
		}
		
		StudDto dto = new StudDto();
		dto.setId(11);
		dto.setNnn("±Ë≈¬»Ò");
		dto.setEmail("eee@eee.com");
		dto.setBbbStr("1988-08-08");
		new StudDao().insert(dto);
	}

}
