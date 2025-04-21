package Day3;

import java.util.Scanner;

class pets
{
	private String bread;
	private String name;
	private String colour;
	private	String ownername;
	private String age;
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pets(String bread, String name, String colour, String ownername, String age) {
		super();
		this.bread = bread;
		this.name = name;
		this.colour = colour;
		this.ownername = ownername;
		this.age = age;
	}
	
}
public class pet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pets p = new pets();
		p.setBread(sc.nextLine());
		System.out.println(p.getBread());
		p.setName("ruby");
		System.out.println(p.getName());
		p.setColour("golden sparrow");
		System.out.println(p.getColour());
		p.setOwnername("renu");
		System.out.println(p.getOwnername());
		p.setAge("6");
		System.out.println(p.getAge());
}
}
