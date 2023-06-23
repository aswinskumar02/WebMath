package com.project1.ConfigurationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Configuration.ConfigurationDropdown;
import com.project1.Configuration.TerminationReason;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class TerminationReasonTest extends OrangeBase{
	LoginOrangeHrm lo;
	ConfigurationDropdown ct;
	TerminationReason tr;

	
  @Test
  public void selectTermination() {
	  ct.clickconfig();
	  tr.click();
  }
  
  @Test
  public void addTermination() {
	  ct.clickconfig();
	  tr.click();
	  tr.addnew();
	  tr.save();
  }
  
  @Test
  public void cancelField() {
	  ct.clickconfig();
	  tr.click();
	  tr.addnew();
	  tr.reset();
  }
  
  @BeforeMethod
 	public void beforeMethod() {
 		intialization();
 		lo = new LoginOrangeHrm();
 		ct=new ConfigurationDropdown();
 		tr=new TerminationReason();
 		lo.login();
 		lo.selectPIM();
 	}

 	@AfterMethod
 	public void afterMethod() {
 		close();
 	}
}
