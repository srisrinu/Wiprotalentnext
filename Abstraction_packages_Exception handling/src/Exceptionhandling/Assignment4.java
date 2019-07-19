package Exceptionhandling;
import java.util.InputMismatchException;

public class Assignment4 {

	public static void main(String []args) {
		//Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		int a[]=new int[n];
		int sum=0,avg=0;
		try {
			for(int i=0;i<n;i++) {
				a[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			avg=sum/n;
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("sum:"+sum);
		System.out.println("Avg:"+avg);
		
	}

}