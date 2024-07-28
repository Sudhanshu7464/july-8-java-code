package july8;

import java.util.*;

public class Arraylist {
	
	
	public static void main(String[] args) {
//		ArrayList<Integer> arraylist = new ArrayList<>();
//		arraylist.add(12);
//		arraylist.add(13);
//		System.out.println(arraylist.size());
//		for(int i :arraylist) {
//			System.out.println(i);
//		}	
			//ArrayList with String
//			
//			ArrayList<String> arrayOfString = new ArrayList<>();
//			arrayOfString.add("harshita");
//			arrayOfString.add("Aastha");"Apple", "Banana", "Cherry", "Date", "Elderberry".
//			arrayOfString .add("rahul");
//			arrayOfString .add("rohit");
//			arrayOfString .add("reena");
//			
//			System.out.println("Before removing elements");
//			for(String i : arrayOfString ) {
//				System.out.println(i);
//			}
//			
//			arrayOfString .remove(0);
//			arrayOfString .remove(arrayOfString .size()-1);
//			
//			System.out.println();
//			System.out.println("after removing elements");
//			
//			for(String i : arrayOfString ) {
//				System.out.println(i);
//			}
			
			//next question
			ArrayList<String> fruits = new ArrayList<>();
			System.out.println(fruits.size());
			fruits.add("Apple");
			fruits.add("banana");
			fruits.add("Cherry");
			fruits.add("Date");
			fruits.add("Elderberry");
			
			System.out.println("oroginal arraylist");
			for(String i : fruits) {
				System.out.print(i +" ");
			}
			System.out.println();
			
			fruits.remove(2);
			fruits.add(2,"Fig");
			System.out.println("modified arraylist");
			
			for(String i : fruits) {
				System.out.print(i +" ");
			}
			if(fruits.contains("banana")) {
				fruits.clear();
			}
			System.out.println();
			for(String i : fruits) {
				System.out.print(i +" ");
			}
			
	//vectors in java ====> it is same as arraylist but it is thred safe and array list is  not threadsafe
			
			Vector <String > vector = new Vector<>();
			
			vector.add("Banana");
			vector.add("Apple");
			vector.add("Cherry");
			vector.add("Elderberry");
			
			for(String i : vector) {
				System.out.println(i);
				
			}
			
			//stack in java====> legacy class
			Stack<String> s = new Stack<>();
			s.add("maths book");
			s.add("science book");
			s.add("hindi book");
			s.add("chemistry");
			// pop peak push
			s.pop();//remove the last element
			System.out.println(s.peek());// return what value is to be popped
			s.push("English book");//add element in  stack
			
			System.out.println(s);
			
			//HashSet in java===> do not allow duplicate value
			//it do not maintain insertion order
			//it will not allow multiple null value
			
			
			HashSet<String > h = new HashSet<>();
			h.add("hello");
			h.add("hello");
			h.add("dear");
			
			
			
			
		}
	}