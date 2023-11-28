package com.moneymoneybank.client;

import com.moneymoneybank.application.MMBankFactory;
import com.moneymoneybank.application.MMCurrentAcc;
import com.moneymoneybank.application.MMSavingsAcc;
import com.moneymoneybank.framework.BankFactory;
import com.moneymoneybank.framework.CurrentAcc;
import com.moneymoneybank.framework.SavingsAcc;

public class MMClient {

	public static void main(String[] args) {
		BankFactory bankFactory=new MMBankFactory();
		SavingsAcc savingsAccount =new MMSavingsAcc(101, "Gayatri", 10000, true);
		//CurrentAcc currentAccount =new MMCurrentAcc(0, null, 0, 0);
		savingsAccount.withdraw(10000);
	//	currentAccount.withdraw(0);
		
		System.out.println(savingsAccount);
		//System.out.println(currentAccount);
	}

}
