package com.fsl.utilities.classloader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Utility methods regarding the Java ClassLoader
 * 
 * @author Noel O'Connor
 *
 */
public class ClassLoaderUtils {

	/**
	 * Return the current classpath
	 * @return An array containing the current classpath entries
	 * 
	 */
	public static URL[] getCurrentClasspath(){
		ClassLoader cl = ClassLoader.getSystemClassLoader();
        return ((URLClassLoader)cl).getURLs();
	}
	
}
