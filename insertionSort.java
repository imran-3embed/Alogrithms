package com.bridgelabz.algorithm;

import java.util.Scanner;

import Utility.Utility;

public class insertionSort {

	public static void main(String[] args) {
		int n;
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array....");
		 n=scanner.nextInt();
		 
		 Integer a[]=new Integer[n];
		 
		 System.out.println("Enter the Array Elements.....");
		 for(int i=0;i<n;i++)
	     a[i]=scanner.nextInt();
		 
		 System.out.println("Sorted Integers Elements are........");
		 Utility.insertionSort(a);
		 
		 Utility.display(a);
		 
		 String str[]=new String[n];
		 System.out.println("Enter the String Elements.....");
		 for(int i=0;i<n;i++)
		 str[i]=scanner.next();
		 
		 System.out.println("Sorted String Elements are........");
		 Utility.insertionSort(str);
		 Utility.display(str);
		 
		 scanner.close();
	}
}
