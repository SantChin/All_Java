package com.san.java.level1;

public class ReplaceAllVowelsIntoCapitalCase {

	public static void main(String[] args) {

		String s = "santosh";

		char[] ch = s.toCharArray();
		char[] temp = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a') {
				temp[i] = 'A';
			} else if (ch[i] == 'e') {
				temp[i] = 'E';
			} else if (ch[i] == 'i') {
				temp[i] = 'I';
			} else if (ch[i] == 'o') {
				temp[i] = 'O';
			} else if (ch[i] == 'u') {
				temp[i] = 'U';
			} else {
				temp[i] = ch[i];
			}

		}
		System.out.println(String.valueOf(temp));
	}
}
