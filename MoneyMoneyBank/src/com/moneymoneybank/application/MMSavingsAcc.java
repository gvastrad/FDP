package com.moneymoneybank.application;

import com.moneymoneybank.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {

	public MMSavingsAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		
	}

	@Override
	public void deposite(float dpAmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(float wdAmt) {
		if (getAccBal() >= wdAmt) {
			System.out.println("Withdraw limit is crossed");
			int accBal =(int) (getAccBal()-wdAmt);
			System.out.println("Balance after withdrawal:" + getAccBal());
		} else {
			System.out.println(getAccName() + " you cannot withdraw " + wdAmt);
		}
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + "]";
	}

	
}
