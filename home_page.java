package career_path_guidence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class home_page {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		login_page lp = new login_page();
		Sign_up_page sp = new Sign_up_page();
		System.out.println("1.sign up");
		System.out.println("2.login");
		int choice;
		System.out.println("Enter your Choice");
		choice = src.nextInt();
		switch (choice) {
		case 1:
			sp.signup();
			break;
		case 2:
			lp.Login();
			break;
		}

	}

}
