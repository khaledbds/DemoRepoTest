package com.bit.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;

	@Test
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khale\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
}
