package flowcontrol;

import java.util.Scanner;
public class  P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		String s="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int h=n;
		while(n!=0) {
			r=n%10;
			s=s+r;
			n=n/10;
			
			
		}
		if(Integer.valueOf(s)==h) {
			System.out.print(h+" is a palindrome");
		}
			else {
				System.out.print(h+" is not  a palindrome");
			}
		

	}

}
