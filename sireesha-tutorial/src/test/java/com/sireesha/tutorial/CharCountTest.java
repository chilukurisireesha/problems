package com.sireesha.tutorial;





import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CharCountTest {
	
	
	CharCount charCount = new CharCount();
	
	@Test
	  public void testAssertEquals() {
		Map<Character, Integer> charMap = charCount.countChars("This is a test by sireesha for testing the frequency of characters");
		assertEquals("should have 4 a", new Integer(4), charMap.get('a'));
	  }

}
