package com.fsl.utilities.datetime;
import static org.junit.Assert.*;

import org.junit.Test;


public class DateTimeUtilsTest {

	@Test
	public void testCorrectLength() {
		assertTrue(DateTimeUtils.getCurrentHourMinute().length()==5);
	}

}
