package Exceptionhandling;
import java.util.Scanner;
public class Assignment1 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an integer:");
	String  i=sc.nextLine();
	//System.out.println("Enter an integer:");
	try {
		int n=Integer.parseInt(i);
		System.out.println("The square value is "+n*n);
		System.out.println("The work has been done successfully");
	}catch(NumberFormatException e) {
		System.out.println("Entered input is not a valid format for an integer");
	}
}
}
