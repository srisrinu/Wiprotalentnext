package strings_StringBuffer;
import java.util.Scanner;
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      StringBuffer sb=new StringBuffer();
      while(a.indexOf(b)!=-1) 
      {
    	  int index=a.indexOf(b);
    	  if(index+b.length()<a.length()-1&&index-1>=0) {
    		  sb.append(a.charAt(index-1));
    		  sb.append(a.charAt(index+b.length()));
    		  a=a.replaceFirst(b,"");
    	  }
    	  if(index==0&&index+b.length()<a.length()-1) {
    		  sb.append(a.charAt(index+b.length()));
    		  a=a.replaceFirst(b,"");
    		  continue;
    	  }
    	  if(index-1>=0&&index+b.length()>=a.length()) {
    		  sb.append(a.charAt(index-1));
    		  a=a.replaceFirst(b,"");
    		  continue;
    		  
    	  }
      }
	}

}
