package com.sk.base;

import java.util.Properties;

public class TestBase {
	
	public static Properties prop;
	public static void initialization(){
		String browserName=prop.getProperty("url");
		
		if(browserName.equals("chrome")){
			System.setProperty("", "");
		}
	}

}
