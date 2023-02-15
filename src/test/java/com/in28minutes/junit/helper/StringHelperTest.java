package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
//usamos java 1.8 para debuggear
	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	StringHelper helper;
	@Before
	public void before(){

		helper = new StringHelper();
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		String result = helper.truncateAInFirst2Positions("AACD");
		System.out.println(result);
		assertEquals("CD", result);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	
}
