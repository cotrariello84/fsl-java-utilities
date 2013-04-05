package com.fsl.utilities.datetime;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DateTimeUtilsTest {

	@Test
	public void testCorrectLength() {
		assertTrue(DateTimeUtils.getCurrentHourMinute().length() == 5);
	}

	@Test
	public void testInterval() {
		
		assertTrue(DateTimeUtils.isHourMinuteInInterval(
				DateTimeUtils.getCurrentHourMinute(), "00:01", "23:59"));
	}

}
