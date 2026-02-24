package ObjectRepository;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resource.Base;
import io.reactivex.rxjava3.functions.Action;

public class Appraisal extends Base {
	LoginPage l = new LoginPage();

	public void PreAppraisal(String appno, String preappraisalteam, String uploadpdf, String GST ,String typeofSector,String LoanType ,String selectbranch ) throws InterruptedException, AWTException {
		// Click on close and navigate to login page
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
		
		
		
		LocalDateTime now = LocalDateTime.now();
		String date1 = dtf.format(now);
		
		 String str = date1;
	        String date = "";
	        int ind = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char p = str.charAt(i);
	            if (p != '0') {
	                ind = i;
	                break;
	            }
	        }
	        date = str.substring(ind, str.length());
	        // Printing leading zeros inside string
	        System.out.println(date);
	    
		
		
		
		
		Random rand = new Random();
		Robot r = new Robot();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	/*  l.Advance().click();
		l.Advanceconti().click();
		l.Loginas().click();
		l.EmpId().sendKeys("108944");
		l.Password().sendKeys("welcome123");
		l.loginbutton().click();
		Thread.sleep(1000);
		List<WebElement> message = driver.findElements(By.xpath("(//div[@id='divModelAlertAdmin'])[1]"));
		if (message.size() > 0) {

			String message1 = driver.findElement(By.xpath("(//div[@id='divModelAlertAdmin'])[1]")).getText();
			if (message1.contains("session")) {
				l.ForceLogin().click();
				l.EmpId().sendKeys("108944");
				l.Password().sendKeys("welcome123");
				l.loginbutton().click();
			}
		}*/
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Profile')]")));
		//driver.findElement(By.xpath("//label[contains(text(),'"+ selectbranch +"')]")).click();
		//l.continueas().click();
		
//	 	Pre Appraisal	
//
//		// Appraisal Terms
		Thread.sleep(1000);
//
	/*	driver.findElement(By.xpath("//a[.='Appraisal']")).click();
//
	driver.findElement(By.xpath("//a[.='Start Appraisal']")).click();
		driver.findElement(By.xpath("//button[@id='yes-button']")).click();
		driver.findElement(By.xpath("//a[.='Appraisal']")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(appno);
	*/
		
