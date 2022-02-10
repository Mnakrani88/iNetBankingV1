package com.inetbanking.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.iNetbankinv1.utility.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig= new ReadConfig();

	public String baseUrl=readconfig.geturl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
