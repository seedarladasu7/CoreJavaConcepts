package com.concepts.core.java.test.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingIPv4AddressesWithBoolean {

	public static void main(String[] args) {
		System.out.println("=========== Valid IP addresses ===============");
		String[] validIps = new String[] { "000.12.12.034", "121.234.12.12", "23.45.12.56", "0.1.2.3" };

		for (int i = 0; i < validIps.length; i++) {
			boolean flag = validate(validIps[i]);
			if (flag) {
				System.out.println("IPV4");
			} else {
				System.out.println("No");
			}
		}

		System.out.println("=========== Invalid IP addresses ===============");

		String[] invalidIps = new String[] { "000.12.234.23.23", "666.666.23.23", ".213.123.23.32", "523.45.22.32.",
				"I.Am.not.an.ip" };
		for (int i = 0; i < invalidIps.length; i++) {
			boolean flag = validate(invalidIps[i]);

			if (flag) {
				System.out.println("IPV4");
			} else {
				System.out.println("No");
			}
		}
	}

	private static boolean validate(String ipAddr) {

		Pattern pattern;
		Matcher matcher;
		boolean flag = false;

		String regEx = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		try {

			if (ipAddr.indexOf(".") > 0) {
				pattern = Pattern.compile(regEx);
				matcher = pattern.matcher(ipAddr);
				if (matcher.matches()) {
					flag = true;
				}
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}
