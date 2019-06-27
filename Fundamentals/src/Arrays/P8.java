package Arrays;
import java.util.Scanner;
public class P8 {
	public int Sum(int ar[],int length,int l,int m) {
		int sum=0;
		boolean b=true;
		for(int i:ar) {
			if(i==l) {
				b=false;
			}
			if(b==false) {
				if(i==m) {
					b=true;
				
				}
				continue;
			}
			if(i==m) {
				sum+=l+i;
			}
			else {
				sum+=i;
			}
		}
		return(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P8 p=new P8();
       Scanner s=new Scanner(System.in);
       int length=s.nextInt();
       int ar[]=new int[length];
       for(int i=0;i<length;i++) {
    	   ar[i]=s.nextInt();
       }
       System.out.print(p.Sum(ar,length,6,7));
	}

}
