package entities;

import domainException.Exeptions;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double limit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double limit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	public void validateWithdraw(double amount) {
		if(amount > getLimit()) {
			throw new Exeptions("Withdraw error: the amount exceeds withdraw limit");
		} 
		if(amount > getBalance()) {
			throw new Exeptions("Withdraw error: not enough balance");
		}
		
	}

}
