package encapslation;

public class ATMMachine {
	
	public static void balanceEnq(int pin)
	{
		BankServer bs = new BankServer();
		
		bs.getBalance(1234);
	}

	public static void main(String[] args) {
		
		balanceEnq(1234);
		BankServer bs = new BankServer();
		bs.withdrawl(700);
		

	}

}
