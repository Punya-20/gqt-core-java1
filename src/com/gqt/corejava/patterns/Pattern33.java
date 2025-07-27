package com.gqt.corejava.patterns;

public class Pattern33 {
	public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            // Left side (descending)
            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            // Right side (ascending)
            for (char ch = 'B'; ch <= (char) ('A' + i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}


