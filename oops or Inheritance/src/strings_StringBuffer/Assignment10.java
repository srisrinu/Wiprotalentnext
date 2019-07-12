package strings_StringBuffer;
import java.util.Scanner;
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int n=sc.nextInt();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<n;i++) {
    	   sb.append(s.substring(s.length()-n));
       }
       System.out.println(sb);
	}

}
