package com.project1.ConfigurationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.project1.Configuration.ConfigurationDropdown;
import com.project1.Configuration.OptionalField;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class OptionalFieldTest extends OrangeBase{
	LoginOrangeHrm lo;
	ConfigurationDropdown ct;
	OptionalField of;
	
  @Test
  public void selectOptionalField() {
	  ct.clickconfig();
	  of.selectOptional();
	  
  }
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ct=new ConfigurationDropdown();
		of=new OptionalField();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

}
