package strings_StringBuffer;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(s.charAt(0)=='x'||s.charAt(s.length()-1)=='x') {
    	  System.out.println(s.substring(1,s.length()-1));
      }
      else {
    	  System.out.println(s.substring(0,s.length()));
      }
	}

}
