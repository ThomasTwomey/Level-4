package BankAccount;

public class Account {
	private float balance = 0;
	private int accountNum;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public void addMoney(float amount){
		if(amount < 0){
			amount = 0;
		}
		balance += amount;
	}
	public void widthdrawMoney(float amount) throws AccountOverdrawnException{
		if(balance - amount < 0){
			throw new AccountOverdrawnException("Withdrawn amount was greater than the balance of the account");
		}
		balance -= amount;
	}
}