		WebElement e1a = driver.findElement(By.xpath("//a[@type='Pre']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
			+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1a);
		//driver.findElement(By.xpath("//a[@type='Pre']")).click();
		Select designation = new Select(driver.findElement(By.xpath("//select[@id='EmpId']")));
		designation.selectByValue("Jagadeesh  N V:108944");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@value='Add'])[1]")).click();
		Thread.sleep(5000);

		WebElement e1 = driver.findElement(By.xpath("//input[@id='submitAppTeam']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1);

		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

		// unit information

		// Unit details

		driver.findElement(By.xpath("//button[@id='Unit-tab']")).click();

		WebElement e2 = driver.findElement(By.xpath("//input[@id='unitsubmitId']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e2);

		driver.findElement(By.xpath("//button[@id='btnHideModalUD']")).click();

		// Address details

		WebElement e3 = driver.findElement(By.xpath("//button[@id='basic_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e3);

		WebElement e6 = driver.findElement(By.xpath("(//a[.='Edit'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e6);

		Select ddlTalukaEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlTalukaEnq']")));
		ddlTalukaEnq.selectByVisibleText("Sandur");

		Select ddlHobliEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlHobliEnq']")));
		ddlHobliEnq.selectByVisibleText("Sanduru");

		Select ddlVillageEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlVillageEnq']")));
		ddlVillageEnq.selectByVisibleText("Suseelnagar");

		driver.findElement(By.xpath("//input[@id='UtAltMobile']")).sendKeys("9916327977");

		driver.findElement(By.xpath("//textarea[@id='UtAltEmail']")).sendKeys("UtAltEmail@gmail.com");

		driver.findElement(By.xpath("//textarea[@id='UtWebsite']")).sendKeys("UtWebsite Address.co.in");

		driver.findElement(By.xpath("//input[@id='Continue-btn']")).click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[.='Edit'])[2]")));
		WebElement e7 = driver.findElement(By.xpath("(//a[.='Edit'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e7);

		driver.findElement(By.xpath("//input[@id='CopyRegOff']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Continue-btn']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[.='Edit'])[3]")));
		WebElement e9 = driver.findElement(By.xpath("(//a[.='Edit'])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e9);

		driver.findElement(By.xpath("//input[@id='CopyRegOff']")).click();

		Select KznCddlConstitution = new Select(driver.findElement(By.xpath("//select[@id='KznCddlConstitution']")));
		KznCddlConstitution.selectByVisibleText("CIRCLE-IV(KALABURGI)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Continue-btn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Save'])[3]")));

		WebElement e10 = driver.findElement(By.xpath("(//input[@value='Save'])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e10);

		driver.findElement(By.xpath("//button[@id='btnHideModalAddress']")).click();

		// Unit bank details

		WebElement e4 = driver.findElement(By.xpath("//button[@id='bank_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e4);

		WebElement e8 = driver.findElement(By.xpath("(//a[.='Edit'])[4]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e8);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnFetchBankDet']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UtBankPrimary']")).click();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Save'])[4]")));

		WebElement e11 = driver.findElement(By.xpath("(//input[@value='Save'])[4]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e11);

		driver.findElement(By.xpath("//button[@id='btnHideModalBank']")).click();

		// Loan Application Details

		// Loan Details
		driver.findElement(By.xpath("//button[@id='Promoter-tab']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@id='promoter_detail_accor_btn'])[2]")));
		WebElement e5 = driver.findElement(By.xpath("(//button[@id='promoter_detail_accor_btn'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='PurposeLoan']")));
		Select PurposeLoan = new Select(driver.findElement(By.xpath("//select[@id='PurposeLoan']")));
		PurposeLoan.selectByVisibleText("NEW LOAN");

		Select ActivityType = new Select(driver.findElement(By.xpath("//select[@id='ActivityType']")));
		ActivityType.selectByVisibleText(typeofSector);

		
		Select LoanType1 = new Select(driver.findElement(By.xpath("//select[@id='LoanType']")));
		LoanType1.selectByVisibleText(LoanType);
		
		Thread.sleep(2000);
		Select SizeCd = new Select(driver.findElement(By.xpath("//select[@id='SizeCd']")));
		SizeCd.selectByValue("20");
		
		Select MajorActId = new Select(driver.findElement(By.xpath("//select[@id='MajorActId']")));
		MajorActId.selectByValue("3");
		
		Select ddlMajorActivity = new Select(driver.findElement(By.xpath("//select[@id='ddlMajorActivity']")));
		ddlMajorActivity.selectByValue("2");
		

		driver.findElement(By.xpath("//input[@id='DateInfoComplete']")).click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='" +date+ "']")));
		//driver.findElement(By.xpath("//a[.='" +date+ "']")).click();

		Thread.sleep(2000);

		WebElement e12 = driver.findElement(By.xpath("//input[@value='Save PreAppraisal Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e12);

		Thread.sleep(2000);
		String unit_details = driver.findElement(By.xpath("//p[@id='pModalAlertCommon']")).getText();
		System.out.println(unit_details);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		Thread.sleep(2000);

		// Management Appraisal
//		driver.findElement(By.xpath("//a[.='Appraisal']")).click();
//
//		driver.findElement(By.xpath("//a[.=' Start Appraisal']")).click();
//		driver.findElement(By.xpath("//button[@id='no-button']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='search'])[1]")));
//		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("1581913");
//		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
//
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cancel-button']")));
//		driver.findElement(By.xpath("//button[@id='cancel-button']")).click();
//		Select myListBox = new Select(driver.findElement(By.xpath("//select[@id='myListBox']")));
//		myListBox.selectByIndex(0);
//		driver.findElement(By.xpath("//a[@class='btn btn-primary btnOK']")).click();
//		Thread.sleep(2000);
		// management Appraisal
		WebElement e1016 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1016);
		//driver.findElement(By.xpath("//a[.='Management Appraisal']")).click();
		
		WebElement e1016a = driver.findElement(By.xpath("//a[.='Management Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1016a);

		// Promoter Profile
		WebElement e114 = driver.findElement(By.xpath("(//a[.='Edit'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e114);

		driver.findElement(By.xpath("//input[@id='txtRDNumber']")).sendKeys("RD1254785412871");
		driver.findElement(By.xpath("//input[@name='NameFatherSpouse']")).sendKeys("Father");
		driver.findElement(By.xpath("//input[@id='PromJnDt']")).click();

		// driver.findElement(By.xpath("//a[.='" + date + "']")).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Select PqualCd = new Select(driver.findElement(By.xpath("//select[@id='PqualCd']")));
		PqualCd.selectByVisibleText("Graduation");

		driver.findElement(By.xpath("//input[@id='PromTelNo']")).sendKeys("9946307977");
		driver.findElement(By.xpath("//input[@id='PromAddlqual']")).sendKeys("Further Details of Qualification");
		Thread.sleep(1000);
		Select PromChief = new Select(driver.findElement(By.xpath("//select[@id='PromChief']")));
		PromChief.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@id='PromTransunionCibilscore']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='PromPersonalCibilscrore']")).sendKeys("3");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='PromoterProfileSave']")));
		driver.findElement(By.xpath("//button[@id='PromoterProfileSave']")).click();
		Thread.sleep(2000);

		List<WebElement> Yesb = driver.findElements(By.xpath("//button[.='Yes']"));
		if (Yesb.size() > 0) {
			((WebElement) Yesb).click();
		}
		Thread.sleep(2000);
		WebElement e13 = driver.findElement(By.xpath("(//input[@value='Save'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e13);
		driver.findElement(By.xpath("//button[@id='btnHideModalAddress']")).click();

		Thread.sleep(2000);
		// promoter address details
		WebElement e121 = driver.findElement(By.xpath("//strong[.='Promoter Address Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e121);
		WebElement e14 = driver.findElement(By.xpath("//a[.='Add Address']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e14);

		Thread.sleep(2000);
		Select PromoterCode = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCode.selectByIndex(1);

		driver.findElement(By.xpath("//textarea[@id='PromAddress']")).sendKeys("PromAddress ");
		Select ddlDistrict = new Select(driver.findElement(By.xpath("//select[@id='ddlDistrict']")));
		ddlDistrict.selectByVisibleText("BALLARI");

		driver.findElement(By.xpath("//input[@id='ddlPincodeCdtext']")).sendKeys("583124");
		driver.findElement(By.xpath("//input[@id='AddrType']")).click();
		Thread.sleep(2000);
		WebElement e1039 = driver.findElement(By.xpath("(//button[.='Continue'])"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1039);

		Thread.sleep(2000);
		WebElement e15 = driver.findElement(By.xpath("(//input[@value='Save'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e15);

		driver.findElement(By.xpath("//button[@id='btnHideModalPromAddress']")).click();
		Thread.sleep(2000);
		// Promoter bank details

		Thread.sleep(2000);
		WebElement e16 = driver.findElement(By.xpath("//strong[.='Promoter Bank Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e16);

		WebElement e17 = driver.findElement(By.xpath("(//a[.='Add Bank'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e17);

		Thread.sleep(2000);
		Select PromoterCode1 = new Select(driver.findElement(By.xpath("(//select[@id='PromoterCode'])[1]")));
		PromoterCode1.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='PreIFSCCode']")).sendKeys("SBIN0040971");
		driver.findElement(By.xpath("//button[@id='btnFetchBankDet']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPincode']")).sendKeys("583124");
		driver.findElement(By.xpath("//input[@id='PrmAcNo']")).sendKeys("1234567" + rand);
		driver.findElement(By.xpath("//input[@id='confirmAccountNumberInput']")).sendKeys("1234567" + rand);
		driver.findElement(By.xpath("//input[@id='PrmBankAcName']")).sendKeys("ABC");
		Select PrmAcType = new Select(driver.findElement(By.xpath("//select[@id='PrmAcType']")));
		PrmAcType.selectByValue("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Continue'])")).click();
		Thread.sleep(2000);
		WebElement e18 = driver.findElement(By.xpath("(//input[@value='Save'])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e18);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnHideModalMgmtBank']")));
		driver.findElement(By.xpath("//button[@id='btnHideModalMgmtBank']")).click();
		Thread.sleep(2000);
		// Promoter Asset Details
		Thread.sleep(2000);
		WebElement e19 = driver.findElement(By.xpath("//strong[.='Promoter Asset Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e19);

		WebElement e22 = driver.findElement(By.xpath("(//a[.='Add Asset'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e22);
		Thread.sleep(2000);
		Select PromoterCodea = new Select(driver.findElement(By.xpath("(//select[@id='ddlPromoterCode'])[1]")));
		PromoterCodea.selectByIndex(1);
		Select AssetcatCd = new Select(driver.findElement(By.xpath("(//select[@id='AssetcatCd'])[1]")));
		AssetcatCd.selectByVisibleText("Movable Asset");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@id='AssettypeCd'])[1]")));
		Select AssettypeCd = new Select(driver.findElement(By.xpath("(//select[@id='AssettypeCd'])[1]")));
		AssettypeCd.selectByVisibleText("CASH ON HAND");
		driver.findElement(By.xpath("//textarea[@id='AppAssetDesc']")).sendKeys("AppAssetDesc");
		driver.findElement(By.xpath("//input[@id='PromoAssetValue']")).sendKeys("49999");
		driver.findElement(By.xpath("//button[@id='promoterAsset']")).click();

		WebElement e21 = driver.findElement(By.xpath("(//input[@value='Save'])[4]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e21);

		driver.findElement(By.xpath("//button[@id='btnHideModalPromAsset']")).click();
		Thread.sleep(2000);

		// Promoter Liability Details
		
		Thread.sleep(1000);

		WebElement e23 = driver.findElement(By.xpath("//strong[.='Promoter Liability Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e23);

		WebElement e24 = driver.findElement(By.xpath("(//a[.='Add Liability'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e24);
		Thread.sleep(2000);
		Select PromoterCodeb = new Select(driver.findElement(By.xpath("(//select[@id='PromoterCode'])[1]")));
		PromoterCodeb.selectByIndex(1);
		driver.findElement(By.xpath("//textarea[@id='AppLiabDesc']")).sendKeys("Liability Description");
		driver.findElement(By.xpath("//input[@id='AppLiabValue']")).sendKeys("70000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e25 = driver.findElement(By.xpath("(//input[@value='Save'])[5]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e25);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalPromLiab']")).click();
		Thread.sleep(2000);

		// Promoter Net Worth Details

		WebElement e26 = driver.findElement(By.xpath("//strong[.='Promoter Net Worth Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e26);

//		driver.findElement(By.xpath("(//input[@name='inpPromNetWorth'])[1]")).sendKeys(
//				uploadpdf);
//		List<WebElement> ok = driver.findElements(By.xpath("(//button[.='OK'])[16]"));
//		if (ok.size() > 0) {
//			driver.findElement(By.xpath("(//button[.='OK'])[16]")).click();
//		}

		// Subsidy Eligibility

		WebElement e27 = driver.findElement(By.xpath("//strong[.='Subsidy Eligibility']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e27);

		WebElement e28 = driver.findElement(By.xpath("//input[@id='NoSubsidyElg']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e28);

		WebElement e29 = driver.findElement(By.xpath("//input[@id='SaveSubsidyEligibility']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e29);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='OK'])[16]")).click();
		Thread.sleep(2000);

		// Guarantor-tab
		WebElement guarantor = driver.findElement(By.xpath("//button[@id='Guarantor-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", guarantor);
		
		//driver.findElement(By.xpath("//button[@id='Guarantor-tab']")).click();

		Thread.sleep(2000);
		WebElement e1011 = driver.findElement(By.xpath("(//a[contains(@onclick,'AddOrEditGuarantorProfile')])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1011);

		driver.findElement(By.xpath("//input[@id='txtNameFatherSpouse']")).sendKeys("ABCD");
		Select ddlClass2 = new Select(driver.findElement(By.xpath("//select[@id='ddlClass']")));
		ddlClass2.selectByVisibleText("GENERAL");
		driver.findElement(By.xpath("//input[@id='txtTelNo']")).sendKeys("8977897897");

		driver.findElement(By.xpath("//input[@id='GuarTransunionCibilscore']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@id='GuarPersonalCibilscrore']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@id='txtPassport']")).sendKeys("ABA9875413");
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e30 = driver.findElement(By.xpath("//a[@id='btn-Guar']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e30);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='GuarPan']")).sendKeys("BATPJ5157A");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnPanSearch']")).click();
		driver.findElement(By.xpath("//input[@id='txtNameFatherSpouse']")).sendKeys("Kavya");
		Select ddlClass = new Select(driver.findElement(By.xpath("//select[@id='ddlClass']")));
		ddlClass.selectByVisibleText("GENERAL");
		Select ddlDomCd = new Select(driver.findElement(By.xpath("//select[@id='ddlDomCd']")));
		ddlDomCd.selectByVisibleText("BORN & DOMICILED IN KARNATAKA");
		driver.findElement(By.xpath("//input[@id='txtTelNo']")).sendKeys("8977897897");

		driver.findElement(By.xpath("//input[@id='GuarTransunionCibilscore']")).sendKeys("750");
		driver.findElement(By.xpath("//input[@id='GuarPersonalCibilscrore']")).sendKeys("740");
		driver.findElement(By.xpath("//input[@id='txtPassport']")).sendKeys("ABA9875413");
		driver.findElement(By.xpath("//input[@id='inpPromPhoto']")).sendKeys(
				uploadpdf);

		driver.findElement(By.xpath("//button[.='Continue']")).click();

		WebElement e1012 = driver.findElement(By.xpath("//form[@action='/Admin/ManagementAppraisal/SaveGuarantorProfileDetails']//input[@value='Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1012);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalGuarProfile']")).click();

		// Guarantor Address Details
		WebElement e1013 = driver.findElement(By.xpath("//strong[.='Guarantor Address Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1013);
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement e1014 = driver.findElement(By.xpath("//a[.='Add  Address']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1014);
		Thread.sleep(2000);
		Select PromoterCodec = new Select(driver.findElement(By.xpath("(//Select[@name='PromoterCode'])[1]")));
		PromoterCodec.selectByVisibleText("DFSGSFDSD");
		driver.findElement(By.xpath("//textarea[@name='GuarAddress']")).sendKeys("Address");
		Select ddlDistricta = new Select(driver.findElement(By.xpath("//select[@id='ddlDistrict']")));
		ddlDistricta.selectByVisibleText("BALLARI");
		driver.findElement(By.xpath("//input[@id='ddlPincodeCdtext']")).sendKeys("583124");
		driver.findElement(By.xpath("//input[@id='AdrPermanent']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(1000);
		WebElement e100 = driver.findElement(By.xpath("(//input[@value='Save'])[8]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e100);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalGuarAddress']")).click();

//			//Guarantor Bank Details	

		Thread.sleep(2000);
		WebElement e101 = driver.findElement(By.xpath("//strong[.='Guarantor Bank Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e101);
		Thread.sleep(2000);

		Thread.sleep(2000);
		WebElement e102 = driver.findElement(By.xpath("(//a[.='Add Bank'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e102);
		Thread.sleep(2000);

		Select PromoterCodez = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCodez.selectByVisibleText("DFSGSFDSD");
		driver.findElement(By.xpath("//input[@id='PreIFSCCode']")).sendKeys("SBIN0040204");
		driver.findElement(By.xpath("//button[@id='btnFetchBankDet']")).click();
		driver.findElement(By.xpath("//input[@id='txtPincode']")).sendKeys("583119");
		Select ddlGuarAcType1 = new Select(driver.findElement(By.xpath("//select[@id='ddlGuarAcType']")));
		ddlGuarAcType1.selectByVisibleText("Savings");
		driver.findElement(By.xpath("//input[@id='confirmAccountNumberInput']")).sendKeys("124579635");
		driver.findElement(By.xpath("//input[@id='txtGuarAcNo']")).sendKeys("124579635");
		driver.findElement(By.xpath("//input[@id='txtGuarBankAcName']")).sendKeys("ashikj");
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(5000);
		WebElement e33 = driver.findElement(By.xpath("(//input[@value='Save'])[9]"));

		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e33);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalGuarBank']")).click();

		// Guarantor Asset Details

		WebElement e103 = driver.findElement(By.xpath("//strong[.='Guarantor Asset Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e103);
		Thread.sleep(2000);
		WebElement e104 = driver.findElement(By.xpath("(//a[.='Add Asset'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e104);

		Thread.sleep(2000);

		Select PromoterCodex = new Select(driver.findElement(By.xpath("//select[@name='PromoterCode']")));
		PromoterCodex.selectByVisibleText("DFSGSFDSD");
		
		Thread.sleep(1000);
		Select AssetcatCd2 = new Select(driver.findElement(By.xpath("//select[@id='AssetcatCd']")));
		AssetcatCd2.selectByVisibleText("Movable Asset");
		Thread.sleep(2000);
		Select AssettypeCd2 = new Select(driver.findElement(By.xpath("//select[@id='AssettypeCd']")));
		AssettypeCd2.selectByVisibleText("CASH ON HAND");

		driver.findElement(By.xpath("//textarea[@id='AppAssetDesc']")).sendKeys("Asset Description");
		driver.findElement(By.xpath("//input[@id='GuaranterAssetValue']")).sendKeys("49999");
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e34 = driver.findElement(By.xpath("(//input[@value='Save'])[10]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e34);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalGuarAsset']")).click();

		// Liability Asset Details

		WebElement e35 = driver.findElement(By.xpath("//strong[.='Guarantor Liability Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e35);
		Thread.sleep(2000);
		WebElement e36 = driver.findElement(By.xpath("(//a[.='Add Liability'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e36);
		Thread.sleep(2000);
		Select PromoterCodey = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCodey.selectByVisibleText("DFSGSFDSD");

		driver.findElement(By.xpath("//textarea[@id='AppLiabDesc']")).sendKeys("Liability  Description");
		driver.findElement(By.xpath("//input[@id='AppLiabValue']")).sendKeys("40000");
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e37 = driver.findElement(By.xpath("(//input[@value='Save'])[11]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e37);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalGuarLiab']")).click();

		// Guarantor's Net Worth Details

		WebElement e38 = driver.findElement(By.xpath("(//button[@id='basic_accor_btn'])[13]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e38);
		Thread.sleep(2000);

//		driver.findElement(By.xpath("(//input[@name='inpPromNetWorth'])[2]")).sendKeys(
//				uploadpdf);
//		List<WebElement> ok1 = driver.findElements(By.xpath("(//button[.='OK'])[16]"));
//		if (ok1.size() > 0) {
//			Actions action = new Actions(driver);
//			WebElement e = driver.findElement(By.xpath("(//button[.='OK'])[16]"));
//			action.moveToElement(e).click();
//		}
		Thread.sleep(2000);

		// general
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='General-tab']")).click();
		WebElement e39 = driver.findElement(By.xpath("(//button[@id='basic_accor_btn'])[13]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e39);
		Thread.sleep(2000);
//		WebElement e40 = driver.findElement(By.xpath("//div[@id='has_sisterconcern']//a[contains(text(),'Edit')]"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e40);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='AppSisAddress']")).sendKeys("ADDRESS OF ASSOCIATE CONCERN");
//		driver.findElement(By.xpath("//button[.='Continue']")).click();
//
//		// Financial Details of Associate Concern
//
//		WebElement e41 = driver.findElement(By.xpath("//strong[.='Financial Details of Associate Concern']"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e41);
//		Thread.sleep(2000);
//		WebElement e134 = driver.findElement(By.xpath("//div[@id='has_sisfin']//a[contains(text(),'Add Details')]"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e134);
//		driver.findElement(By.xpath("(//input[@id='fixedAssetText1'])[1]")).sendKeys("2");
//		Thread.sleep(2000);
//
//		WebElement e42 = driver.findElement(By.xpath("(//input[@value='Save'])[12]"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e42);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='btnHideModalSisFin']")).click();
//		Thread.sleep(2000);
//		// Enquiry of Promoter PAN
//		Thread.sleep(2000);
//		WebElement e43 = driver.findElement(By.xpath("//strong[.='Enquiry of Promoter PAN']"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e43);
//		Thread.sleep(2000);
//		WebElement e47 = driver.findElement(By.xpath("//strong[.='Enquiry of Promoter PAN']"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e47);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='SearchItem']")).sendKeys("BFTPJ5157A");
//		driver.findElement(By.xpath("//input[@value='Fetch']")).click();
//	------------	
		driver.findElement(By.xpath("//input[@id='has_sisterconcern_checked']")).click();
		// KYC Risk Categorization
		Thread.sleep(5000);
		WebElement e44 = driver.findElement(By.xpath("//strong[.='KYC Risk Categorization']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e44);
		Thread.sleep(2000);
		WebElement e45 = driver
				.findElement(By.xpath("//div[@id='view-all-KycRiskDetails']//a[contains(text(),'Add Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e45);
		Thread.sleep(2000);

		Select ddlPromoterCode = new Select(driver.findElement(By.xpath("//select[@id='ddlPromoterCode']")));
		ddlPromoterCode.selectByIndex(1);
		Select ddlCategory = new Select(driver.findElement(By.xpath("//select[@id='ddlCategory']")));
		ddlCategory.selectByVisibleText("HIGH RISK");
		Thread.sleep(2000);
		Select ddlLevelCd = new Select(driver.findElement(By.xpath("//select[@id='ddlLevelCd']")));
		ddlLevelCd.selectByValue("1");
		driver.findElement(By.xpath("(//button[.='Save'])[2]")).click();
		Thread.sleep(2000);
		WebElement e109 = driver
				.findElement(By.xpath("//div[@id='view-all-KycRiskDetails']//a[contains(text(),'Add Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e109);
		Thread.sleep(2000);

		Select ddlPromoterCode1 = new Select(driver.findElement(By.xpath("//select[@id='ddlPromoterCode']")));
		ddlPromoterCode1.selectByIndex(1);
		Select ddlCategory1 = new Select(driver.findElement(By.xpath("//select[@id='ddlCategory']")));
		ddlCategory1.selectByVisibleText("MEDIUM RISK");
		Thread.sleep(2000);
		Select ddlLevelCd1 = new Select(driver.findElement(By.xpath("//select[@id='ddlLevelCd']")));
		ddlLevelCd1.selectByValue("12");
		driver.findElement(By.xpath("(//button[.='Save'])[2]")).click();
		Thread.sleep(2000);
		WebElement e111 = driver
				.findElement(By.xpath("//div[@id='view-all-KycRiskDetails']//a[contains(text(),'Add Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e111);
		Thread.sleep(2000);

		Select ddlPromoterCode2 = new Select(driver.findElement(By.xpath("//select[@id='ddlPromoterCode']")));
		ddlPromoterCode2.selectByIndex(1);
		Select ddlCategory2 = new Select(driver.findElement(By.xpath("//select[@id='ddlCategory']")));
		ddlCategory2.selectByVisibleText("LOW RISK");
		Thread.sleep(2000);
		Select ddlLevelCd2 = new Select(driver.findElement(By.xpath("//select[@id='ddlLevelCd']")));
		ddlLevelCd2.selectByValue("17");
		driver.findElement(By.xpath("(//button[.='Save'])[2]")).click();
		Thread.sleep(2000);
		WebElement e46 = driver.findElement(By.xpath("(//input[@value='Save'])[13]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e46);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalKycRisk']")).click();

		/// Promoter Background
		Thread.sleep(3000);
		WebElement e139 = driver.findElement(By.xpath("//button[@id='PromoterAppNote-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e139);
		driver.findElement(By.xpath("//button[@id='PromoterAppNote-tab']")).click();
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("xyz");

		WebElement e112 = driver.findElement(By.xpath("//input[@id='BtnSaveAppNoteBackground']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e112);
		WebElement e113 = driver.findElement(By.xpath("//button[@class='btn btn-primary bootbox-accept']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e113);
		driver.navigate().refresh();

		// Technical Appraisal
		Thread.sleep(1000);
		WebElement e1015 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1015);
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Technical Appraisal')]")));
		
		WebElement e1015a = driver.findElement(By.xpath("//a[.='Technical Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1015a);

		
		//driver.findElement(By.xpath("//a[contains(text(),' Technical Appraisal')]")).click();

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='obtained'])[1]")).click();
		Thread.sleep(2000);
		//WebElement e1015b = driver.findElement(By.xpath("(//input[@id='dp1699611182689'])[1]"));
		//js.executeScript("var evt = document.createEvent('MouseEvents');"
		//		+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
		//		+ "arguments[0].dispatchEvent(evt);", e1015b);
		driver.findElement(By.xpath("//input[@class='form-control datepicker-input hasDatepicker']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Thread.sleep(1000);
		WebElement e1017 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1017);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		driver.findElement(By.xpath("//button[@id='Land-tab']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[2]")).click();
		Select PjlndLand = new Select(driver.findElement(By.xpath("//select[@id='PjlndLand']")));
		PjlndLand.selectByVisibleText("Leased");
		Thread.sleep(2000);
		Select PjlndType = new Select(driver.findElement(By.xpath("//select[@id='PjlndType']")));
		PjlndType.selectByVisibleText("Leased Land");

		Select PjlndregType = new Select(driver.findElement(By.xpath("//select[@id='PjlndregType']")));
		PjlndregType.selectByVisibleText("No");

		driver.findElement(By.xpath("//input[@id='is_notsite']")).click();
		Select PjlndDim = new Select(driver.findElement(By.xpath("//select[@id='PjlndDim']")));
		PjlndDim.selectByVisibleText("Acre");

		driver.findElement(By.xpath("//input[@id='Area']")).sendKeys("100");
		Select pjlndSubAreaUnit = new Select(driver.findElement(By.xpath("//select[@id='pjlndSubAreaUnit']")));
		pjlndSubAreaUnit.selectByVisibleText("Gunta");

		driver.findElement(By.xpath("//input[@id='PjlndSubArea']")).sendKeys("29");
		driver.findElement(By.xpath("//input[@id='PjlndSiteNo']")).sendKeys("3453");
		driver.findElement(By.xpath("//textarea[@id='PjlndAddress']")).sendKeys("PjlndAddress");
		driver.findElement(By.xpath("//textarea[@id='PjlndLandmark']")).sendKeys("PjlndLandmark");
		driver.findElement(By.xpath("//textarea[@id='PjlndConversionDet']")).sendKeys("PjlndConversionDet");

		Select FinanceKsfc = new Select(driver.findElement(By.xpath("//select[@id='FinanceKsfc']")));
		FinanceKsfc.selectByVisibleText("Yes");

		driver.findElement(By.xpath("//input[@id='PjlndCost']")).sendKeys("3453");
		driver.findElement(By.xpath("//textarea[@id='PjlndLandDetails']")).sendKeys("3453");
		driver.findElement(By.xpath("//input[@id='PjlndLocation']")).sendKeys("3453");
		driver.findElement(By.xpath("//input[@id='PjlndSiteNo']")).sendKeys("3453");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		driver.findElement(By.xpath("//textarea[@id='ApptnLandNotes']")).sendKeys("3453");

		WebElement e48 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e48);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Building Details
		WebElement e1018 = driver.findElement(By.xpath("//button[@id='Building-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1018);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[3]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjbdgDets']")).sendKeys("3453");
		Select PjbdgRoof = new Select(driver.findElement(By.xpath("//select[@id='PjbdgRoof']")));
		PjbdgRoof.selectByVisibleText("RCC");
		driver.findElement(By.xpath("//input[@id='PjbdgPlnthO']")).sendKeys("3453");
		driver.findElement(By.xpath("//input[@id='PjbdgUcosto']")).sendKeys("33");

		Select PjbdgDeprMethod = new Select(driver.findElement(By.xpath("//select[@id='PjbdgDeprMethod']")));
		PjbdgDeprMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtImpDepreciationValue']")).sendKeys("33");

		Select SubventionBdg = new Select(driver.findElement(By.xpath("//select[@id='SubventionBdg']")));
		SubventionBdg.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@id='ApbsTotcst']")).sendKeys("3453");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprBldgMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprBldgMethod']")));
		DeprBldgMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtImpBldingDepreciationValue']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='txtImpBldingContingency']")).sendKeys("353");
		driver.findElement(By.xpath("//textarea[@id='ApptnBldgNotes']")).sendKeys("3453");

		WebElement e1200 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1200);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Existing Building Details
		WebElement e1019 = driver.findElement(By.xpath("//button[@id='ExistsBuilding-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1019);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[4]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjebdgDets']")).sendKeys("sdsadsdfsdf");
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='PjebdgRoof']")));
		Select PjebdgRoof = new Select(driver.findElement(By.xpath("//select[@id='PjebdgRoof']")));
		PjebdgRoof.selectByVisibleText("RCC");
		driver.findElement(By.xpath("//input[@id='PjebdgPlnth']")).sendKeys("3453");
		driver.findElement(By.xpath("//input[@id='PjbdgEucosto']")).sendKeys("33");
		driver.findElement(By.xpath("//input[@id='PjebdgTcost']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();

		Select DeprExtbldgMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprExtbldgMethod']")));
		DeprExtbldgMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtDeprExtbldgValue']")).sendKeys("123");
		driver.findElement(By.xpath("//textarea[@id='ApptnExtbldgNotes']")).sendKeys("353");

		WebElement e1020 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[4]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1020);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Indigenous Plant / Machinery Details
		WebElement e1021 = driver.findElement(By.xpath("//button[@id='Indigenous-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1021);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[5]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjplmcDets']")).sendKeys("sdsadsdfsdf");

		driver.findElement(By.xpath("//input[@id='PjplmcSup']")).sendKeys("sdadsfg");
		driver.findElement(By.xpath("//textarea[@id='PjplmcSupadr']")).sendKeys("fghfgfg");
		Select PjplmcReg = new Select(driver.findElement(By.xpath("//select[@id='PjplmcReg']")));
		PjplmcReg.selectByVisibleText("No");
		driver.findElement(By.xpath("//input[@id='PjplmcInvNo']")).sendKeys("234234");
		driver.findElement(By.xpath("//input[@id='PjplmcInvDt']")).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[contains(@class,\"highlight\")]")).click();

		Select PjplmcStat = new Select(driver.findElement(By.xpath("//select[@id='PjplmcStat']")));
		PjplmcStat.selectByVisibleText("Ordering stage");
		driver.findElement(By.xpath("//input[@id='PjplmcDelry']")).sendKeys("123");
		Select PjplmcDeprMethod = new Select(driver.findElement(By.xpath("//select[@id='PjplmcDeprMethod']")));
		PjplmcDeprMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtIndDepreciationValue']")).sendKeys("27");

		driver.findElement(By.xpath("//input[@id='PjplmcQty']")).sendKeys("33");
		driver.findElement(By.xpath("//input[@id='PjplmcCst']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='PjplmcGstper']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='PjplmcTax']")).sendKeys("1");

		Select PjplmcDirectProd = new Select(driver.findElement(By.xpath("//select[@id='PjplmcDirectProd']")));
		PjplmcDirectProd.selectByVisibleText("No");
		Select ddlSubventionEligibility = new Select(
				driver.findElement(By.xpath("//select[@id='ddlSubventionEligibility']")));
		ddlSubventionEligibility.selectByVisibleText("No");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprPlmcMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprPlmcMethod']")));
		DeprPlmcMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtImpplmsDepreciationValue']")).sendKeys("324");
		driver.findElement(By.xpath("//input[@id='txtPlmcContingency']")).sendKeys("324");
		driver.findElement(By.xpath("//textarea[@id='ApptnPlmcNotes']")).sendKeys("324");

		WebElement e1022 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[5]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1022);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Imported Plant / Machinery Details
		WebElement e1023 = driver.findElement(By.xpath("//button[@id='Imported-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1023);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[6]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjimcDets']")).sendKeys("sdsadsdfsdf");

		driver.findElement(By.xpath("//input[@id='PjimcSup']")).sendKeys("sdadsfg");
		driver.findElement(By.xpath("//textarea[@id='PjimcSupadr']")).sendKeys("fghfgfg");
		Select PjimcStat = new Select(driver.findElement(By.xpath("//select[@id='PjimcStat']")));
		PjimcStat.selectByVisibleText("Ordered");
		driver.findElement(By.xpath("//input[@id='PjimcDelry']")).sendKeys("234234");
		Select ddlCType = new Select(driver.findElement(By.xpath("//select[@id='ddlCType']")));
		ddlCType.selectByVisibleText("Euro");
		driver.findElement(By.xpath("//input[@id='txtImpQty']")).sendKeys("43");
		driver.findElement(By.xpath("//input[@id='txtBasicCost']")).sendKeys("55");
		driver.findElement(By.xpath("//input[@id='txtExchangeRate']")).sendKeys("55");
		driver.findElement(By.xpath("//input[@id='PjimcGstper']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='PjimcDutyper']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='PjimcCif']")).sendKeys("5");

		Select PjimcDeprMethod = new Select(driver.findElement(By.xpath("//select[@id='PjimcDeprMethod']")));
		PjimcDeprMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='PjplmcDeprValue']")).sendKeys("43");
		Select PjimcDirectProd = new Select(driver.findElement(By.xpath("//select[@id='PjimcDirectProd']")));
		PjimcDirectProd.selectByVisibleText("No");
		Select ddlSubventionEligibility1 = new Select(
				driver.findElement(By.xpath("//select[@id='ddlSubventionEligibility']")));
		ddlSubventionEligibility1.selectByVisibleText("No");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprImpmcMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprImpmcMethod']")));
		DeprImpmcMethod.selectByVisibleText("WDV (Written down value method)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtImpImpmDepreciationValue']")).sendKeys("324");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtImpContingency']")).sendKeys("324");
		driver.findElement(By.xpath("//textarea[@id='ApptnImpmcNotes']")).sendKeys("324");

		WebElement e1024 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[6]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1024);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Existing Machinery Details
		WebElement e1025 = driver.findElement(By.xpath("//button[@id='ExistingMC-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1025);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[7]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjemcDets']")).sendKeys("sdgdsg");

		driver.findElement(By.xpath("//input[@id='PjemcSup']")).sendKeys("hjkhjkhk");
		driver.findElement(By.xpath("//input[@id='PjemcQty']")).sendKeys("33");
		driver.findElement(By.xpath("//input[@id='PjemcBasicCost']")).sendKeys("3");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprExtmachMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprExtmachMethod']")));
		DeprExtmachMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='txtDeprExtmachValue']")).sendKeys("123");
		driver.findElement(By.xpath("//textarea[@id='ApptnExtmachNotes']")).sendKeys("3453");

		WebElement e31 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[7]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e31);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Furniture and Equipment Details
		WebElement e32 = driver.findElement(By.xpath("//button[@id='Furniture-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e32);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[8]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjfDets']")).sendKeys("sdgdsg");

		driver.findElement(By.xpath("//input[@id='PjfSup']")).sendKeys("hjkhjkhk");
		driver.findElement(By.xpath("//textarea[@id='PjfSupadr']")).sendKeys("33");
		Thread.sleep(2000);
		Select PjfReg = new Select(driver.findElement(By.xpath("//select[@id='PjfReg']")));
		PjfReg.selectByVisibleText("No");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='PjimcGstno']")).sendKeys("29bftpj5157j2za");
		driver.findElement(By.xpath("//input[@id='PjfInvNo']")).sendKeys("324");
		driver.findElement(By.xpath("//input[@id='PjfInvDt']")).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='PjfDelry']")).sendKeys("2");
		Select PjfStat = new Select(driver.findElement(By.xpath("//select[@id='PjfStat']")));
		PjfStat.selectByVisibleText("Ordered");

		driver.findElement(By.xpath("//input[@id='PjfQty']")).sendKeys("22");
		driver.findElement(By.xpath("//input[@id='PjfCst']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='PjfGstno']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='PjfTax']")).sendKeys("2");
		Select PjfDeprMethod = new Select(driver.findElement(By.xpath("//select[@id='PjfDeprMethod']")));
		PjfDeprMethod.selectByVisibleText("WDV (Written down value method)");
		driver.findElement(By.xpath("//input[@id='PjfDeprAmount']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprFurnMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprFurnMethod']")));
		DeprFurnMethod.selectByVisibleText("WDV (Written down value method)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtImpFurnDepreciationValue']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='txtFurnContingency']")).sendKeys("123");
		driver.findElement(By.xpath("//textarea[@id='ApptnFurnNotes']")).sendKeys("3453");

		WebElement e1026 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[8]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1026);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Existing Furniture and Equipment Details
		WebElement e1027 = driver.findElement(By.xpath("//button[@id='ExistingFurn-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1027);

		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[9]")).click();
		driver.findElement(By.xpath("//textarea[@id='PjefDets']")).sendKeys("sdgdsg");

		driver.findElement(By.xpath("//input[@id='PjefSup']")).sendKeys("hjkhjkhk");
		driver.findElement(By.xpath("//input[@id='PjefQty']")).sendKeys("33");
		driver.findElement(By.xpath("//input[@id='PjefQty']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='PjefCst']")).sendKeys("3");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Select DeprExtfurnMethod = new Select(driver.findElement(By.xpath("//select[@id='DeprExtfurnMethod']")));
		DeprExtfurnMethod.selectByVisibleText("WDV (Written down value method)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtDeprExtfurnValue']")).sendKeys("123");
		driver.findElement(By.xpath("//textarea[@id='ApptnExtfurnNotes']")).sendKeys("3453");

		WebElement e1028 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[9]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1028);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Assumption to Profitability
		WebElement e49 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e49);

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[contains(text(),' Assumption to Profitability')]")));

		WebElement e50 = driver.findElement(By.xpath("//a[contains(text(),' Assumption to Profitability')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e50);

		driver.findElement(By.xpath("(//a[contains(text(),'Add')])[1]")).click();
		driver.findElement(By.xpath("//input[@id='salesItem']")).sendKeys("sdgdsg");
		Select ddlUom = new Select(driver.findElement(By.xpath("(//select[@id='ddlUom'])")));
		ddlUom.selectByVisibleText("Kgs");

		driver.findElement(By.xpath("//input[@id='SalesPrice']")).sendKeys("34");

		Select ddlUom1 = new Select(driver.findElement(By.xpath("(//select[@id='ddlUom'])[1]")));
		ddlUom1.selectByVisibleText("Grams");

		driver.findElement(By.xpath("//input[@id='SalesQty']")).sendKeys("33");
		driver.findElement(By.xpath("//input[@id='SalesRej']")).sendKeys("3");

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		WebElement e1029 = driver.findElement(By.xpath("(//input[@value='Save'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1029);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

		WebElement e1030 = driver.findElement(By.xpath("//strong[contains(text(),'Expense Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1030);

		WebElement e1031 = driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1031);

		Select ddlComponent = new Select(driver.findElement(By.xpath("//select[@id='ddlComponent']")));
		ddlComponent.selectByVisibleText("Other Fixed Cost");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtExpValue']")));
		driver.findElement(By.xpath("//input[@id='txtExpValue']")).sendKeys("3000");

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Save'])[2]")));
		WebElement e1032 = driver.findElement(By.xpath("(//input[@value='Save'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1032);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

		WebElement e51 = driver.findElement(By.xpath("//strong[contains(text(),'Other Income and Expenses')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e51);

		WebElement e52 = driver.findElement(By.xpath("(//a[contains(text(),'Add')])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e52);

		Select SalesItem1 = new Select(driver.findElement(By.xpath("//select[@id='SalesItem1']")));
		SalesItem1.selectByVisibleText("OtherIncome");

		Select yearid = new Select(driver.findElement(By.xpath("//select[@id='yearid']")));
		SalesItem1.selectByIndex(3);

		driver.findElement(By.xpath("//input[@id='TotalSales']")).sendKeys("3000");

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		WebElement e150 = driver.findElement(By.xpath("(//input[@value='Save'])[3]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e150);

		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//Profitability
		driver.findElement(By.xpath("//button[@id='Profitability-tab']")).click();
		driver.findElement(By.xpath("//input[@id='txtPeriod']")).sendKeys("14");
		driver.findElement(By.xpath("//input[@id='txtRepayment']")).sendKeys("35");
		driver.findElement(By.xpath("//input[@id='txtRepayHoliday']")).sendKeys("4");

		Select ddlNoOfShift = new Select(driver.findElement(By.xpath("//select[@id='ddlNoOfShift']")));
		ddlNoOfShift.selectByIndex(2);
		Select ddlHoursPerShift = new Select(driver.findElement(By.xpath("//select[@id='ddlHoursPerShift']")));
		ddlHoursPerShift.selectByIndex(2);

		driver.findElement(By.xpath("//input[@id='txtWorkingday']")).sendKeys("288");

		driver.findElement(By.xpath("//input[@id='txtInstalqty']")).sendKeys("22");
		driver.findElement(By.xpath("//input[@id='txtOptimumInstalledCapacity']")).sendKeys("20");

		Select PjimpleOptCapYear = new Select(driver.findElement(By.xpath("//select[@id='PjimpleOptCapYear']")));
		PjimpleOptCapYear.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='txtLoadFact']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@name='ProjectPower.PjpowrTotLoad']")).sendKeys("34");
		driver.findElement(By.xpath("//input[@id='txtPowerFact']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='txtDemandCharge']")).sendKeys("222");

		driver.findElement(By.xpath("//input[@id='txtFuel']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='txtSancProposed']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='txtDgSet']")).sendKeys("123");

		driver.findElement(By.xpath("//input[@id='txtPowerTrariffRate']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='txtNormUtil']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='txtDgRate']")).sendKeys("32");

		driver.findElement(By.xpath("//input[@name='ProjectPower.PjpwrNormal']")).sendKeys("32");
		driver.findElement(By.xpath("//input[@id='txtSancExisting']")).sendKeys("32");
		Thread.sleep(2000);
		WebElement e1033 = driver.findElement(By.xpath("//input[@id='SubmitProfitablilty']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1033);

		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

		WebElement e1034 = driver.findElement(By.xpath("//strong[contains(text(),'Year wise Capacity Utilization')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1034);

		WebElement e1035 = driver.findElement(By.xpath("(//a[contains(text(),'Add')])[4]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1035);

		Select PjcuYear = new Select(driver.findElement(By.xpath("//select[@id='PjcuYear']")));
		PjcuYear.selectByVisibleText("1");

		driver.findElement(By.xpath("//input[@id='salesItem']")).sendKeys("20");
		driver.findElement(By.xpath("(//input[@value='Save'])[6]")).click();
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		WebElement e1036 = driver.findElement(By.xpath("(//input[@value='Save'])[5]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1036);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		Thread.sleep(3000);
		WebElement e1037 = driver.findElement(By.xpath("(//button[@id='Notes-tab'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1037);
		Thread.sleep(2000);
		WebElement e1038 = driver.findElement(By.xpath("//strong[contains(text(),'Assumption to Profitability')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1038);

		driver.findElement(By.xpath("//textarea[@id='PjimpleNotes']")).sendKeys("sdsdfsdf");
		driver.findElement(By.xpath("(//input[@value='Save'])[6]")).click();
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

		// Financial appraisal
		Thread.sleep(2000);
		WebElement e196 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e196);

		driver.findElement(By.xpath("//a[.=' Financial Appraisal']")).click();

		WebElement e47 = driver.findElement(By.xpath("//a[.='Add Project Cost']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e47);
		Thread.sleep(2000);

		Select ddlCostComponent = new Select(driver.findElement(By.xpath("//select[@id='ddlCostComponent']")));
		ddlCostComponent.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='txtcost']")).sendKeys("0.5");

		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		String tpcost = driver.findElement(By.xpath("//input[@id='PjcAmt']")).getAttribute("value");
		String substr = tpcost.substring(0, tpcost.length() - 3);
		System.out.println(substr);
		int b = 2;
		int tpcost1 = Integer.parseInt(substr);
		int debt = tpcost1 / b;
		WebElement e162 = driver.findElement(By.xpath("(//input[@value='Save'])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e162);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalAddress']")).click();

////Means Of Finance Details		

		WebElement e149 = driver.findElement(By.xpath("//strong[.='Means Of Finance Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e149);
		Thread.sleep(2000);
		WebElement e170 = driver.findElement(By.xpath("//a[.='Add Means Of Finance']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e170);
		Thread.sleep(2000);

		Select ddlMfCategory = new Select(driver.findElement(By.xpath("//select[@id='ddlMfCategory']")));
		ddlMfCategory.selectByVisibleText("Debt");
		Thread.sleep(2000);
		Select ddlMfType = new Select(driver.findElement(By.xpath("//select[@id='ddlMfType']")));
		ddlMfType.selectByVisibleText("Term loan from KSFC");
		driver.findElement(By.xpath("//input[@id='txtPjmfAmt']")).sendKeys("" + debt);

		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e163 = driver.findElement(By.xpath("//a[.='Add Means Of Finance']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e163);
		Thread.sleep(2000);
		Thread.sleep(2000);

		Select ddlMfCategory1 = new Select(driver.findElement(By.xpath("//select[@id='ddlMfCategory']")));
		ddlMfCategory1.selectByVisibleText("Equity");
		Thread.sleep(2000);
		Select ddlMfType1 = new Select(driver.findElement(By.xpath("//select[@id='ddlMfType']")));
		ddlMfType1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='txtPjmfAmt']")).sendKeys("" + debt);

		driver.findElement(By.xpath("//button[.='Continue']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='txtPromoter']")));
		driver.findElement(By.xpath("//textarea[@id='txtPromoter']")).sendKeys(" Notes added");

		WebElement e161 = driver.findElement(By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveMeansOfFinance']//input[@value='Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e161);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalAddress']")).click();

//Over All DER Details			 
		WebElement e53 = driver.findElement(By.xpath("//strong[.='Over All DER Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e53);
		Thread.sleep(2000);
		WebElement e54 = driver.findElement(By.xpath("//a[.='Add Over All DER']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e54);
		Thread.sleep(2000);

		Select ddloaderCategory = new Select(driver.findElement(By.xpath("//select[@id='ddloaderCategory']")));
		ddloaderCategory.selectByVisibleText("Equity");
		Thread.sleep(2000);
		Select ddloaderType = new Select(driver.findElement(By.xpath("//select[@id='ddloaderType']")));
		ddloaderType.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='txtoaderPromoter']")).sendKeys("1");

		driver.findElement(By.xpath("//button[.='Continue']")).click();
		WebElement e54a = driver.findElement(By.xpath("//a[.='Add Over All DER']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e54a);
		Thread.sleep(2000);
		Select ddloaderCategory1 = new Select(driver.findElement(By.xpath("//select[@id='ddloaderCategory']")));
		ddloaderCategory1.selectByVisibleText("Debt");
		Thread.sleep(2000);
		Select ddloaderType1 = new Select(driver.findElement(By.xpath("//select[@id='ddloaderType']")));
		ddloaderType1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='txtoaderPromoter']")).sendKeys("1");

		driver.findElement(By.xpath("//button[.='Continue']")).click();

		WebElement e55 = driver.findElement(By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveOverAllDER']//input[@value='Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e55);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalAddress']")).click();

//Credit Rating				

		WebElement e56 = driver.findElement(By.xpath("//strong[.='Credit Rating']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e56);
		Thread.sleep(2000);
		WebElement e57 = driver.findElement(By.xpath("//a[.='Add  Credit Rating']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e57);
		Thread.sleep(2000);

		Select ddlRiskCategory = new Select(driver.findElement(By.xpath("//select[@id='ddlRiskCategory']")));
		ddlRiskCategory.selectByVisibleText("FINANCIAL RISKS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtKey_1']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_3']")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_4']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_5']")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_10']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_11']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtKey_12']")).sendKeys("10");
		Thread.sleep(1000);
//		Select ddl_3 = new Select(driver.findElement(By.xpath("//select[@id='ddl_3']")));
//		ddl_3.selectByVisibleText(">= 30% and < 35%");
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		Select ddl_5 = new Select(driver.findElement(By.xpath("//select[@id='ddl_5']")));
//		ddl_5.selectByVisibleText(">= 100% and < 150%");
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
		Select ddl_6 = new Select(driver.findElement(By.xpath("//select[@id='ddl_6']")));
		ddl_6.selectByVisibleText(">= 1.75");
		Thread.sleep(1000);
		Select ddl_7 = new Select(driver.findElement(By.xpath("//select[@id='ddl_7']")));
		ddl_7.selectByVisibleText(">= 6.00%");
		Thread.sleep(1000);
		Select ddl_8 = new Select(driver.findElement(By.xpath("//select[@id='ddl_8']")));
		ddl_8.selectByVisibleText("< 2.00%");
		Thread.sleep(1000);
		Select ddl_9 = new Select(driver.findElement(By.xpath("//select[@id='ddl_9']")));
		ddl_9.selectByVisibleText("< 7.50% ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();

		WebElement e58 = driver.findElement(By
				.xpath("//form[@action='/Admin/FinancialAppraisal/SaveRiskAnalysis']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e58);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//	Customer Grading			

		WebElement e59 = driver.findElement(By.xpath("//strong[.='Customer Grading']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e59);
		Thread.sleep(2000);
		WebElement e60 = driver.findElement(By.xpath("//a[.='Add Customer Grading']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e60);
		Thread.sleep(2000);

		Select ddlGradType = new Select(driver.findElement(By.xpath("//select[@id='ddlGradType']")));
		ddlGradType.selectByVisibleText("Length of Relationship");

		Select ddlCustGradcrit = new Select(driver.findElement(By.xpath("//select[@id='ddlCustGradcrit']")));
		ddlCustGradcrit.selectByVisibleText(">=10 Years");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		WebElement e61 = driver.findElement(By.xpath(
				"//form[@action='/Admin/FinancialAppraisal/SaveCustomerGrading']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e61);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//Risk Analysis			 
		WebElement e62 = driver.findElement(By.xpath("//strong[.='Risk Analysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e62);
		Thread.sleep(2000);
		WebElement e63 = driver.findElement(By.xpath("//a[.='Add Risk analysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e63);
		Thread.sleep(2000);
		Select ddlCreditRatingType = new Select(driver.findElement(By.xpath("//select[@id='ddlCreditRatingType']")));
		ddlCreditRatingType.selectByVisibleText("FINANCIAL STRENGTH");
		Thread.sleep(1000);
		Select ddlCreditRatingSubType = new Select(
				driver.findElement(By.xpath("//select[@id='ddlCreditRatingSubType']")));
		ddlCreditRatingSubType.selectByVisibleText("Internal Rate of Return");
		Select ddlCreditRatingCriteria = new Select(
				driver.findElement(By.xpath("//select[@id='ddlCreditRatingCriteria']")));
		ddlCreditRatingCriteria.selectByVisibleText("LESS THAN OR EQUIVALENT TO 1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		WebElement e144 = driver.findElement(By
				.xpath("//form[@action='/Admin/FinancialAppraisal/SaveCreditRating']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e144);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//External Rating Details

		WebElement e145 = driver.findElement(By.xpath("//strong[.='External Rating Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e145);
		Thread.sleep(2000);
		WebElement e146 = driver.findElement(By.xpath("//a[.='Add External Rating']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e146);
		Thread.sleep(2000);

		Select ddlExternalAgencies = new Select(driver.findElement(By.xpath("//select[@id='ddlExternalAgencies']")));
		ddlExternalAgencies.selectByVisibleText("ONICRA - SE1A");
		driver.findElement(By.xpath("//input[@id='txtRating']")).sendKeys("50");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(3000);
		WebElement e141 = driver.findElement(
				By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveExtRating']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e141);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		Thread.sleep(2000);
//Loan Proposed 			 
		WebElement e142 = driver.findElement(By.xpath("//strong[.='Loan Proposed']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e142);
		Thread.sleep(2000);
		WebElement e143 = driver.findElement(By.xpath("//a[.='Add Loan Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e143);
		Thread.sleep(2000);

		Select LnTy = new Select(driver.findElement(By.xpath("//select[@id='LnTy']")));
		LnTy.selectByVisibleText("Term loan");
		driver.findElement(By.xpath("//input[@id='LnSanAmt']")).sendKeys("500000");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		WebElement e64 = driver.findElement(
				By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveLoanMast']//input[@id='btn-LoanDetails']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e64);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		Thread.sleep(2000);
//Loan Allocation				
		WebElement e66 = driver.findElement(By.xpath("//strong[.='Loan Allocation']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e66);
		Thread.sleep(2000);
		WebElement e67 = driver.findElement(By.xpath("//a[.='Add Loan Allocation']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e67);
		Thread.sleep(2000);
		Select ddlAllocationcode = new Select(driver.findElement(By.xpath("//select[@id='ddlAllocationcode']")));
		ddlAllocationcode.selectByVisibleText("Towards Land");
		driver.findElement(By.xpath("//input[@id='loanAllocationAmount']")).sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loanallocation']")).click();
		Thread.sleep(1000);
		WebElement e68 = driver.findElement(By
				.xpath("//form[@action='/Admin/FinancialAppraisal/SaveLoanAllocation']//input[@id='btn-Allocation']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e68);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();
		Thread.sleep(2000);
		WebElement e69 = driver.findElement(By.xpath("//strong[.='Repayment Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e69);
		Thread.sleep(2000);
		WebElement e70 = driver.findElement(By.xpath("//a[.='Add Repayment']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e70);
		Thread.sleep(2000);
//
//		Select LnSub = new Select(driver.findElement(By.xpath("//select[@id='LnSub']")));
//		LnSub.selectByIndex(1);

		String LA = driver.findElement(By.xpath("(//input[@id='loanAmount'])[2]")).getAttribute("value");
		String substr1 = LA.substring(0, LA.length() - 2);
		System.out.println(substr1);
		int c = 10;
		int tpcost2 = Integer.parseInt(substr1);
		int PL = tpcost2 / c;
		driver.findElement(By.xpath("//input[@id='Instalments']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='PricipleAmount']")).sendKeys("" + PL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//button[@id='repaymentbutton']")).click();
		Thread.sleep(1000);
		WebElement e71 = driver.findElement(
				By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveRepayment']//input[@id='btn-repay']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e71);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//Working Capital Details			 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[.='Working Capital Details']")));
		WebElement e72 = driver.findElement(By.xpath("//strong[.='Working Capital Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e72);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PreIFSCCode']")).sendKeys("SBIN0040971");

		WebElement e74 = driver.findElement(By.xpath("//button[@id='btnFetchBankDet']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e74);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='txtAwcTel']")).sendKeys("9916307787");
		Select WorkingCapitalMethod = new Select(driver.findElement(By.xpath("//select[@id='WorkingCapitalMethod']")));
		WorkingCapitalMethod.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='txtAwcEstMarg']")).sendKeys("5");
		driver.findElement(By.xpath("(//input[@id='txtAwcEstAmt'])[1]")).sendKeys("6.5");
		driver.findElement(By.xpath("(//input[@id='txtAwcEstAmt'])[2]")).sendKeys("6");
		Select AwcSccp = new Select(driver.findElement(By.xpath("//select[@id='AwcSccp']")));
		AwcSccp.selectByVisibleText("NO");
		Select Awc2ndChg = new Select(driver.findElement(By.xpath("//select[@id='Awc2ndChg']")));
		Awc2ndChg.selectByVisibleText("NO");

		WebElement e73 = driver.findElement(
				By.xpath("//form[@action='/Admin/FinancialAppraisal/SaveWorkingCap']//input[@id='btn-capital']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e73);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//	 Security Details	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[.='Security Details']")));
		WebElement e75 = driver.findElement(By.xpath("//strong[.='Security Details']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e75);
		Thread.sleep(2000);
		WebElement e76 = driver.findElement(By.xpath("//a[.='Add Security']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e76);
		Thread.sleep(2000);

		Select ddlPjsecCd = new Select(driver.findElement(By.xpath("//select[@id='ddlPjsecCd']")));
		ddlPjsecCd.selectByVisibleText("Collateral Security");
		Thread.sleep(2000);
		Select ddlSecDetsCd = new Select(driver.findElement(By.xpath("//select[@id='ddlSecDetsCd']")));
		ddlSecDetsCd.selectByVisibleText("RESIDENTIAL SITE");

		driver.findElement(By.xpath("//textarea[@id='PjsecDets']")).sendKeys("detailed notes");
		driver.findElement(By.xpath("//input[@id='txtScore']")).sendKeys("ashikl");
		Select ddlPjsecRel = new Select(driver.findElement(By.xpath("//select[@id='ddlPjsecRel']")));
		ddlPjsecRel.selectByVisibleText("Father");

		driver.findElement(By.xpath("//input[@id='PjsecAmt']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='upload_SecFile']")).sendKeys(
				uploadpdf);

		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPjsecreqAmt']")).sendKeys("15000000");
		driver.findElement(By.xpath("//input[@id='txtPjsecreqGok']")).sendKeys("15000000");
		driver.findElement(By.xpath("//textarea[@id='AppPjsecReq_PjsecreqNotes']"))
				.sendKeys("notes of Security Details");

		WebElement e77 = driver.findElement(By.xpath(
				"//form[@action='/Admin/FinancialAppraisal/SaveSecurityDetails']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e77);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//Working Capital Estimates 	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[.='Working Capital Estimates ']")));
		WebElement e78 = driver.findElement(By.xpath("//strong[.='Working Capital Estimates ']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e78);
		Thread.sleep(2000);
		WebElement e79 = driver.findElement(By.xpath("//a[.='Add  Working Capital Estimate']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e79);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='PjcpRawmatStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjcpWipStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjcpBillStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjcpWexpStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjcpFgoodStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjcpCreditStock']")).sendKeys("7");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjwcBankborrow']")).sendKeys("5");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='PjwcAddlBankborrow']")).sendKeys("5");
		Thread.sleep(500);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btn-capEstimate']")).click();
		Thread.sleep(2000);
		WebElement e80 = driver.findElement(By.xpath(
				"//form[@action='/Admin/FinancialAppraisal/SaveWorkingCapEstimate']//input[@id='btn-RiskAnalysis']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e80);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='btnHideModalCommon']")).click();

//		Commercial Appraisal		

		// Raw material forecast

		Thread.sleep(2000);
		WebElement e197 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e197);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=' Commercial Appraisal']")).click();
		driver.findElement(By.xpath("(//button[.='Add'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='PjrawName']")).sendKeys("cotton");
		driver.findElement(By.xpath("//input[@id='PjrawTy']")).sendKeys("cotton type");
		driver.findElement(By.xpath("//input[@id='RawCost']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@id='PjrawYy']")).sendKeys("2023");
		driver.findElement(By.xpath("//input[@id='demand_Material']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='supply_Material']")).sendKeys("950");
		driver.findElement(By.xpath("//input[@id='PjrawGrade']")).sendKeys("A12");
		driver.findElement(By.xpath("//input[@id='PjrawSupnam']")).sendKeys("Ashikj");
		driver.findElement(By.xpath("//textarea[@id='PjrawSuploc']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();

		WebElement e = driver.findElement(By.xpath("(//input[@value='Save'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Finished Goods Forecast
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='FinishedGoods-tab']")).click();

		driver.findElement(By.xpath("(//button[.='Add'])[2]")).click();

		driver.findElement(By.xpath("//input[@id='PjfgNam']")).sendKeys("cotton type");
		driver.findElement(By.xpath("//input[@id='ProdCost2']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@id='PjfgYy']")).sendKeys("2023");
		driver.findElement(By.xpath("//input[@id='demand_Goods']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='supply_Goods']")).sendKeys("950");

		driver.findElement(By.xpath("//input[@id='btn_TA_Save']")).click();
		Thread.sleep(2000);
		WebElement ea = driver.findElement(By.xpath("(//input[@value='Save'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ea);
		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		// Market Details And Notes

		driver.findElement(By.xpath("//button[@id='MarketDetails-tab']")).click();

		driver.findElement(By.xpath("//textarea[@id='MrDets']")).sendKeys("Market Details and Notes");
		driver.findElement(By.xpath("//input[@id='upload_MarketDetails']")).sendKeys(
				uploadpdf);
		WebElement eb = driver.findElement(By.xpath("(//input[@value='Save'])[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", eb);
		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

		Thread.sleep(2000);

		// Legal Appraisal

		WebElement e198 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e198);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=' Legal Appraisal']")).click();
		driver.findElement(By.xpath("//button[@id='Overall-tab']")).click();
		Thread.sleep(2000);
		Select PjoverallLegalStat = new Select(driver.findElement(By.xpath("//select[@id='PjoverallLegalStat']")));
		PjoverallLegalStat.selectByValue("2");

		driver.findElement(By.xpath("//textarea[@id='PjoverlegNsheet']")).sendKeys("Market Details and Notes");
		driver.findElement(By.xpath("//textarea[@id='PjoverlegRemarks']")).sendKeys("Market Details and Notes");
		driver.findElement(By.xpath("//input[@id='upload_OverAll']")).sendKeys(
				uploadpdf);
		WebElement ec = driver.findElement(By.xpath("(//input[@value='Save'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ec);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[.='OK'])[2]")));
		driver.findElement(By.xpath("(//button[.='OK'])[2]")).click();

		// Other details

		Thread.sleep(2000);
		WebElement e199 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e199);
		driver.findElement(By.xpath("//a[.=' Other Details']")).click();

		driver.findElement(By.xpath("//Textarea[@id='BankerDets']")).sendKeys("Banker’s Opinion to be Added");

		driver.findElement(By.xpath("//input[@id='btn_TA_Saved']")).click();
		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();
//Conditions				
		driver.findElement(By.xpath("//button[@id='Condition-tab']")).click();
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Select CondtypeId = new Select(driver.findElement(By.xpath("//select[@id='CondtypeId']")));
		CondtypeId.selectByVisibleText("Special");
		Select PjcondStg = new Select(driver.findElement(By.xpath("//select[@id='PjcondStg']")));
		PjcondStg.selectByVisibleText("Prior to First Disbursement");
		driver.findElement(By.xpath("//textarea[@id='PjcondSub']")).sendKeys("Condition Details ");
		driver.findElement(By.xpath("//textarea[@id='PjcondNotes']")).sendKeys("Comments");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='btn_TA_Save'])[2]")).click();
		Thread.sleep(2000);
		WebElement e81 = driver.findElement(By.xpath("(//input[@value='Save'])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e81);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

//Statistical				 
		driver.findElement(By.xpath("//button[@id='Statistical-tab']")).click();

		driver.findElement(By.xpath("//input[@id='PjstatAddPower']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='PjstatSanbep']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='PjstatAvgdser']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='PjstatAddlEmp']")).sendKeys("1");
		driver.findElement(By.xpath("//textarea[@id='PjstatFinProd']")).sendKeys("End Use of Finished Product");
		driver.findElement(By.xpath("//input[@id='PjstatEmp']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='PjstatAddCaptial']")).sendKeys("5");

		driver.findElement(By.xpath("//input[@id='PjstatAuthCaps']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='PjstatEffCap']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='PjstatOverAllder']")).sendKeys("1.5");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_TAB);

		//WebElement e1001 = driver.findElement(By.xpath("//a[.='" + date + "']"));
		
		//js.executeScript("var evt = document.createEvent('MouseEvents');"
			//	+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
			//	+ "arguments[0].dispatchEvent(evt);", e1001);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement e82 = driver.findElement(By.xpath("//input[@id='PjstatAddCaptial']"));

		e82.sendKeys(Keys.TAB);
		/*
		 * WebElement e1000 = driver.findElement(By.xpath("//a[.='" + date + "']"));
		 * js.executeScript("var evt = document.createEvent('MouseEvents');" +
		 * "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
		 * + "arguments[0].dispatchEvent(evt);", e1000);
		 */
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement e84 = driver.findElement(
				By.xpath("//form[@action='/Admin/OtherDetailsAppraisal/AddStatisticalDetails']//input[@value='Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e84);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();

//Maintenance

		Thread.sleep(2000);
		WebElement e189 = driver.findElement(By.xpath("//a[.='Appraisal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e189);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=' Maintenance']")).click();
		driver.findElement(By.xpath("//textarea[@id='Reason']")).sendKeys("Reason :- Release the loan");

		WebElement e85 = driver.findElement(By.xpath("(//input[@id='btn_TA_Savedsrinivas'])"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e85);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='btnHideCommons']")).click();
	}
}
