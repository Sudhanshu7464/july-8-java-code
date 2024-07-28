package july9;

public class BankService {
	
	public void LoanService(String loantype) {
		
		
		if(loantype.equals("gold loan")) {
			System.out.println("interest rate of gold loan =12%");
		}
		
		if(loantype.equals("money loan")) {
			System.out.println("interest rate of money loan =6%");
		}
			
	}
	
	
	public void printPassbook(int account_number) {
		
		System.out.println("printing");
	}
	
	
	public void sendotp(String medium) {
		if(medium.equals("mobile")) {
			
			System.out.println("sending otp to mobile number");
		
		
	}

}
}