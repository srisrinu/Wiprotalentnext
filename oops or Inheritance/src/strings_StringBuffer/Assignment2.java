package strings_StringBuffer;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //StringBuffer sb=new StringBuffer();
       Scanner sc=new Scanner(System.in);
       String str1=sc.nextLine();
       String str2=sc.nextLine();
       String s="";
       if(str2.substring(0,1).equalsIgnoreCase(str1.substring(str1.length()-1))){
    	   s=str1.substring(0,str1.length()).concat(str2.substring(1,str2.length()).toLowerCase());
       }
       else {
    	   s=str1.concat(str2).toLowerCase();
       }
       System.out.println(s);
	}

}
