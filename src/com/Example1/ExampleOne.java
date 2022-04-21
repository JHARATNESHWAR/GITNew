package com.Example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mantreshwar Jha\\eclipse-workspace\\SeleniumJava\\Resources\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mantreshwar Jha\\eclipse-workspace\\SeleniumJava\\Resources\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		
		
	}

}
