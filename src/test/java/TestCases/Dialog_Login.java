package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.Asset_Registration;
import ObjectRepository.DIALOG_LOGIN;
import ObjectRepository.Vehicle;
import ObjectRepository.Vendor_Registration;
import Resource.Base;

public class Dialog_Login extends Base {
	// Global classes
	public WebDriver driver;
	DIALOG_LOGIN L= new DIALOG_LOGIN();
	Vendor_Registration VR= new Vendor_Registration();
	Asset_Registration AR = new Asset_Registration();
	Vehicle VcR = new Vehicle();
	
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		driver = getDriver();	
		Base.getUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test()
	public void LogintoEE() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String uploadpdf ="C:\\Automation\\KSFC(m)\\KSFC(m)\\02-09-2023_unit_name_not_displayed in signature.pdf";
		
		
		
		
	L.Login();
//		VR.VendorRegi(uploadpdf);
//		String a=AR.Asset_regi(uploadpdf);
//	
//		VcR.Vehicleregi(a);
		String a="MH-2024-2025-0037";
		VcR.Vehicleregi(a);

	}

	@AfterMethod
	public void Afterclass() throws IOException {
		// driver.close();
	}
}
