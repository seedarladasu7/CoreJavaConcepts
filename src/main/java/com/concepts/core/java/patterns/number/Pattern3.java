package com.concepts.core.java.patterns.number;

import java.util.Scanner;

/**
 *
 * print i to ge below
7777777
666666
55555
4444
333
22
1
1
22
333
4444
55555
666666
7777777
 * 
 * 
 * print j to get below
1234567
123456
12345
1234
123
12
1
1
12
123
1234
12345
123456
1234567
 * 
 * 
 * */
public class Pattern3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max number to pring the pattern\n");
		int num = scanner.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<= num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
}
