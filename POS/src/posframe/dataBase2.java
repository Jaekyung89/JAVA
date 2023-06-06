package posframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class dataBase2 {

	
	public dataBase2(String id, String money) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/selfpos",
					"root", "@rlaworud809");
			System.out.println("OK");
			
			Statement stmt = conn.createStatement();
			
			  // 데이터 입력
	         id = JOptionPane.showInputDialog("id");
	         money = JOptionPane.showInputDialog("money");

	         String insertSQL = "INSERT INTO membership (id, name) VALUES " +
	                 "('" + id + "','" + money + "')";
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
