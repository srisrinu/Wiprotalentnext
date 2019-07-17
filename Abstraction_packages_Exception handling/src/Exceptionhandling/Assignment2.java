package Exceptionhandling;
import java.util.Scanner;
//import java.lang.ArrayIndexOutOfBoundsException;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
			
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Enter the index of the element you want to access");
		int index=sc.nextInt();
		try {
		
		
	    System.out.println("The element is at index="+arr[index]);
	    System.out.println("The array element successfully accessed");	
			
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}

	}

}
