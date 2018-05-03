package com.sireesha.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	// private static final String REGEX = "[a-zA-Z0-9\\\\._\\\\-]{3,}";
	 private static final String USERNAME_PATTERN = 
			 "^(?!.*[-_]{2,})(?=^[^-_].*[^-_]$)[\\w-]{3,9}$";
	 
 
	 
	/**
	 * Checks if a username follows a pattern Has to be 3 or more and 9 or less
	 * characters can contain - and number
	 * 
	 * @param input
	 * @return
	 */
	public boolean isUserNameValid(String input) {
		Pattern p = Pattern.compile(USERNAME_PATTERN);
		Matcher m = p.matcher(input); // get a matcher object
		return m.matches();
	}

}
