package day9;
abstract class users{
	abstract void display();
	}

public class Abstract {
	public static void main(String[] args) {
	users u = new users() {
		
		@Override
		void display() {
			// TODO Auto-generated method stub
			System.out.println("giet students");
		}
	};
	u.display();
}

}
