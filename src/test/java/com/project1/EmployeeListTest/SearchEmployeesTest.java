package com.project1.EmployeeListTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Employeelist.SearchEmployees;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class SearchEmployeesTest extends OrangeBase{

		LoginOrangeHrm lo;
		SearchEmployees se;

		@Test
		public void searchValidEmplyoee() {
			se.employeewithValidcredential();
			se.searchButton();
		}

		@Test
		public void searchInValidEmplyoee() {
			se.employeewithInValidcredential();
			se.searchButton();
		}

		@Test
		public void reset() {
			se.employeewithInValidcredential();
			se.resetButton();

		}
		
		@BeforeMethod
		public void beforeMethod() {
			intialization();
			lo = new LoginOrangeHrm();
			se = new SearchEmployees();
			lo.login();
			lo.selectPIM();
		}

		@AfterMethod
		public void afterMethod() {
			close();
		}

	}

