package Arrays;
import java.util.Scanner;
import java.util.Arrays;
class RemoveDuplicates{
	public int removeduplicates(int ar[],int length) {
		int t[]=new int[ar.length];
		int j=0;
		if(length==0||length==1) {
			return(length);
		}
		
		for(int i=0;i<length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				t[j++]=ar[i];
			}
			
		}
		t[j++]=ar[length-1];
		for(int i=0;i<j;i++) {
			ar[i]=t[i];
		}
	
	
	return(j);
}
}
public class P7 {
	public static void main(String []args) {
		RemoveDuplicates d=new RemoveDuplicates();
		Scanner s=new Scanner(System.in);
		int length=s.nextInt();
		int ar[]=new int[length];
		for(int i=0;i<length;i++) {
			ar[i]=s.nextInt();
		}
		Arrays.sort(ar);
		length=d.removeduplicates(ar,length);
		for(int i=0;i<length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}