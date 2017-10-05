package com.bridgelabz.algorithm;

import java.util.Scanner;
import Utility.Utility;
public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
String str1,str2;

System.out.println("Enter the string1.......");
str1=s.nextLine();

System.out.println("Enter the string2.......");
str2=s.nextLine();

str1=str1.toLowerCase();
str2=str2.toLowerCase();

char a[]=str1.toCharArray();
char b[]=str2.toCharArray();

if(Utility.AnagramDetection(a,b))
	System.out.println("Strings are not Anagram to Each Other....");
else System.out.println("Strings are Anagram to Each Other....");

	}
}
