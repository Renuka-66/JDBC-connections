package day7;
interface vehicles{
	void start();
	
	

}
class mg implements vehicles{
	 public void start() {
		 System.out.println("car is starting.");
		
	}
}

public class example1 {
	public static void main(String[] args) {
		mg g = new mg();
		g.start();
		
	}

}
