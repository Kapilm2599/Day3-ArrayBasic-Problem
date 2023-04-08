package com.ArrayBasic.java;

public class ReverseOrderArray {
	
	public static void main(String[] args) {

        System.out.println("Reverse order elements:");
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};

        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }

}
