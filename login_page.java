package career_path_guidence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class login_page {
	private static final String Url="jdbc:mysql://localhost:3306/career_guidance_path";
	private static final String Username="root";
	private static final String Password="root";
	private static  final String Driver="com.mysql.cj.jdbc.Driver";
	private static PreparedStatement pmst;
	private static Connection CONN;
	public static void Login() {
		Scanner src =  new Scanner(System.in);
		try {
			Class.forName(Driver);
		    CONN =DriverManager.getConnection(Url, Username, Password);
		    String sql = "select  * from user_table where user_Email=? and user_password=? ";
		    pmst=CONN.prepareStatement(sql);
		    System.out.println("Enter Email id");
		    pmst.setString(1,src.next());
		    System.out.println("Enter password");
		    pmst.setString(2, src.next());
		    
		    ResultSet RS = pmst.executeQuery();
		    if (RS.next()) {
                System.out.println("✅ You have logged in successfully!");
            } else {
                System.out.println("❌ Invalid email or password. Please try again.");
            }

		    pmst.close();
		    CONN.close();
		    RS.close();
		    
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
}

}



