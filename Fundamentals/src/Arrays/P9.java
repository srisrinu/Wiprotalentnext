package Arrays;

public class P9 {
public static void main(String []args) {
	int arr[][]=new int[2][2];
	int argl=args.length;
	if(argl<4) {
		System.out.print("please enter four numbers");
	}
	if(argl==4) {
		int t=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(args[t]);
				t++;
				
			}
		}
		
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	}
}

