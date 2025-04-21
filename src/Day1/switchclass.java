package Day1;

import java.util.Scanner;
public class switchclass {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	Displaymenu();
	System.out.println("choosing a vote:");
	int vote = src.nextInt();
	switch(vote)
	{
	case 1 :
		System.out.println("pawan");
		break;
	case 2:
		System.out.println("jagan");
		break;
	case 3:
		System.out.println("tdp");
		break;
	case 4:
		System.out.println("bjp");
		break;
	case 5:
		System.out.println("congress");
		break;
		default:
			System.out.println("invalid");
			break;
	}	
}

private static void Displaymenu() {
	// TODO Auto-generated method stub
	System.out.println("\t1.pawan"+"\n"+"\t2.jagan"+"\n"+"\t3.tdp"+"\n"+"\t4.bjp"+"\n"+"\t5.congress"+"\n");	
}
}
