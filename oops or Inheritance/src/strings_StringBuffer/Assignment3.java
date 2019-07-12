package strings_StringBuffer;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String ns="";
      for(int i=0;i<s.length();i++) {
    	  ns=ns+s.substring(0,2);
      }
      System.out.println(ns);
	}

}
