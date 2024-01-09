package com.infinite.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.infinite.test.PropertiesTestNG;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties(){
		try{String projectpath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectpath + "/src/test/java/com/infinite/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			PropertiesTestNG.browsername = browser;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public static void setProperties(){
		try{
			OutputStream output = new FileOutputStream(projectpath + "/src/test/java/com/infinite/config/config.properties");
			prop.setProperty("browser","chrome");
			prop.store(output, null);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
}
