package com.project1.EmployeeListTest;

import org.testng.annotations.Test;

import com.project1.Employeelist.DropdownList;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DropdownListTest extends OrangeBase {
	LoginOrangeHrm lo;
	DropdownList dl;
  @Test
  public void allDropdownTest() {
	  dl.employeeStatusDropdownTest();
	  dl.includeDropdownTest();
	  dl.supervisorNameTest();
	  dl.jobDropdownTest();
	  dl.subunitDropdownTest();
  }
  @BeforeMethod
  public void beforeMethod() {
	  intialization();
		lo = new LoginOrangeHrm();
		dl= new DropdownList();
		lo.login();
		lo.selectPIM();
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }

}
