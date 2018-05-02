package com.sireesha.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	// private static final String REGEX = "[a-zA-Z0-9\\\\._\\\\-]{3,}";
	 private static final String USERNAME_PATTERN = 
			 "^(?!.*[-_]{2,})(?=^[^-_].*[^-_]$)[\\w-]{3,9}$";
	 
	   private static final String INPUT = "cre-0";

	   public static void main( String args[] ) {
	      Pattern p = Pattern.compile(USERNAME_PATTERN);
	      Matcher m = p.matcher(INPUT);   // get a matcher object
	      System.out.println(m.matches());
	   }

}
