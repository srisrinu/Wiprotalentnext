package Assignment3;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ArrayListExAssignment3 {
public static void printAll(ArrayList<String> stringlist) {
	Iterator<String> it=stringlist.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());}}
public static void main(String []args) {
ArrayList<String> stringlist=new ArrayList<String>();
stringlist.add("srinu");
stringlist.add("srinivasa reddy challa");
stringlist.add("srinivas");
printAll(stringlist);}}