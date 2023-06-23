package com.project1.ConfigurationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Configuration.ConfigurationDropdown;
import com.project1.Configuration.DataImport;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class DataImportTest extends OrangeBase{
	LoginOrangeHrm lo;
	ConfigurationDropdown ct;
	DataImport di;
	
  @Test
  public void selectDataImport() {
	  ct.clickconfig();
	  di.clickDataImport();
  }
  
  @BeforeMethod
 	public void beforeMethod() {
 		intialization();
 		lo = new LoginOrangeHrm();
 		ct=new ConfigurationDropdown();
 		di=new DataImport();
 		lo.login();
 		lo.selectPIM();
 	}

 	@AfterMethod
 	public void afterMethod() {
 		close();
 	}
}
