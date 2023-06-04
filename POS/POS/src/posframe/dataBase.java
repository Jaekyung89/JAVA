package posframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/selfpos",
					"root", "");
			System.out.println("OK");
			
			Statement stmt = conn.createStatement();
			
			//DB 읽기 meal 부분 수정하면 됨
			ResultSet rs = stmt.executeQuery("SELECT * FROM meal;");
			
			while(rs.next()) {
				String NAME = rs.getString("NAME");
				int PRICE = rs.getInt("PRICE");
				int STOCK = rs.getInt("STOCK");
				System.out.println(NAME);
				System.out.println("가격 : " + PRICE);
				System.out.println("재고 : " + STOCK);
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("NO");
			e.printStackTrace();
			
			
		} catch(SQLException e) {
			System.out.println("SQL ERROR");
			e.printStackTrace();
			
		}

	}

}
