package Day1;
import java.util.Scanner;

public class nested_if {
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter heigth:");
		double heigth = src.nextDouble();
		System.out.println("enter weigth");
		double weigth = src.nextDouble();
		if(heigth>=5.9 && heigth <= 6.5) {
			if(weigth >=50.0 && weigth<=70.0) {
			System.out.println("eligible");	
			}else {
			System.out.println("Not eligible");	
			}
		}else {
			System.out.println("error");
		}
		src.close();
	}

}
