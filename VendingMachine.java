package com.bridgelabz.algorithm;

import java.util.Scanner;

import Utility.Utility;

public class VendingMachine {
public static void main(String[] args) {
	int money;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Money.....");
	money=scanner.nextInt();
	int notes[]= {1000,500,100,50,20,10,5,2,1};
	
	Utility.vendingMachineCal(money,notes);
	System.out.println("Total number of notes to change......"+Utility.total);
	scanner.close();
}
}
