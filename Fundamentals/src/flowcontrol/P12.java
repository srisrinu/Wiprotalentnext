package flowcontrol;


public class P12 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int k=0;
		if(num==0||num==1) {
			System.out.print("Not a prime");
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
				k=1;
				
			}}
		if(k==0)
			System.out.print("Prime");
		else {
			System.out.print("Not a Prime");
		}
			
		}
	}

}
