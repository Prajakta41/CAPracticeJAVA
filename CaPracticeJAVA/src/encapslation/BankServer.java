package encapslation;

public class BankServer {
	
	private  int cust1Balance= 50000;
	
	public void getBalance(int pin)
	{
		if (pin==1234)
		{
			System.out.println("Your Balance is:" + cust1Balance);
		}
		else
		{
			System.out.println("please try again");
		}
	}
	
	public void withdrawl(int amount)
	{
		setBalance( amount);
	}
	
	public void setBalance(int amount)
	{
		if(amount<=cust1Balance)
		{
			cust1Balance= cust1Balance- amount;
			System.out.println("Amount withdrawl: " +amount +" and your balance is: "+ cust1Balance);
		}
		else
		{
			System.out.println("balance is insufficient");
		}
	}

}
