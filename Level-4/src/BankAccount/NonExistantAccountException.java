package BankAccount;

public class NonExistantAccountException extends Exception{
	public NonExistantAccountException(String s){
		super(s);
	}
}
