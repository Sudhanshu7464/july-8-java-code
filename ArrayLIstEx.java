package july8;
import java.util.*;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> arraylist = new ArrayList<>();
	arraylist.add(10);	
	arraylist.add(30);
	arraylist.add(20);
	arraylist.add(40);
	arraylist.add(50);
	
	System.out.println("original arraylist="+arraylist);
	arraylist.sort(null);
	
	System.out.println("sorted arraylist="+arraylist);
	
	 Collections.reverse(arraylist);
	 
	 System.out.println("reverse arraylist="+arraylist);
	
	
	
	
	
	
	
	
	}
}