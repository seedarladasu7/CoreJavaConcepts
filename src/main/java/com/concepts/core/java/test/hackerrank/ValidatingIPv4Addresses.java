package com.concepts.core.java.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingIPv4Addresses {

	public static void main(String[] args) throws Exception {

		System.out.println("=========== Valid IP addresses ===============");
		String[] validIps = new String[] { "000.12.12.034", "121.234.12.12", "23.45.12.56", "0.1.2.3" };

		for (int i = 0; i < validIps.length; i++) {
			validate(validIps[i]);
		}

		System.out.println("=========== Invalid IP addresses ===============");

		String[] invalidIps = new String[] { "000.12.234.23.23", "666.666.23.23", ".213.123.23.32", "523.45.22.32.",
				"I.Am.not.an.ip" };
		for (int i = 0; i < invalidIps.length; i++) {
			validate(invalidIps[i]);
		}

		System.out.println("=========== Mixed valid/invalid IP addresses ===============");

		String[] mixedIps = new String[] { "000.12.12.034", "121.234.12.12", "23.45.12.56", "00.12.123.123123.123",
				"122.23", "Hello.IP" };
		for (int i = 0; i < mixedIps.length; i++) {
			validate(mixedIps[i]);
		}

		System.out.println("=========== IP6 addresses check ===============");

		String[] validIp6 = new String[] { "2001:0db8:0001:0000:0000:0ab9:C0A8:0102",
				"2001:db8:3333:4444:CCCC:DDDD:EEEE:FFFF", "2001:db8:3333:4444:5555:6666:7777:8888", "::1234:5678",
				"2001:db8:1::ab9:C0A8:102" };
		for (int i = 0; i < validIp6.length; i++) {
			validate(validIp6[i]);
		}
	}

	public static void validate(final String ip) {
		Pattern pattern;
		Matcher match;
		String ip4 = "IPv4";
		String ip6 = "IPv6";
		String non = "Neither";

		List<String> resultList = new ArrayList<>();

		final String ipv4 = 
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		
		final String ipv6 = 
				"^[0-9A-Fa-f]{1,4}:" + "[0-9A-Fa-f]{1,4}:" +
				"[0-9A-Fa-f]{1,4}:" + "[0-9A-Fa-f]{1,4}:" +
				"[0-9A-Fa-f]{1,4}:" + "[0-9A-Fa-f]{1,4}:" +
				"[0-9A-Fa-f]{1,4}:" + "[0-9A-Fa-f]{1,4}$";

		if (ip.indexOf(".") > 0) {
			pattern = Pattern.compile(ipv4);
			match = pattern.matcher(ip);
			if (match.matches()) {
				resultList.add(ip4);
				// System.out.println(ip4);
			} else {
				resultList.add(non);
				// System.out.println(non);
			}
		} else if (ip.indexOf(":") > 0) {
			pattern = Pattern.compile(ipv6);
			match = pattern.matcher(ip);
			if (match.matches()) {
				resultList.add(ip6);
				// System.out.println(ip6);
			} else {
				resultList.add(non);
				// System.out.println(non);
			}
		} else {
			resultList.add(non);
			// System.out.println(non);
		}

		System.out.println(resultList);
	}

}