package com.project1.EmployeeListTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Employeelist.Printlist;
import com.project1.Employeelist.SearchEmployees;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class PrintListTest extends OrangeBase {
	
	LoginOrangeHrm lo;
	Printlist pl;
	
	
  @Test
  public void printEmployeeList() {
	  pl.printEmpList();
  }
  
	@BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		pl= new Printlist(); 
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
