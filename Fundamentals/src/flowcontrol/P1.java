package flowcontrol;

import java.util.Scanner;
public class P1 {
	public static void main(String []args) {
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		if(a>0) 
			System.out.println("positive");
		else if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		
	}

}
