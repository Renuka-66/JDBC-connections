
//example real word application by using inheritance polymorphism 
//return types and parameters in the barket
package Day5;

import java.util.Scanner;

import Day3.Ruby;

class water
{
	String Colour;
    int length;
	String name;

	void colour() {
		System.out.println("its is green in colour");
	}
	void length() {
		System.out.println("it is 99.55 meters in length");
	}
	void name()
	{
		System.out.println("godavari river");
	}
	
}




public class exampleprogram {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		water w = new water();
		System.out.println("enter the colour of the water:");
		w.Colour=src.next();
		w.length="99.55";
		w.name="godavari river";
		
		System.out.println(w.Colour);
		System.out.println(w.name);
        System.out.println(w.length);
	    
	    w.colour();
	    w.name();
	    w.length();
	    
	}

}
