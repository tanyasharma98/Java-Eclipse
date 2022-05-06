package com.harman.ui;

import com.harman.exception.InsufficientBalanceException;
import com.harman.model.AccountClass;

public class AccountApp {

	public static void main(String[] args) {
		AccountClass first = new AccountClass(101, "tanya",3000.0);
		System.out.println(first);
		first.deposit(500);
		System.out.println(first);
		first.withdraw(700);
		System.out.println(first);
		
		// If we remove rutimeException -- with throws
		try {
			first.withdraw2(200000);
		}catch(InsufficientBalanceException exp) {
			System.out.println(exp.getMessage());
		}finally{
			System.out.println(first);
		}
	}

}
