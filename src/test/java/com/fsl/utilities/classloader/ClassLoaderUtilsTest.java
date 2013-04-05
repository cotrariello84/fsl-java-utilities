package com.fsl.utilities.classloader;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ClassLoaderUtilsTest {

	@Test
	public void testCurrentClasspath() {
		assertTrue(ClassLoaderUtils.getCurrentClasspath().length > 0);
	}

}
