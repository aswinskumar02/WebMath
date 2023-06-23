package com.project1.AddEmployeeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.AddEmployee.AddEmployee1;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class AddEmployee1Test extends OrangeBase {
	LoginOrangeHrm lo;
	AddEmployee1 ae;
	
  @Test
  public void addEmployee() {
	  ae.addOption();
	  ae.addEmployee1();
	  ae.save();
  }
  
  @Test
  public void CancelEmployeeDetails() {
	  ae.addOption();
	  ae.addEmployee1();
	  ae.cancel();
  }
  
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ae=new AddEmployee1();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
