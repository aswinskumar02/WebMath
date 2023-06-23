package com.project1.ConfigurationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Configuration.ConfigurationDropdown;
import com.project1.Configuration.CustomField;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class CustomFieldTest extends OrangeBase {
	LoginOrangeHrm lo;
	ConfigurationDropdown ct;
	CustomField cf;
	
  @Test
  public void selectCustomField() {
	  ct.clickconfig();
	  cf.selectoption();
  }
  
  @Test
  public void addCustomField() {
	  ct.clickconfig();
	  cf.selectoption();
	  cf.addnew();
	  cf.saveCustomField();
  }
  
  @Test
  public void cancelField() {
	  ct.clickconfig();
	  cf.selectoption();
	  cf.addnew();
	  cf.resetField();
  }
  
  
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ct=new ConfigurationDropdown();
		cf=new CustomField();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

}
