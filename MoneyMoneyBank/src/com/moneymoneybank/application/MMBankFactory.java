package com.moneymoneybank.application;

import com.moneymoneybank.framework.BankFactory;
import com.moneymoneybank.framework.CurrentAcc;
import com.moneymoneybank.framework.SavingsAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingsAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
