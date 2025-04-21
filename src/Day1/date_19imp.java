package Day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class date_19imp {
	public static void main(String[] args) {
		
	}
        private static final String Url="jdbc:mysql://localhost:3306/career_guidance_path";
		private static final String Username="root";
		private static final String Password="root";
		private static  final String Driver="com.mysql.cj.jdbc.Driver";
		private static PreparedStatement pmst;
		private static Connection CONN;
		private static void login() {
			Scanner src = new Scanner(System.in);
	    try {
	        Class.forName(Driver);
	        CONN = DriverManager.getConnection(Url, Username, Password);
	        String sql = "SELECT * FROM user_table WHERE user_Email=? AND user_password=?";
	        pmst = CONN.prepareStatement(sql);

	        System.out.println("Enter Email ID:");
	        pmst.setString(1, src.next());
	        System.out.println("Enter Password:");
	        pmst.setString(2, src.next());

	        ResultSet RS = pmst.executeQuery();

	        if (RS.next()) {
	            System.out.println("✅ You have logged in successfully!");

	            // Start guidance section
	            System.out.println("\nLet's understand your current education status.");
	            System.out.println("Are you currently studying? (yes/no)");
	            String studying = src.next().toLowerCase();

	            String currentStudy = "";
	            String highestEducation = "";
	            String careerGap = "";

	            if (studying.equals("yes")) {
	                System.out.println("What are you currently studying?");
	                System.out.println("1. 10th\n2. 11th\n3. 12th\n4. Degree\n5. Other");
	                int studyOption = src.nextInt();

	                switch (studyOption) {
	                    case 1: currentStudy = "10th"; break;
	                    case 2: currentStudy = "11th"; break;
	                    case 3: currentStudy = "12th"; break;
	                    case 4: currentStudy = "Degree"; break;
	                    case 5: currentStudy = "Other"; break;
	                    default: currentStudy = "Unknown"; break;
	                }

	                System.out.println("Do you have any career gap? (yes/no)");
	                careerGap = src.next().toLowerCase();
	            } else {
	                System.out.println("What is your highest qualification?");
	                highestEducation = src.next();
	                System.out.println("How many years of career gap do you have?");
	                careerGap = src.next();
	            }

	            // Suggestion based on input
	            System.out.println("\n🎯 Career Guidance for You:");

	            if (!currentStudy.isEmpty()) {
	                switch (currentStudy) {
	                    case "10th":
	                        System.out.println("Consider Science/Commerce/Arts for 11th-12th based on your interest.");
	                        break;
	                    case "11th":
	                        System.out.println("Focus on entrance exams like JEE/NEET or career-specific certifications.");
	                        break;
	                    case "12th":
	                        System.out.println("Explore UG programs (B.Tech, B.Sc, B.Com, etc.) or diploma courses.");
	                        break;
	                    case "Degree":
	                        System.out.println("You can look into internships, higher studies (PG), or certifications.");
	                        break;
	                    default:
	                        System.out.println("Explore short-term courses or online programs to build skills.");
	                        break;
	                }

	                if (careerGap.equals("yes")) {
	                    System.out.println("✨ Consider explaining the gap and taking up internships, freelance projects, or certifications to bridge it.");
	                }
	            } else {
	                System.out.println("With " + highestEducation + ", consider relevant job roles or post-graduate options.");
	                if (!careerGap.equals("no")) {
	                    System.out.println("🔁 Consider a career restart program or upskill with short-term certifications.");
	                }
	            }
	        } else {
	            System.out.println("❌ Invalid email or password. Please try again.");
	        }

	        // Cleanup
	        RS.close();
	        pmst.close();
	        CONN.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	}
	}

