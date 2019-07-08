package flowcontrol;


public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int start=Integer.parseInt(args[0]);
	    //int end=Integer.parseInt(args[1]);
		int start=2;
		int c=0,i;
		int end=99;
		int prc=0;
		for(i=start;i<=end;i++) {
			c=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					c=c+1;
					break;
					
				}
				
			}
		
		   if(c==0 && i!=1) {
			 System.out.print(i+" ");
			 prc++;
			
		}
		   }
		System.out.print(prc);

	}

}
