package com.program.hackerrank;

import java.text.SimpleDateFormat;

public class Date12To24conversion {

	public static String convert12to24Date(String input12Date) {
		CharSequence s1 =input12Date.subSequence(0, 8);
		CharSequence s2 =input12Date.subSequence(8, 10);
		String time12 =s1+" "+s2;
		System.out.println(s1.toString());
		String time24 = null;
		try {
//			String now = new SimpleDateFormat("hh:mm:ss aa").format(new java.util.Date().getTime());
//			System.out.println("time in 12 hour format : " + now);
			SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ss a");
			SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
			time24 = outFormat.format(inFormat.parse(time12));
			System.out.println("time in 24 hour format : " + time24);
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		return time24;
	}

	public static void main(String[] args) {
		String input="06:40:03AM";
		Date12To24conversion.convert12to24Date(input);
	}
}
