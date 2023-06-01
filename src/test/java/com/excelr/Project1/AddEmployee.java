package com.excelr.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployee {
	WebDriver Driver;
	
	@BeforeMethod
	public void before_methodTest() {
		try {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			Driver = new ChromeDriver(co);
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

			File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);
			Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Driver.findElement(By.name("username")).sendKeys(p.getProperty("Username"));
			Thread.sleep(2000);
			Driver.findElement(By.name("password")).sendKeys(p.getProperty("Password"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	 @Test(priority = 1)
	  public void AddEmployee1() {
		  try {
			  File f = new File("Addemployee1.properties");
				FileInputStream addemp = new FileInputStream(
						f.getAbsolutePath());
				Properties p = new Properties();
				p.load(addemp);
				
				
				Driver.findElement(By.name("firstName")).sendKeys(p.getProperty("Firstname"));
				Thread.sleep(2000);
				Driver.findElement(By.name("middleName")).sendKeys(p.getProperty("Middlename"));
				Thread.sleep(2000);
				Driver.findElement(By.name("lastName")).sendKeys(p.getProperty("Lastname"));
				Thread.sleep(2000);
				/*
				 * Driver.findElement(By.xpath(
				 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click
				 * (); Thread.sleep(2000);
				 */
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}  
	  }
	  
  @Test(priority = 1)
  public void Createlogindetails() {
	  try {
		  File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);
		
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"))
					.click();

			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"))
					.sendKeys(p.getProperty("Username1"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"))
					.sendKeys(p.getProperty("Password1"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"))
					.sendKeys(p.getProperty("Cpassword"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}  
  }
  
  @Test(priority = 2)
  public void Addimage() {
	  try {
		  WebElement add = Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
			Thread.sleep(2000);
			File f = new File(
					"C:\\eclipse selenium1\\selenium concept\\src\\png-transparent-free-download-icon-cloud-down-computer-system-blue-computer-blue-laptop.png");
			System.out.println(f.getAbsolutePath());
			add.sendKeys(f.getAbsolutePath());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}  
  }
  
  

  
  @AfterMethod
	public void after_methodTest() {
		Driver.close();
	}
}
