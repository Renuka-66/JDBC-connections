package Day2;

import java.util.Scanner;

public class loop_application {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	int ch;
	do 
	{
		display_menu();
	    ch=Integer.parseInt(src.next());	
	switch(ch)
	{
	case 1:
		deposite();
		break;
	case 2:
		withdrawal();
		break;
	case 3:
		balanceenquery();	
	case 4:
		System.exit(0);
		break;
	default:
		System.out.println("invalid option");
	}
	
	}while(ch>0);
}
		

private static void balanceenquery() {
	// TODO Auto-generated method stub
	Scanner BE = new Scanner(System.in);
	int B=200000;
 	System.out.println("Enter ur pin:");
 	int BP =BE.nextInt();
	System.out.println("your available balance in your account: "+B+"\n"+"Thank you for visiting.");
	
	
}


private static void withdrawal() {
	// TODO Auto-generated method stub
	Scanner wd = new Scanner(System.in);
	int c=200000;
	System.out.println("enter the amount:");
	int AW =  wd.nextInt();
	System.out.println("enter ur pin:");
	int PIN = wd.nextInt();
	System.out.println("collect the amount...!!!"+"\n");
	int w =wp.nextInt();
	System.out.println("your available balance in your account: "+c);
	
}


private static void deposite() {
	// TODO Auto-generated method stub
	Scanner dep = new Scanner(System.in);
	System.out.println("deposite limit 2 lakhs.");
	System.out.println("enter ur amount:");
	double A = dep.nextDouble();
	System.out.println("your amount is "+A);
	System.out.println("Thank you for visiting.");
	
	
}


private static void display_menu() 
{
	// TODO Auto-generated method stub
	System.out.println("enter ur choice:");
	System.out.println("\t1.deposite"+"\n");
	System.out.println("\t2.withdrawal"+"\n");
	System.out.println("\t3.balance enquery"+"\n");
	
}

}
