package BankAccount;

public class AccountOverdrawnException extends Exception{
	public AccountOverdrawnException(String s){
		super(s);
	}
}
