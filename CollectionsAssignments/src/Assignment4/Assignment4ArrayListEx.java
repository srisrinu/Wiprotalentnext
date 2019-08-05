package Assignment4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 class ArrayListEx<E> extends ArrayList<E>{
	@Override
	public boolean add(E el) {
		if(el instanceof Integer||el instanceof Float||el instanceof Double) {
			
		super.add(el);
		return(true);
		
	}
		else {
			throw new ClassCastException("only int,float and double values are allowed");
		}}
	/* public static void printAll(ArrayList<Object> list) {
		Iterator<Object> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}*/
}
public class Assignment4ArrayListEx {
 public static void main(String []args) {
	 List<Object>list=new ArrayListEx<>();
	 //ArrayListEx n=new ArrayListEx();
	 try {
	 list.add(1);
	 list.add(2.5);
	 //list.add("srinu");
	 
 }catch(Exception e) {
	 e.printStackTrace();
 }}}
