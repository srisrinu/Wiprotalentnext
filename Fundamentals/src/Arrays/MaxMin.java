
package Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min;
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		min=max=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		
System.out.println("max value in an array:"+max);
System.out.println("min value in an array:"+min);
	}

}
