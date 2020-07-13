package com.concepts.core.java.patterns.number;

import java.util.Scanner;

/**
 * 
 * print i to get below pattern 
 * 
 *     1 
      2 2 
     3 3 3 
    4 4 4 4 
   5 5 5 5 5 
  6 6 6 6 6 6 
 7 7 7 7 7 7 7 
 * 
 * print k to get below pattern
 *    1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5 
 1 2 3 4 5 6 
1 2 3 4 5 6 7


to get this, print space with i value and the number in k loop
      1
     12
    123
   1234
  12345
 123456
1234567
**/
public class Pattern5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max number to print design: \n");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=num-i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
