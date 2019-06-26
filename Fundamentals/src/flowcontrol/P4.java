package flowcontrol;

import java.util.Scanner;

public class P4
{

public static void main(String[] args)
{
Scanner s = new Scanner ( System .in);

System.out.println("enter the first character");
char s1=s.next().charAt(0);

System.out.println("enter the second character");
char s2=s.next().charAt(0);

if (s1>s2)
System.out.println(s2+" , "+s1);

else
System.out.println(s1+" , "+s2);
}


}