package july8;
import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println(s1.peek());
		
		if(s1.isEmpty()) {
			System.out.println("true");
			
		}
		else {
			s1.clear();
		}
		
		System.out.println(s1);
		
		
	}

}