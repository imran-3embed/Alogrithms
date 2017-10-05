package com.bridgelabz.algorithm;

import java.util.Scanner;

import Utility.Utility;

public class temperaturConversions {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double f;
		System.out.println("Enter the temprature in terms of Fahrenheit");
		f=s.nextInt();
		
		Utility.temperaturConversion(f);
	}
}
