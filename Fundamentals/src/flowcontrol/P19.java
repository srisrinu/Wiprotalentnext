package flowcontrol;

public class P19{
	public static void main(String []args) {
		int count=0,i=0;
		boolean f=true;
		while(f) {
			i=i+1;
			if(count==5) {
				f=false;
				
			}
			else if(i%2==0&&i%3==0&&i%5==0) {
				System.out.print(i+" ");
				count=count+1;
			}
		}
	}
}