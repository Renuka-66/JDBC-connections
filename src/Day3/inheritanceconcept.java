package Day3;

import java.util.Scanner;

class Ruby
{
	String Colour;
	String  Bried;
	int age;
	int length;
	String gender;

	void eating() {
		System.out.println("dog food habits");
	}

	void behaviour() {
		System.out.println("angry");
	}
	void vacination()
	{
		System.out.println("how many times");
	}
	void running()
	{
		System.out.println("fastesst runner of the year");
	}
	void sleeping()
	{
		System.out.println("her sleeping skills");
		
	}
	

}

public class inheritanceconcept {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Ruby d = new Ruby();
		System.out.println("enter the colour of the dog:");
		d.Colour=src.next();
		d.Bried="rubulu";
		d.age=05;
		d.length=4;
		d.gender="flase";
		System.out.println(d.Colour);
		System.out.println(d.Bried);
        System.out.println(d.age);
	    System.out.println(d.length);
	    System.out.println(d.gender);
	    d.eating();
	    d.behaviour();
	    d.vacination();
	    d.running();
	    d.sleeping();
	}
	
}
