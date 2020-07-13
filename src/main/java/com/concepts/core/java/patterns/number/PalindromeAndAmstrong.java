package com.concepts.core.java.patterns.number;

import java.util.Scanner;

public class PalindromeAndAmstrong {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entered number: ");
		int num = scanner.nextInt();
		int actual = num;
		int r, sum=0;
		boolean primeNoFlag = false; 
		
		
		// Palyndrome number check
		while(num > 0) {
			r = num%10;
			num = num/10;
			sum = (sum*10) + r;
		}
		String str = (actual == sum) ? "Palyndrome" : "Not Palyndrome";
		System.out.println("Given Entered number is "+str);
		
		
		// Amstrong number check
		sum = 0; num=actual; r=0;
		while(num > 0) {
			r = num%10;
			num = num/10;
			sum = sum + (r*r*r);
		}
		String str1 = (actual == sum) ? "Amstrong" : "Not Amstrong";
		System.out.println("Given Entered number is "+str1);
		
		
		// Prime number check
		num = actual;
		//We only have to loop through 2 to half of num, because no number is divisible by more than its half.
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				primeNoFlag = true;
				break;
			}
		}
		
		String str2 = (!primeNoFlag) ? "Prime" : "Not Prime";
		System.out.println("Given Entered number is "+str2);
		
		
		//Strong Number check;
		sum = 0; num = actual; r = 0;
		
		while(num!=0) {
			int i = 1;
			int fact = 1;
			
			r = num%10;
			
			while(i<=r) {
				fact = fact * 1;
				i++;
			}
			
			sum = sum + fact;
			num = num/10;
			
		}
		
		String str3 = (actual == sum) ? "Strong" : "Not Strong";
		System.out.println("Given Entered number is "+str3);
		
	}

}
