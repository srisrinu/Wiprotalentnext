package Arrays;
import java.util.Scanner;
import java.util.Arrays;
class Conversion{
public char[] convert(int ar[]) {
	char t[]=new char[ar.length];
		for(int i=0,j=0;i<ar.length;i++,j++) {
			t[j]=(char)ar[i];
			
		}
	   return(t);
	}

	
}

public class P4 {
	public static void main(String []args) {
	
		/*Scanner s=new Scanner(System.in);
		int length=s.nextInt();
		int ar[]=new int[length];*/
		int ar[]= {65,78,97,100};
		/*for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}*/
	Conversion c=new Conversion();
	System.out.println(c.convert(ar));

}
}
