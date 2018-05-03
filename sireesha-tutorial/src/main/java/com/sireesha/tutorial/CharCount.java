package com.sireesha.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
	
	
	public static void main(String[] args) {

		System.out.println("Enter some text: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		CharCount cc = new CharCount();

		System.out.println(cc.countChars(str));
	}

	/**
	 * Takes a string and return a map with character and it's frequency
	 * @param string
	 * @return
	 */
	public Map<Character, Integer> countChars(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = string.replaceAll("\\s+", "");
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		return map;
	}

}
