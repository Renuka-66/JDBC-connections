package day9;
class student{
private static String message ="Hello girlss";

	static class Action{
		void display() {
			System.out.println(message);
		}
	}
}

public class classes {
	public static void main(String[] args) {
		//student s = new student();
		//student.Action A = s.new Action();
		//A.display();
		student.Action A = new student.Action();
		A.display();
	}

}