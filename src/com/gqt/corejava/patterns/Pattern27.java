package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
	
		int n = 5;

        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print(i);
            if (i != 1) {
                for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print(i);
            if (i != 1) {
                for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }
}