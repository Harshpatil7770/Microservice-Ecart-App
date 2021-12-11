package com.amzon.ecart.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalResource {

	public static Logger getInstance(Class className) {
		return LoggerFactory.getLogger(className);
	}
}
