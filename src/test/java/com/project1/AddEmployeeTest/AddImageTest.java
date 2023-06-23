package com.project1.AddEmployeeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.AddEmployee.AddEmployee1;
import com.project1.AddEmployee.AddImage;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class AddImageTest extends OrangeBase{
	LoginOrangeHrm lo;
	AddEmployee1 ae;
	AddImage ai;
	
	
  @Test
  public void ImageUpload() {
	  ae.addOption();
	  ae.addEmployee1();
	  ai.addEmployeeImage();;
  }
  
  @BeforeMethod
 	public void beforeMethod() {
 		intialization();
 		lo = new LoginOrangeHrm();
 		ae=new AddEmployee1();
 		ai=new AddImage();
 		lo.login();
 		lo.selectPIM();
 	}

 	@AfterMethod
 	public void afterMethod() {
 		close();
 	}
}
