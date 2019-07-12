package strings_StringBuffer;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		String ns="";
		for(int i=s.length()-1;i>=0;i--) {
			ns=ns+s.charAt(i);
		}
		if(s.equalsIgnoreCase(ns)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
      
	}

}
