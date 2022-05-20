package practice.practice14;

public class BankAccount {
	private String accountNumber;
	private int balance;
	
	public String getAccountNumber() { return this.accountNumber; }
	public void setAccountNumber(String accountNumber) { 
		this.accountNumber = accountNumber;
	}
	public int getBalance() { return this.balance; }
	public void setBalance(int balance) { 
		this.balance = balance;
	}
	 
	public String toString() {
		return ("\\" + this.getBalance() + "(口座番号" + this.getAccountNumber() + ")");
	}
	
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof BankAccount) {
			BankAccount a = (BankAccount)o;
			String aTrim = a.accountNumber.trim();
			String oTrim = this.accountNumber.trim();
			if(aTrim == oTrim) { return true; }
		}
		return false;
		
	}
	
	

}
