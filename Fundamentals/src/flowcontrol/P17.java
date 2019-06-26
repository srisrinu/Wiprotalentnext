package flowcontrol;

import java.util.Scanner;
public class P17{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		String s="";
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		while(n!=0) {
			r=n%10;
			s=s+r;
			n=n/10;
			
			
		}
		System.out.print(s);
		
		

	}

}
