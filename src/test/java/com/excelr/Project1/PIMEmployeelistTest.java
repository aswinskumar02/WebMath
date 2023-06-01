package com.excelr.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMEmployeelistTest {

	WebDriver Driver;

	@BeforeMethod
	public void before_methodTest() {
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

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 0)
	public void employeewithValidcredential() {
		try {

			WebElement empname = Driver.findElement(By
					.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div"));
			WebElement emplastname = Driver.findElement(By
					.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[4]/div"));
			WebElement empid1 = Driver.findElement(By
					.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/div"));
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"))
					.sendKeys(empname.getText() + " " + emplastname.getText());
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"))
					.sendKeys(empid1.getText());
			Thread.sleep(2000);
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(3000);
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void employeewithInvalidcredential() {
		try {
			File f = new File("Addemployee1.properties");
			FileInputStream addemp = new FileInputStream(
					f.getAbsolutePath());
			Properties p = new Properties();
			p.load(addemp);

			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"))
					.sendKeys(p.getProperty("EmployeeName"));
			Thread.sleep(2000);
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"))
					.sendKeys(p.getProperty("EmployeeId"));
			Thread.sleep(2000);
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(3000);
			Driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void employeestatusdropdowntest() {
		try {
			for (int j = 0; j < 6; j++) {
				int position = j;
				List<WebElement> dropdowns = Driver.findElements(By.className("oxd-select-text-input"));
				dropdowns.get(0).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(0).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(0).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void Includedropdowntest() {
		try {
			for (int j = 0; j < 3; j++) {
				int position = j;
				List<WebElement> dropdowns = Driver.findElements(By.className("oxd-select-text-input"));
				dropdowns.get(1).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(1).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(1).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 3)
	public void Jobdropdowntest() {
		try {
			for (int j = 0; j < 5; j++) {
				int position = j;
				List<WebElement> dropdowns = Driver.findElements(By.className("oxd-select-text-input"));
				dropdowns.get(2).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(2).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(2).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void Subunitdropdowntest() {
		try {
			for (int j = 0; j < 5; j++) {
				int position = j;
				List<WebElement> dropdowns = Driver.findElements(By.className("oxd-select-text-input"));
				dropdowns.get(3).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(3).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(3).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 5)
	public void Supervisornametest() {
		try {
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"))
					.sendKeys("a");
			Driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div[2]/div[2]"))
					.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 6)
	public void Addbutton() {
		try {
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
			Driver.navigate().back();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 7)
	public void CheckboxselectionandDelete() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) Driver;
			js.executeScript("window.scrollBy(0,350)", "");
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
			Driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]/i")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 8)
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

	@Test(priority = 9)
	public void Printlist() {
		try {

			List<WebElement> allLinks = Driver.findElements(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div"));
			Iterator<WebElement> itr = allLinks.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next().getText());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterMethod
	public void after_methodTest() {
		Driver.close();
	}

}