package com.harman.model;

import com.harman.exception.InsufficientBalanceException;

public class AccountClass {
	private int accNumber;
	private String accName;
	private double balance;
	
	private static final double MIN_BALANCE= 500.0;
	public AccountClass(){
		// Default Constructor
	}
	public AccountClass(int accNumber, String accName, double balance) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount; 
	}
	
	public void withdraw(double amount) {
		try {
		if(balance - amount < MIN_BALANCE) {
			throw new InsufficientBalanceException("Insuffcient Balance");
		}
		balance -= amount; 
		} catch(InsufficientBalanceException exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	public void withdraw2(double amount) throws InsufficientBalanceException{
		// Used runtime exception in AccClass to handle the error
		//you can use throws
		if(balance - amount < MIN_BALANCE) {
			throw new InsufficientBalanceException("Insuffcient Balance");
		}
		balance -= amount; 
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return String.format("accNumber=%s, accName=%s, balance=%s]", accNumber, accName, balance);
	}
	
}
