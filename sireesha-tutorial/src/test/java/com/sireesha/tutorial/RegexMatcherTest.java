package com.sireesha.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegexMatcherTest {
	
	RegexMatcher rm = new RegexMatcher();
	

	@Test
	public void testIsUserNameValid() throws Exception {
		boolean validUsername = rm.isUserNameValid("cre-0");
		
		assertTrue(validUsername);
	}
	
	@Test
	public void testIsUserNameInValid() throws Exception {
		boolean validUsername = rm.isUserNameValid("cre-0ertrrr");
		
		assertFalse(validUsername);
	}

}
