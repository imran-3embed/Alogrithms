package com.bridgelabz.algorithm;

import java.util.Scanner;

import Utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the Size of the Array....");
		n=s.nextInt();
 
		Integer a[]=new Integer[n];
		System.out.println("Enter the Array Elements.....");
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		System.out.println("Sorted Integers Elements are........");
		Integer[] b=Utility.bubbleSort(a);
		Utility.display(b);
 
		String [] str=new String[n];
		System.out.println("Enter the String......");
		s.nextLine();
		for(int i=0;i<str.length;i++) 
        str[i]=s.nextLine();
		
		System.out.println("Sorted Strings Elements are......");
		String[] str2=Utility.bubbleSort(str);
		Utility.display(str2);
	}

}
