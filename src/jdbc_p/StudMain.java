package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					"hr","hr"
					);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from stud");
			
			//birth, tel, email, regdate, grade
			while(rs.next())
			{
				int id = rs.getInt("id");
				String nnn = rs.getString("name");
				Date bbb = rs.getDate("birth");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				Date regdate = rs.getDate("regdate");
				int grade = rs.getInt("grade");
				
				System.out.println(id+" "+nnn+" "+bbb+" "+tel
						+" "+email+" "+regdate+" "+grade);
			}
			
			
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
