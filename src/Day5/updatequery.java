package Day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatequery {
	private static final String driver = "Com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/";
	private static final String username="root";
	private static final String password="root";
	private static PreparedStatement pmst;
	private static Connection Conn;
	public static void main(String[] args) {
		
		try{
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
		    Conn = DriverManager.getConnection(url, username, password);
			String sql = "update renuka set email=? where password=?";
			System.out.println("enter the email id: ");
			pmst.setString(1, src.next());
			System.out.println("enter the password: ");
			pmst.setString(2, src.next());
			int i = pmst.executeUpdate(sql);
			if( i>0) {
				System.out.println("updation of query is done.");
			}
			else {
				System.out.println("updation of query is  not done.");
			}
			pmst.close();
			Conn.close();
			src.close();
		}
		
			catch(Exception e) {
				e.printStackTrace();
				
			}
		
	}


}
