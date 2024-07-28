package july2;

public class ChildException extends Parent {
	
	void calculate (){
		System.out.println("child class method");
	}
	
	public static void main(String[] args)  {
		ChildException e = new ChildException();
		try {
		e.calculate();
	}
		catch(Exception e1) {
			System.out.println("unandle");
		}

}
}