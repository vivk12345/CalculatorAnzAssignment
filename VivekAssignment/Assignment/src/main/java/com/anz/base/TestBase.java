package com.anz.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties pro;
	public TestBase(){
		try{
			 pro=new Properties();
			FileInputStream ip=new FileInputStream("E:\\VivekAssignment\\Assignment\\src\\main\\java\\com\\config\\config.properties");
			pro.load(ip);
	}catch(FileNotFoundException e){
			e.printStackTrace();
	}catch(IOException e){
			e.printStackTrace();
		}
		
			
		
		
		
	}
	public static void intialization(){
		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			
			driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
	}
	}

}
