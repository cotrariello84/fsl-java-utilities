package com.fsl.utilities.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Utility class for doing various date and time manipulations
 * 
 * @author Noel O'Connor
 *
 */
public class DateTimeUtils {
	/**
	 * Supported hour minute format i.e. HH:mm
	 */
	private final static String HOUR_MINUTE_FORMAT = "HH:mm";
	
	/**
	 * @return current time in terms i.e HH:mm.
	 * Example 21:06 
	 */
	public static String getCurrentHourMinute(){
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdfHourMinute = new SimpleDateFormat(HOUR_MINUTE_FORMAT);
		String hourMinute = sdfHourMinute.format(now.getTime());
		return hourMinute;
	}
	
}
