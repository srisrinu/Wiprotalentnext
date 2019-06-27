package Arrays;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int temp;
		int length=s.nextInt();
       int a[]=new int[length];
       
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
       }}
    	System.out.print("sorted array:");
    	   for(int k=0;k<length;k++) {
    		   System.out.print(a[k]+" ");
    	   }
       
	


      
       }
	}

