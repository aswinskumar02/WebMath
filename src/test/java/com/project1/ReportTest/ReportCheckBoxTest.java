package com.project1.ReportTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Reports.ReportCheckBox;
import com.project1.Reports.SearchReports;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class ReportCheckBoxTest extends OrangeBase {
	LoginOrangeHrm lo;
	SearchReports sr;
	ReportCheckBox rc;
	
  @Test
  public void checkBoxSelectionandDelete() {
	  sr.clickReport();
	  rc.selectCheckbox();
	  rc.checkboxDelete();  
  }
  
  @BeforeMethod
 	public void beforeMethod() {
 		intialization();
 		lo = new LoginOrangeHrm();
 		sr =new SearchReports();
 		rc= new ReportCheckBox();
 		lo.login();
 		lo.selectPIM();
 	}

 	@AfterMethod
 	public void afterMethod() {
 		close();
 	}

}
