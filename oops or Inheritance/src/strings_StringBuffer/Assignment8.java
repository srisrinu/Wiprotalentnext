package strings_StringBuffer;
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(s.replace(s.substring(s.indexOf("*")-1,s.indexOf("*")+2),""));
	}

}
