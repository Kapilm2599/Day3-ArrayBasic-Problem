package com.ArrayBasic.java;

public class DublicateElementArray {
	
	 public static void main(String[] args) {
	        int[] inputNumArray = {10, 1, 4, 5, 10, 2, 3, 3, 6,12,25,43,43,6,3,9,9,9,9,9,9};

	        for (int i=0; i<inputNumArray.length; i++) {

	            for (int j=i+1; j<inputNumArray.length; j++) {

	                if (inputNumArray[i] == inputNumArray[j]) {

	                    System.out.println("Duplicate Element Founds: " +inputNumArray[i]);
	                }
	            }
	    
		} 
        
	 }
	
}
