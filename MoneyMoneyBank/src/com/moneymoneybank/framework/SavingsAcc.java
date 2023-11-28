package com.moneymoneybank.framework;

public abstract class SavingsAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL = 1000;

	public SavingsAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public void withdraw(float wdAmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "SavingsAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
}
