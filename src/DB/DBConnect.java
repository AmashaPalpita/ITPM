/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Amasha
 */
public class DBConnect {
        private static String url = "jdbc:mysql://localhost:3306/timetable";
	private static String user = "root";
	private static String pass = "1234";
	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
                        System.out.println("Database Connection Success!!!");
		} catch (Exception e) {
			System.out.println("Database Connection Failed!!!!");
		}
		
		return conn;
	}
}
