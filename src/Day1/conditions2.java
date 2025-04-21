package Day1;
import java.util.Scanner;

public class conditions2 {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	System.out.println("enter user age:");
	int age = src.nextInt();
	if(age>=18 && age<=120) {
		System.out.println("eligible for pan card");
	}
	else {
		System.out.println("Not eligible");
	
	}
	src.close();
}
}
