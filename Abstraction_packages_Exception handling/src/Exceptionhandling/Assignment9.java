package Exceptionhandling;
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     
	     try {
	    	 
	    	 System.out.println("The quotient of a/b:"+(a/b));
	    	 
	    	 
	     }catch(ArithmeticException e){
	    	 System.out.println(e.getMessage()+" caught");
	     }
	     finally {
	    	 System.out.println("Inside finally block");
	     }
	     }
	

}
