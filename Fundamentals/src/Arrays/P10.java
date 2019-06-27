package Arrays;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][]=new int[3][3];
      int argsl=args.length;
      //int maxi;
      if(argsl<9) {
    	  System.out.print("Please enter 9 integer numbers");
      }
      if(argsl==9) {
    	  int t=0;
    	  for(int i=0;i<3;i++) {
    		  for(int j=0;j<3;j++) {
    			  arr[i][j]=Integer.parseInt(args[t]);
    			  t++;
    		  }
    	  }
    	  int maxi=arr[0][0];
    	  for(int i=0;i<3;i++) {
    		  for(int j=0;j<3;j++) {
    			  if(arr[i][j]>maxi) {
    				  maxi=arr[i][j];
    			  }
    		  }
    	  }
    	  
      
          System.out.print(maxi);
	}

}
}
