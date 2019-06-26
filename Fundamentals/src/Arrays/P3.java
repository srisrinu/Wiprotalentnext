package Arrays;
import java.util.Scanner;
class Search{
	int result;
	public  int find(int ar[],int value) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==value) {
				result=i;
				break;
			}
			else {
				result=-1;
			}
		}
		return(result);
	}
}

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int ar[]=new int[7];
		int value=s.nextInt();
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}
		Search se=new Search();
		System.out.println(se.find(ar,value));
		

	}

}
