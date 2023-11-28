package com.moneymoneybank.framework;

public abstract class BankAcc {

	private int accNo;
	private String accName;
	private float accBal;

	public BankAcc(int accNo, String accName, float accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getAccBal() {
		return accBal;
	}

	public abstract void withdraw(float wdAmt);

	public abstract void deposite(float dpAmt);

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}

}
