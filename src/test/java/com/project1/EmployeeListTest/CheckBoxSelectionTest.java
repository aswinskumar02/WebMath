package com.project1.EmployeeListTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Employeelist.CheckBoxSelection;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class CheckBoxSelectionTest extends OrangeBase {
	LoginOrangeHrm lo;
	CheckBoxSelection cbs;

	@Test
	public void checkBoxSelectionandDelete() {
		cbs.checkBox();
		cbs.checkboxDelete();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		cbs = new CheckBoxSelection();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

}
