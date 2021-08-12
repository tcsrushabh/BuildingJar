package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	public static void main(String[] args) {
//		System.out.println();//never use 
		Logger Logger = LogManager.getLogger(LoggingDemo.class);
		Logger.debug("this is a debug message");
		Logger.error("error");
		Logger.fatal("fatal");
		Logger.trace("trace");
		Logger.info("info");
		Logger.warn("warm");
	}
}
