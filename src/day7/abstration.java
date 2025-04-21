package day7;
abstract   class vehicle{
	 String name;
abstract void start();

}
class car extends vehicle{
	void start(){
     System.out.println("the start function.");		
	}
}
public class abstration {
	public static void main(String[] args) {
	car b= new car();
	b.start();
	}

}
