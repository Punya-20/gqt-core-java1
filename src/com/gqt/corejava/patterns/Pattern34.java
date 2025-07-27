package com.gqt.corejava.patterns;

public class Pattern34 {
	public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            // Left side (A to current)
            for (char ch = 'A'; ch <= (char) ('A' + i); ch++) {
                System.out.print(ch + " ");
            }

            // Right side (one before current back to A)
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}


