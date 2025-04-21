package Day3;

class Student {
	private String rollno;
	private String name;
	private String stdname;
	private String stdemail;
	private String stdpassword;

	// public void setRollNumbers(String rollnum) {
	// this.setRollNum = rollnum;}
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdemail() {
		return stdemail;
	}

	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}

	public String getStdpassword() {
		return stdpassword;
	}

	public void setStdpassword(String stdpassword) {
		this.stdpassword = stdpassword;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Student(String rollno, String name, String stdname, String stdemail, String stdpassword) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.stdname = stdname;
		this.stdemail = stdemail;
		this.stdpassword = stdpassword;
	}

}

public class encapulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollno("102");
		System.out.println(s.getRollno());
		s.setStdemail("renu@gmail.com");
		System.out.println(s.getStdemail());
		s.setStdname("renuka");
		System.out.println(s.getStdname());
		s.setName("renu");
		System.out.println(s.getName());
		s.setStdpassword("renuka6666");
		System.out.println(s.getStdpassword());

	}

}
