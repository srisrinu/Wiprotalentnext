package flowcontrol;

import java.util.Scanner;
public class P8{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch){
		case 'O':System.out.print("Orange");break;
		case 'R':System.out.print("Red");break;
		case 'G':System.out.print("Green");break;
		case 'B':System.out.print("Blue");break;
		case 'Y':System.out.print("Yellow");break;
		case 'W':System.out.print("White");break;
		default:System.out.print("Invalid choice");break;
		
		
		}
		

	}

}
