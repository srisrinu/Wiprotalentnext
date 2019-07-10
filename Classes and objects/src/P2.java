class Calculator{
	public static int powerInt(int num1,int num2) {
		return((int)(Math.pow(num1, num2)));
	}
	public static double powerDouble(double num1,int num2) {
		return(Math.pow(num1, num2));
		
	}
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c1=Calculator.powerInt(15, 2);
     double  c2= Calculator.powerDouble(2.3, 5);
     System.out.println(c1);
     System.out.println(c2);
	}

}
