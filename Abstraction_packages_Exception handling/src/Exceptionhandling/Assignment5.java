package Exceptionhandling;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     
     try {
    	 double div=division(a,b);
    	 System.out.println(div);
    	 
     }catch(ArithmeticException e){
    	 System.out.println(e.getMessage());
     }}
	public static double division(int a,int b) throws ArithmeticException{
   	 return(a/b);
    }
     
	}


