package com.ArrayBasic.java;

public class FrequencyOfElement {
	
	 public static void main(String[] args) {

	        int[] a = {100, 500, 1000, 30, 40, 70, 500};

	        for (int i=0; i<a.length; i++) {
	            int x = a[i];
	            int count = 0;

	            if (x == -1)continue;

	            for (int j=0; j<a.length; j++) {

	                if (a[j] == x) {
	                    count++;
	                    a[j] = -1;
	                }
	            }
	            System.out.println("Frequency of " +x+ " is " +count);
	       }
	 }

}
