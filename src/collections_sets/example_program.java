package collections_sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example_program {
	private static String First_Name;
	private static String Last_Name;
	private static String Section;
	private static String Studying_year;
	private static String Email_id;
	private static String Address;
	private static Long Phone_number;
	public static String getFirst_Name() {
		return First_Name;
	}
	public static void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public static String getLast_Name() {
		return Last_Name;
	}
	public static void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public static String getSection() {
		return Section;
	}
	public static void setSection(String section) {
		Section = section;
	}
	public static String getStudying_year() {
		return Studying_year;
	}
	public static void setStudying_year(String studying_year) {
		Studying_year = studying_year;
	}
	public static String getEmail_id() {
		return Email_id;
	}
	public static void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public static String getAddress() {
		return Address;
	}
	public static void setAddress(String address) {
		Address = address;
	}
	public static Long getPhone_number() {
		return Phone_number;
	}
	public static void setPhone_number(Long phone_number) {
		Phone_number = phone_number;
	}
	public example_program() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class main_class extends example_program{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		example_program d = new example_program();
		List<example_program> li=new ArrayList<example_program>();
		System.out.println("enter the name of the ppl");
	    d.setFirst_Name(src.next());
	    li.add(d);
	    System.out.println(li);
		}
}