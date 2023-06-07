package posframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class dataBase2 {

	
	public dataBase2(String id, String money) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/selfpos",
					"root", "1234");
			System.out.println("OK");
			
			Statement stmt = conn.createStatement();
			
			  // 데이터 입력
	         String ID = id;
	         String Point = money;

	         String insertSQL = "INSERT INTO selfpos.membership (ID, `Point`) VALUES " +
	                 "('" + ID + "','" + Point + "')";
	         stmt.executeUpdate(insertSQL);
	         
	         
	         
	         
	         
	         
	         /*
	         ResultSet rs = stmt.executeQuery("SELECT * FROM membership");

	         while (rs.next()) {
	            String id = rs.getString(1);
	            String name = rs.getString("name");
	            String dept = rs.getString("dept");
	            System.out.println(id + " : " + name + " : " + dept);
	         }
*/
	          

		} catch (ClassNotFoundException e) {
			System.out.println("NO");
			e.printStackTrace();
			
			
		} catch(SQLException e) {
			System.out.println("SQL ERROR");
			e.printStackTrace();
			
		}

	}

}
