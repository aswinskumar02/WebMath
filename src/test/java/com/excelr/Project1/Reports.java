package com.excelr.Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Reports {
	WebDriver Driver;

	@BeforeMethod
	public void beforeMethod() {
		try {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			Driver = new ChromeDriver(co);
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

			Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);
			Driver.findElement(By.name("username")).sendKeys(p.getProperty("Username"));
			Thread.sleep(2000);
			Driver.findElement(By.name("password")).sendKeys(p.getProperty("Password"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 0)
	public void Searchreport() {
		try {
			File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input"))
					.sendKeys("employee");
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div[2]/div[1]"))
					.click();
			Thread.sleep(2000);

			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(2000);

			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();
			Thread.sleep(2000); // Reset
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void Addreport() {
		try {
			File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);

			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")).click();
			Thread.sleep(2000);
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"))
					.sendKeys(p.getProperty("Reportname"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div[1]"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]"))
					.click();
			Thread.sleep(2000);

			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div[1]"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/div[2]"))
					.click();
			Thread.sleep(2000);

			Driver.findElement(By
					.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[2]/div[2]/button"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void printlist() {
		try {
			List<WebElement> allLinks = Driver.findElements(By
					.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div  "));
			Iterator<WebElement> itr = allLinks.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next().getText());
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 3)
	public void CheckboxselectionandDelete() {
		try {
			WebElement checkbox1 = Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span/i"));
			checkbox1.click();
			Thread.sleep(2000);
			WebElement checkbox2 = Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i"));
			checkbox2.click();
			Thread.sleep(3000);

			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button"))
					.click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void minimizebutton() {
		try {

			WebElement mini = Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button"));
			mini.click();
			Thread.sleep(4000);
			mini.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterMethod
	public void after_methodTest() {
		Driver.close();
	}

}
