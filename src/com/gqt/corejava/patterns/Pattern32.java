package com.gqt.corejava.patterns;

public class Pattern32 {

	public static void main(String[] args) {
	
	        int n = 5;
	        char ch = 'A';
	        for (int i = 0; i < n; i++) {
	            // Print spaces
	            for (int s = 1; s <= n - i - 1; s++) {
	                System.out.print("  ");
	            }

	            // Print characters in reverse
	            char temp = (char) (ch + 2 * i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print(temp-- + " ");
	            }
	            System.out.println();
	        }
	    }

	}


