package Arrays;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int ar[]= {1,2,3,5};
      int k=ar.length,s=0;
      for(int i=0;i<ar.length;i++) {
    	  s+=ar[i];
    	  
      }
      System.out.println(s);
      System.out.println((float)s/k);
      
	}

}
