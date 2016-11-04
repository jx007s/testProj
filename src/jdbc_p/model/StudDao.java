package jdbc_p.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudDao {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public StudDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.30.135:1521:orcl",
					"hr","hr"
					);
			
			stmt = con.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/////리스트가져오기
	public ArrayList<StudDto> list()
	{
		ArrayList<StudDto> res = new ArrayList<>();

		try {

			sql ="select * from stud";
			rs = stmt.executeQuery(sql);
			
			//birth, tel, email, regdate, grade
			while(rs.next())
			{
				StudDto dto = new StudDto();
				dto.id = rs.getInt("id");
				dto.nnn = rs.getString("name");
				dto.bbb = rs.getDate("birth");
				dto.tel = rs.getString("tel");
				dto.email = rs.getString("email");
				dto.regdate = rs.getDate("regdate");
				dto.grade = rs.getInt("grade");
				
				res.add(dto);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}

		return res;
	}
	
	
	///삽입
	public void insert(StudDto dto)
	{
		try {

			sql = "insert into stud (id,birth, name, email) "
					+ "values ("+dto.id+
					",'"+dto.getBbbStr()+
					"','"+dto.nnn+
					"','"+dto.email+
					"')";
			System.out.println(sql);
			stmt.executeUpdate(sql);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
	}
	
	public void close()
	{
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
		
	}
	
}
