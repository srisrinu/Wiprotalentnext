package flowcontrol;

import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
	   int Upper,Lower;
	   char character;
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s>=65&&s<=90) {
		   Upper=(int)s;
		   character=(char)(Upper+32);
		   System.out.print(s+"->"+character);}
			else {
				 Lower=(int)s;
				   character=(char)(Lower-32);
				   System.out.println(s+"->"+character);
				
			}
		}
		

	}


