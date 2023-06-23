package com.project2.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBasewebmath {
	public static WebDriver driver;
	public static Properties prop;

	public static void intialization() {
		String ConfigPath = "C:\\eclipse selenium1\\Testngdemo\\src\\main\\java\\com\\project2\\config\\Data.properties";
		FileInputStream FIS;

		try {
			FIS = new FileInputStream(ConfigPath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		prop = new Properties();

		try {
			FIS = new FileInputStream(ConfigPath);
			prop.load(FIS);
		} catch (IOException e) {

			e.printStackTrace();
		}
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));

	}
	public void close() {
		driver.quit();
		}
}
