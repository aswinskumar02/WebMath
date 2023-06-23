package com.project1.EmployeeListTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Employeelist.Addbutton;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class AddbuttonTest extends OrangeBase {
	LoginOrangeHrm lo;
	Addbutton ab;
  @Test
  public void addButtonTest() {
	  
	  ab.addButtonFromEmployeeList();
	  
  }
  
  
  
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ab = new Addbutton();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
