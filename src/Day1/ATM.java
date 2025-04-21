package Day1;

import java.util.Scanner;

public class ATM 
  {
	public static void main(String[] args) 
	{
		Scanner src = new Scanner(System.in);
		Display_items();
		System.out.println("1.English"+"\n"+"2.Telugu");
		int r = src.nextInt();	
		System.out.println("1.mini statement"+"\n"+"2.balance enqeury"+"\n"+"3.withdrawal"+"\n"+"4.Deposite"+"\n");
		int E = src.nextInt();
		switch(E)
		{
		case 1:
			mini_statement();
			break;
		case 2:
			balance_enqeury();
			break;
		case 3:
			withdrawal();
			break;
		case 4:
			Deposite();
			break;
		}
		
		
	}

	private static void Deposite()
	{
		// TODO Auto-generated method stub
		Scanner amt = new Scanner(System.in);
		
		System.out.println("deposite limit 2 lakhs.");
		System.out.println("enter ur amount:");
		double A = amt.nextDouble();
		System.out.println("your amount is "+A);
		System.out.println("Thank you for visiting.");
		
	}

	private static void withdrawal() {
		// TODO Auto-generated method stub
		Scanner Cr = new Scanner(System.in);
		System.out.println("enter the amount :");
		int AW =  Cr.nextInt();
		System.out.println("enter ur pin:");
		int PIN = Cr.nextInt();
		System.out.println("collect the amount...!!!"+"\n"+"Thank you for visiting.");
		
		
	}

	private static void balance_enqeury() {
		// TODO Auto-generated method stub
		Scanner BE = new Scanner(System.in);
     	System.out.println("Enter ur pin:");
     	int BP =BE.nextInt();
		System.out.println("your available balance in your account: "+"\n"+"Thank you for visiting.");
		
		
	}

	private static void mini_statement() {
		// TODO Auto-generated method stub
		Scanner MS = new Scanner(System.in);
		System.out.println("enter your pin ");
		int D = MS.nextInt();
		System.out.println("Your mini statement is printed.");
		
		
	}

	private static void Display_items() 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome  to Renuka's ATM");
		Scanner scr = new Scanner(System.in);
		System.out.println("1.Pin change"+"/n"+"2.language"+"\n");
		int a = scr.nextInt();
		if(a==1)
		{
			System.out.println("enter ur mobile number:");
			double ph = scr.nextDouble();
			System.out.println("OTP SENT...!!");
			System.out.println("Enter Otp:");
			int o =scr.nextInt();
			System.out.println("mobile number verified.");
			System.out.println("Enter your new pin.");
			int p = scr.nextInt();
			System.out.println("pin change is done.");
			}
		else
		{
			System.out.println("choose ur language:");
		}
		
		
	}

}
