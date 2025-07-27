package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		int n = 5;  // Number of rows

		

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print numbers with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }
    }

n
	}


