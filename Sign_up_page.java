package career_path_guidence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Sign_up_page { 
	private static final String Url="jdbc:mysql://localhost:3306/career_guidance_path";
	private static final String Username="root";
	private static final String Password="root";
	private static  final String Driver="com.mysql.cj.jdbc.Driver";
	private static PreparedStatement pmst;
	private static Connection CONN;
	public static void 	signup() {
		Scanner src =  new Scanner(System.in);
		try {
			Class.forName(Driver);
		    CONN =DriverManager.getConnection(Url, Username, Password);
		    String sql = "insert into user_table (user_FIrstName,user_middleName,user_LastName,user_Email,user_password,User_PhoneNumber)values(?,?,?,?,?,?)";
		    pmst=CONN.prepareStatement(sql);
		    System.out.println("Enter First Name");
		    pmst.setString(1,src.next());
		    System.out.println("Enter Middle Name");
		    pmst.setString(2, src.next());
		    System.out.println("Enter Last Name");
		    pmst.setString(3, src.next());
		    System.out.println("Enter the email_id");
		    pmst.setString(4, src.next());
		    System.out.println("Enter the password");
		    pmst.setString(5, src.next());
		    System.out.println("Enter the Phone Number");
		    pmst.setLong(6, src.nextLong());
		    int i = pmst.executeUpdate();
		    if(i>0)
		    {
		    	System.out.println("REGISTRATION SUCCESSFUL.");
		    }
		    else
		    {
		    	System.out.println("REGISTRATION IS NOT DONE GOT ERROR.");
		    }
		    pmst.close();
		    CONN.close();
		    
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
}

}
