package proxy;

public class ATM implements Account{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		BankAccount bankAccount= new BankAccount();
		bankAccount.withdraw();
		System.out.println("withdraw() of ATM is called");
	}
	
	@Override
	public void getAccountNumber() {
		System.out.println("getAccountNumber() of ATM is called");
	}

}
