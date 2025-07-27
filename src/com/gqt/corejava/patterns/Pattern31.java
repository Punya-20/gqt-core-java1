package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern31 {
	public static void main(String args[]) {

	 int n = 5;
     for (int i = 0; i < n; i++) {
         // Print spaces
         for (int s = 0; s < n - i - 1; s++) {
             System.out.print(" ");
         }

         // Left side numbers
         for (int j = i; j >= 1; j--) {
             System.out.print(j + " ");
         }

         // Center zero
         System.out.print("0");

         // Right side numbers
         for (int j = 1; j <= i; j++) {
             System.out.print(" " + j);
         }
         System.out.println();
     }
 }
}