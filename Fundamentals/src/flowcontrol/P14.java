package flowcontrol;

public class P14{
	public static void main(String[]args) {
		try{
			int n=Integer.parseInt(args[0]);
			int count=0;
			for(int i=1;i<n;i++) {
				if(n%i==0)
					count=count+1;
			}
			
		if(count==1) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not  a prime number");
		}}
		catch(Exception e) {
			System.out.println("Enter any number");
		}
		
		}}