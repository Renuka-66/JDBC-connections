package collections_sets;

import java.util.ListIterator;

class Vehicle{
	public static <t> void Array(t[]array)  {
		for(t bike: array ) {
			System.out.println(bike + " ");
			
		}
	}
}
public class generics {
	public static void main(String[] args) {
		
	Integer [] i = {1,3,5,7};
	String [] s = {"car","cycle"};
	Vehicle.Array(i);
	}
	

}
