package BankAccount;

public class BankRunner {
	public static void main(String[] args) throws AccountOverdrawnException, NonExistantAccountException, PreviouslyExistingAccountException{
		Bank bank = new Bank();
		bank.addAccount(new Account(), 0);
		bank.addAccount(new Account(), 1);
		bank.addAccount(new Account(), 2);
		bank.addAccount(new Account(), 3);
		//bank.addAccount(new Account(), 3);
		bank.addMoney(3, 4.20f);
		bank.widthdrawMoney(3, 2.8f);
		//bank.widthdrawMoney(6, 10f);
	}
}
