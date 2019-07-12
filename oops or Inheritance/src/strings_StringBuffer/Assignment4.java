package strings_StringBuffer;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String ns="";
       if(s.length()%2==0) {
    	   System.out.println(s.substring(0,s.length()/2));
       }
       else {
    	   System.out.println("null");
       }
	}

}
