package com.fsl.utilities.file;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileUtilsTest {

	private final static String TMP_FOLDER = System
			.getProperty("java.io.tmpdir");

	private final static String FILE_SEP = File.separator;
	
	
	@Test
	public void testFileExtn() {
		File file = new File(TMP_FOLDER+FILE_SEP+"test.txt");
		File dir = new File(TMP_FOLDER+FILE_SEP);
		try {
			file.createNewFile();
			FileUtilities fUtil = new FileUtilities();
			assertTrue(fUtil.listFileByExtn(dir, "*.txt").length>0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(1==1);
	}
 


}
