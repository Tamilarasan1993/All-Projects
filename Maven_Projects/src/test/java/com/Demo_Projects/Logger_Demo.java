package com.Demo_Projects;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Demo {

	public static Logger log = Logger.getLogger(Logger_Demo.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
	//	BasicConfigurator.configure();
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatel");
		
	}
	
}
