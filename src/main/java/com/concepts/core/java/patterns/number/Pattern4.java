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
7654321
654321
54321
4321
321
21
1
1
21
321
4321
54321
654321
7654321
 * 
 * 
 * */
public class Pattern4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max number to pring the pattern\n");
		int num = scanner.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1; i<= num; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
