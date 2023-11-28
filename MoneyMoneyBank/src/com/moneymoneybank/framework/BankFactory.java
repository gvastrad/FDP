package com.moneymoneybank.framework;

public interface BankFactory {
	public SavingsAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);
}
