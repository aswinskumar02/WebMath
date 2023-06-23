package com.project1.ConfigurationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Configuration.ConfigurationDropdown;
import com.project1.Configuration.ReportingMethod;

import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class ReportingMethodTest extends OrangeBase {
	LoginOrangeHrm lo;
	ConfigurationDropdown ct;
	ReportingMethod rm;
	
  @Test
  public void selectRepotingMethod() {
	  ct.clickconfig();
	  rm.selectReport();
  }
  
  @Test
  public void addCustomField() {
	  ct.clickconfig();
	  rm.selectReport();
	  rm.addnew();
	  rm.saveReport();
  }
  
  @Test
  public void cancelField() {
	  ct.clickconfig();
	  rm.selectReport();
	  rm.addnew();
	  rm.resetField();
  }
  
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ct = new ConfigurationDropdown();
		rm = new ReportingMethod();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
