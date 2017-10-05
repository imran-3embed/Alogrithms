package com.bridgelabz.algorithm;

import java.io.*;
import java.util.*;

import Utility.Utility;

public class WordList {
	public static void main(String[] args) {
	try {
			String key;
			String word=null;
			Scanner scanner=new Scanner(System.in);
			File file = new File("/home/bridgeit/Desktop/im.txt");
		   
		    if(file.exists()) {
		    if(file.canRead()) {
		    BufferedReader bufferReader=new BufferedReader(new FileReader(file));
		     
		    
		    word=bufferReader.readLine();

		    bufferReader.close();
		    System.out.println(word);
		    String[] str=word.trim().split(",");
		  
		 
		    String[] str1=Utility.bubbleSort(str);
		    Utility.display(str1);
		    System.out.println("Enter the Key To search....");
		    key=scanner.nextLine();
		    scanner.close();
		    if(Utility.binarySearch(str1,key,0,str1.length-1)>0) {
		    System.out.println("Element is found......");
		    													}
		    else  {
			System.out.println("Not Found......");
		    	  }
		    	               }else {
		    		System.out.println("file cant read");
		    	                      }
		                       }
		    else {
		    System.out.println("file not found");
		           }
		   }catch(Exception e) {
		   e.printStackTrace();
	                           }
	}

}
