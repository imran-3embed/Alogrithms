package com.bridgelabz.algorithm;

import Utility.Utility;

public class monthlyPayments {

	public static void main(String[] args) {
		
		int p=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double r=Double.parseDouble(args[2]);
		Utility.monthlyPayment(p,y,r);
	}
}
