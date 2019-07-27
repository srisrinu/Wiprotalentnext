import java.util.*;
public class Assignment1 {
 public static void main(String []args) {
	 ArrayList<String> a=new ArrayList<String>();
	 a.add("January");
	 a.add("February");
	 a.add("March");
	 a.add("April");
	 a.add("May");
	 a.add("june");
	 a.add("july");
	 a.add("August");
	 a.add("September");
	 a.add("October");
	 a.add("November");
	 a.add("December");
	 Iterator i=a.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());}
	 System.out.println(a.get(0));
	 }}
