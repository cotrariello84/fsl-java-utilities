package com.fsl.utilities.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileUtilities {



	public String[] listFileByExtn(File dir, String extn) {

		GenericExtFilter filter = new GenericExtFilter(extn);
		// list out all the file name with extension
		String[] list = dir.list(filter);
		return list;
	}

	// inner class,
	private class GenericExtFilter implements FilenameFilter {

		private String ext;

		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}

}
