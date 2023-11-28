package com.moneymoneybank.application;

import com.moneymoneybank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	 
	public MMCurrentAcc(int accNo, String accName, float accBal,float creditLimit) {
		super(accNo, accName, accBal,creditLimit);
		
	}

	@Override
	public void deposite(float dpAmt) {
		
	}

	@Override
	public void withdraw(float wdAmt) {
		// TODO Auto-generated method stub
		super.withdraw(wdAmt);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal()
				+ "]";
	}
}
