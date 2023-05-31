package db.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class JDBC_Ex {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cban", "root", "@rlaworud809");
			System.out.println("OK");

			Statement stmt = conn.createStatement();

			// 데이터 입력
			String sid = JOptionPane.showInputDialog("번호");
			String sname = JOptionPane.showInputDialog("이름");
			String sdept = JOptionPane.showInputDialog("학과");

			String insertSQL = "INSERT INTO student (id, name, dept) VALUES " +
			        "('" + sid + "','" + sname + "','" + sdept + "')";
			stmt.executeUpdate(insertSQL);
			 

			//데이터수정			
			String updateSQL = "UPDATE student SET " 
			        + "dept = '컴퓨터시스템' " 
			        + "WHERE id = '1111111'";
			stmt.execute(updateSQL);
			
			//데이터 삭제
			String deleteSQL = "DELETE FROM student where id =  'sid'";
			stmt.executeUpdate(deleteSQL);

			// 데이터베이스 읽기
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				System.out.println(id + " : " + name + " : " + dept);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 존재하지 않습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 오류입니다.");
			e.printStackTrace();
		}

	}

}
