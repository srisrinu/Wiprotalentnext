
package Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int max,min;
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}
		int min=ar[0];
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		
System.out.println("max value in an array:"+max);
System.out.println("min value in an array:"+min);
	}

}
