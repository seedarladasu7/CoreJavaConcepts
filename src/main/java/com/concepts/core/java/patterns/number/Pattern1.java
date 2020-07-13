package com.concepts.core.java.patterns.number;

import java.util.Scanner;

/**
1
22
333
4444
55555
666666
7777777

1
12
123
1234
12345
123456
1234567

 * **/
public class Pattern1 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max number to print: ");
		int num = scanner.nextInt();
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
