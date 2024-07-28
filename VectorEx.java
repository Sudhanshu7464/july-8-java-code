package july8;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		//adding elements
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println("original vector="+vector);
		//remove element and then add element at index 2
		vector.remove(2);
		vector.add(2,35);
		System.out.println("modified vector="+vector);
		//check condition
		
		if(vector.contains(40)) {
			vector.clear();
		}
		
		System.out.println("current vector="+vector);
		
		
		
		
	}

}