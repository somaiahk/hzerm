package com.mckesson.util;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class DateUtil {

	public static Timestamp getTimestampFromDate(Date date) {
		if (null == date) {
			return null;
		}
		return new Timestamp(date.getTime());
	}
}
