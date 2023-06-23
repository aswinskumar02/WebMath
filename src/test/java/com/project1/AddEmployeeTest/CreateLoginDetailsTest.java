package com.project1.AddEmployeeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.AddEmployee.AddEmployee1;
import com.project1.AddEmployee.CreateLoginDetails;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class CreateLoginDetailsTest extends OrangeBase{
	LoginOrangeHrm lo;
	AddEmployee1 ae;
	CreateLoginDetails cls;
	
  @Test
  public void addEmployeeWithCreateLogin() {
	  ae.addOption();
	  ae.addEmployee1();
	  cls.clickButton();
	  cls.loginDetails();
	  ae.save();
  }
  @Test
  public void Canceldetails() {
	  ae.addOption();
	  ae.addEmployee1();
	  cls.clickButton();
	  cls.loginDetails();
	  ae.cancel();
  }
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		ae=new AddEmployee1();
		cls =new CreateLoginDetails();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
