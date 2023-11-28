package com.moneymoneybank.framework;

public abstract class CurrentAcc extends BankAcc {
	private  float creditLimit;
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public CurrentAcc(int accNo, String accName, float accBal,float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit=creditLimit;
	}

	@Override
	public void withdraw(float wdAmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getAccBal()=" + getAccBal() + "]";
	}	
}
