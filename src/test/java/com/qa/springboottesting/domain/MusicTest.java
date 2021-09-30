package com.qa.springboottesting.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class MusicTest {
	@Test
	public void testEquals() {
		EqualsVerifier.forClass(Music.class)
		.suppress(Warning.NONFINAL_FIELDS)
		.usingGetClass()
		.verify();
	}
}
