package com.program.logical;

public class MachingStringSufix {

	public static void main(String[] args) {
		String mother = "ratnesh";
		String techer = "ratnesh";

		char[] motherchar = mother.toCharArray();
		char[] techerchar = techer.toCharArray();

		int motherlength = motherchar.length - 1;
		int techerlength = techerchar.length - 1;
		StringBuilder builder = new StringBuilder();
		int n = motherchar.length - 1;
		for (int j = n; j >= 0; j--) {
			if (motherchar[motherlength] == techerchar[techerlength]) {
				builder.append(motherchar[j]);
				motherlength--;
				techerlength--;
			} else {
				break;
			}
		}
		System.out.println("Maching String Sufix is: " + builder.reverse());
	}

}
