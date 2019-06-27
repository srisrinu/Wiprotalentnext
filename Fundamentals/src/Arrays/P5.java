package Arrays;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		
      Scanner s=new Scanner(System.in);
      int temp;
      int length=s.nextInt();
      int a[]=new int[length];
      if(length>1) {
      for(int i=0;i<length;i++) {
    	 a[i]=s.nextInt();
    		  
    	  }
      for(int i=0;i<length;i++) {
    	  for(int j=i+1;j<length;j++) {
    		  if(a[i]>a[j]) {
    			  temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    		  }
    		  
    	  }
      }
      System.out.println("Two largest elements in an arry:"+a[length-1]+","+a[length-2]);
      }
      else {
    	System.out.println("Array size should be more than 1") ; 
      }
	}

}
