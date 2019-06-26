package flowcontrol;

import java.util.Scanner;
public class P15{

	public static void main(String[] args) {
		int n,s=0,r;
		
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		while(n!=0) {
			// r=n%10;
			//System.out.println(r);
			r=n%10;
			s=s+r;
			n=n/10;
			
			//System.out.println(c);
		}//System.out.println(c);
		
		
		System.out.println(s);
	}

}
