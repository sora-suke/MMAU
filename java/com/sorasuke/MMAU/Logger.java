package com.sorasuke.MMAU;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Logger {
	
	private static org.apache.logging.log4j.Logger logger;
	
	public static void registry(FMLPreInitializationEvent e){
		logger = e.getModLog();
	}
	
	public static void log(String s){
		logger.log(org.apache.logging.log4j.Level.OFF, s);
	}
	
	public static void info(String s){
		logger.info(s);
	}
	
}
