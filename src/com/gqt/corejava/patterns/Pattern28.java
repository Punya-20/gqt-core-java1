package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern28 {

	public static void main(String[] args) {
		int n = 5;
	    // Upper half including middle line
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
