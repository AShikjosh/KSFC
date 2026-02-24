package TestCases;

import java.awt.AWTException;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.Appraisal;
import ObjectRepository.EnquirySubmission;
import ObjectRepository.LoginPage;
import Resource.Base;

public class Login extends Base {
	// Global classes
	public WebDriver driver;
	LoginPage l = new LoginPage();
	EnquirySubmission e = new EnquirySubmission();
	Appraisal a = new Appraisal();

	@BeforeMethod
	public void openBrowser() throws IOException {
		driver = getDriver();
		Base.getUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test()
	public void LogintoEE() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String pan = "AUHFN1596R";
		String GST ="29AUHFN1596R1za";
		String branch = "BIDAR BRANCH";
		//String branch = "KALABURAGI BRANCH";
		String ksfcuser = "108944";
		String password = "welcome123";
		String approverofficer = "9601";
		String selectbranch = "BO Bidar - BRANCH HEAD";
		//String selectbranch = "BO Gulbarga - EMPLOYEE";
		String preappraisalteam ="108944 - Jagadeesh  N V";
		String uploadjpg ="D:\\KSFC\\download.jpg";
		String uploadpdf ="D:\\KSFC\\02-09-2023_unit_name_not_displayed in signature.pdf";
		//String typeofSector="Hospitality";
		String typeofSector="Health Sector";
		//String LoanType="PRIVILEGED ENTREPRENEURS SCHEME";
		String LoanType="AMARA SCHEME";
		
		
		
			String EGNum = e.NewEnquiry(pan, branch, uploadpdf, GST);

	String appno = l.EG(EGNum, ksfcuser, password, approverofficer, selectbranch, pan, uploadjpg, uploadpdf);
	//String appno = "96300105142";
		a.PreAppraisal(appno,preappraisalteam,uploadpdf,GST,typeofSector,LoanType,selectbranch);

	}

	@AfterMethod
	public void Afterclass() throws IOException {
		// driver.close();
	}
}
