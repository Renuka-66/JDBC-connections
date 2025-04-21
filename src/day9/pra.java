package day9;
abstract class user {
	abstract void display();
	}

public class pra {
	public static void main(String[] args) {
		user u = new user() {
			
			@Override
			void display() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
		};
		u.display();
	}
}