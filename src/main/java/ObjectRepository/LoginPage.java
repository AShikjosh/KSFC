package ObjectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resource.Base;

public class LoginPage extends Base {
	// Imported global Class
//	Actions actions = new Actions(driver);

	EnquirySubmission D = new EnquirySubmission();
//	WebDriverWait wait = new WebDriverWait(driver,30);
	By Advance = By.xpath("//button[@id='details-button']");

	public WebElement Advance() {
		return driver.findElement(Advance);
	}

	By Advanceconti = By.xpath("//a[@id='proceed-link']");

	public WebElement Advanceconti() {
		return driver.findElement(Advanceconti);
	}

	By Loginas = By.xpath("//a[.='Login']");

	public WebElement Loginas() {
		return driver.findElement(Loginas);
	}

	By Profile = By.xpath("//button[contains(text(),'Profile')]");

	public WebElement Profile() {
		return driver.findElement(Profile);
	}

	By Logout = By.xpath("(//a[contains(text(),'Logout')])[1]");

	public WebElement Logout() {
		return driver.findElement(Logout);
	}

	By EmpId = By.xpath("//input[@id='txtEmpIdAdmin']");

	public WebElement EmpId() {
		return driver.findElement(EmpId);
	}

	By Password = By.xpath("//input[@id='txtPasswordAdmin']");

	public WebElement Password() {
		return driver.findElement(Password);
	}

	By loginbutton = By.xpath("//button[@id='btnSubAdmin']");

	public WebElement loginbutton() {
		return driver.findElement(loginbutton);
	}

	By ForceLogin = By.xpath("//input[@id='btnLoginHere']");

	public WebElement ForceLogin() {
		return driver.findElement(ForceLogin);
	}

	By radioas = By.xpath("//input[@id='item_0_0']");

	public WebElement radioas() {
		return driver.findElement(radioas);
	}

	By continueas = By.xpath("//button[@id='btnContinue']");

	public WebElement continueas() {
		return driver.findElement(continueas);
	}

	By EGmenu = By.xpath("//a[.='EG']");

	public WebElement EGmenu() {
		return driver.findElement(EGmenu);
	}

	By EnquiryAcknowledgement = By.xpath("//a[.='Enquiry Acknowledgement']");

	public WebElement EnquiryAcknowledgement() {
		return driver.findElement(EnquiryAcknowledgement);
	}

	By Acknowledgement = By.xpath("(//button[contains(text(),'Acknowledge')])[1]");

	public WebElement Acknowledgement() {
		return driver.findElement(Acknowledgement);
	}

	By EnqRemakrs = By.xpath("//textarea[@id='EnqRemakrs']");

	public WebElement EnqRemakrs() {
		return driver.findElement(EnqRemakrs);
	}

	By submitEnqRemakrs = By.xpath("//input[@value='Submit']");

	public WebElement submitEnqRemakrs() {
		return driver.findElement(submitEnqRemakrs);
	}

	By EnquiryScrutiny = By.xpath("//a[.='Enquiry Scrutiny']");

	public WebElement EnquiryScrutiny() {
		return driver.findElement(EnquiryScrutiny);
	}

	By search = By.xpath("//input[@type='search']");

	public WebElement search() {
		return driver.findElement(search);
	}

	// Methods
	public String EG(String EGNum, String ksfcuser, String password, String approverofficer, String selectbranch, String pan, String uploadfilejpg, String uploadpdf) throws InterruptedException, AWTException {
		// Click on close and navigate to login page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Loginas().click();
		EmpId().sendKeys(ksfcuser);
		Password().sendKeys(password);
		loginbutton().click();
		Thread.sleep(1000);
		List<WebElement> message = driver.findElements(By.xpath("(//div[@id='divModelAlertAdmin'])[1]"));
		if (message.size() > 0) {

			String message1 = driver.findElement(By.xpath("(//div[@id='divModelAlertAdmin'])[1]")).getText();
			if (message1.contains("session")) {
				ForceLogin().click();
				EmpId().sendKeys(ksfcuser);
				Password().sendKeys(password);
				loginbutton().click();
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Profile')]")));
		driver.findElement(By.xpath("//label[contains(text(),'"+selectbranch+"')]")).click();
		continueas().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='EG']")));

		EGmenu().click();
		
		Thread.sleep(5000);
		EnquiryAcknowledgement().click();

		search().sendKeys(EGNum);
		Acknowledgement().click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Unit')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Yes')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		EnqRemakrs().sendKeys("EnqRemakrs of acknowledge ");
		submitEnqRemakrs().click();
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(EGmenu()));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", EGmenu());
		Thread.sleep(5000);
		EnquiryScrutiny().click();
		search().sendKeys(EGNum);
		driver.findElement(By.xpath("//button[contains(text(),'Start Scrutinize')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='EnqRemakrs']")));
		driver.findElement(By.xpath("//textarea[@id='EnqRemakrs']")).sendKeys("abc");
		submitEnqRemakrs().click();
		Thread.sleep(5000);
		EGmenu().click();

		EnquiryScrutiny().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
		search().sendKeys(EGNum);
		driver.findElement(By.xpath("//input[@id='btnSendForAcceotance']")).click();

		Select District = new Select(driver.findElement(By.xpath("//select[@id='ddl_chair_map']")));
		District.selectByValue(approverofficer);

		driver.findElement(By.xpath("//textarea[@id='ta_sendForAcceptanceRemarks']")).sendKeys("sdfsf");
		driver.findElement(By.xpath("//button[@id='btn_ok']")).click();

		Thread.sleep(5000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[.='Enquiry Acceptance']")).click();
		search().sendKeys(EGNum);
		Thread.sleep(2000);
		Select Accept = new Select(driver.findElement(By.xpath("//select[@class='form-select ddl-acceptance']")));
		Accept.selectByVisibleText("Accept");
		driver.findElement(By.xpath("//textarea[@id='EnqRemakrs']")).sendKeys("abc");
		submitEnqRemakrs().click();
		Thread.sleep(5000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[.='Loan Application Acknowledgement']")).click();
		search().sendKeys(EGNum);

		List<WebElement> message1 = driver.findElements(By.xpath("//input[@value='Acknowledge']"));
		if (message1.size() > 0) {
			driver.findElement(By.xpath("//input[@value='Acknowledge']")).click();
		} else {
			driver.findElement(By.xpath("//input[@value='Edit']")).click();
		}

		driver.findElement(By.xpath("//input[@id='EnqPlace']")).sendKeys("BELLARY");
		Select PurpCd = new Select(driver.findElement(By.xpath("//select[@id='PurpCd']")));
		PurpCd.selectByVisibleText("NEW LOAN");
		Select SchmCd = new Select(driver.findElement(By.xpath("//select[@id='SchmCd']")));
		SchmCd.selectByVisibleText("AMARA SCHEME");
		driver.findElement(By.xpath("//input[@id='EnqRepayPeriod']")).sendKeys("55");
		Select SizeCd = new Select(driver.findElement(By.xpath("//select[@id='SizeCd']")));
		SizeCd.selectByVisibleText("INDUSTRY SECTOR - LARGE ENTERPRISES");

		Select ddlProdCd = new Select(driver.findElement(By.xpath("//select[@id='ddlProdCd']")));

		ddlProdCd.selectByVisibleText(
				"AAC/ACSR CONDUCTORS                                                             ");

		Select NatureOfPremise = new Select(driver.findElement(By.xpath("//select[@id='ddlNatureOfPremise']")));
		NatureOfPremise.selectByVisibleText("Owned");

	//	Select PromotorClass = new Select(driver.findElement(By.xpath("//select[@id='PromotorClass']")));
		//PromotorClass.selectByVisibleText("GENERAL");

		Thread.sleep(2000);
		WebElement e26 = driver.findElement(By.xpath("//button[@id='add_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e26);

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Add Address')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='parent']")).click();
		driver.findElement(By.xpath("//textarea[@id='UniitAddress']")).sendKeys("ABC Address");

		Select ddlDistrict = new Select(driver.findElement(By.xpath("//select[@id='ddlDistrict']")));
		ddlDistrict.selectByVisibleText("BALLARI");

		Select ddlPincodeCd = new Select(driver.findElement(By.xpath("//select[@id='ddlPincodeCd']")));
		ddlPincodeCd.selectByVisibleText("583124");

		driver.findElement(By.xpath("//input[@id='UnitTelNoid']")).sendKeys("8546453345");

		driver.findElement(By.xpath("//input[@id='UnitMobileNo']")).sendKeys("9916307977");
		driver.findElement(By.xpath("//input[@id='UnitEmail']")).sendKeys("As@gmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// Unit Bank details-

		Thread.sleep(2000);
		WebElement e23 = driver.findElement(By.xpath("//button[@id='bank_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e23);

		driver.findElement(By.xpath("//input[@id='EnqIfsc']")).sendKeys("SBIN0005751");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'Search')])[1]")).click();
		driver.findElement(By.xpath("//input[@id='txtBoxNameAsInBankAccount']")).sendKeys("SBI Bank");
		driver.findElement(By.xpath("//input[@id='txtBoxBankAccountNumber']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@id='confirmEnqAccountNumberInput']")).sendKeys("1234567891");

		// Registartion details-

		driver.findElement(By.xpath("//button[@id='bank_accor_btn']")).click();
		Thread.sleep(2000);
		WebElement e25 = driver.findElement(By.xpath("//button[@id='regd_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e25);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Add Registration Details')]")).click();
		Thread.sleep(2000);
		Select Reg = new Select(driver.findElement(By.xpath("//select[@id='ddlRegistrationTypesBDRD']")));
		Reg.selectByVisibleText("CIN");
		driver.findElement(By.xpath("//input[@id='EnqRegno']")).sendKeys("dfsfsdfsdf");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		WebElement e24 = driver.findElement(By.xpath("//input[@id='btnTabUnitDetails']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e24);

		// Promoter and Gurantorr-//

		// Promoter Details
Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Promoter-tab']")).click();

		driver.findElement(By.xpath("//a[.='Add Promoter']")).click();
		driver.findElement(By.xpath("//input[@id='PromoterMaster_PromoterPan']")).sendKeys("BFTPJ5157A");
		driver.findElement(By.xpath("//button[@id='btnpanSearchprom']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PromoterMaster_PromoterPassport']")).sendKeys("ABCD125487");

		Select designation = new Select(driver.findElement(By.xpath("//select[@id='Promotor_Postition_designation']")));
		designation.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='EnqPromShare']")).sendKeys("100");

		Select DomCd = new Select(driver.findElement(By.xpath("//select[@id='DomCd']")));
		DomCd.selectByVisibleText("BORN & DOMICILED IN KARNATAKA");

		driver.findElement(By.xpath("//input[@id='EnqPromExp']")).sendKeys("5");

		Select EnqPromChief = new Select(driver.findElement(By.xpath("//select[@id='EnqPromChief']")));
		EnqPromChief.selectByVisibleText("Yes");

		driver.findElement(By.xpath("//input[@id='EnqPromExpdet']")).sendKeys("Experience Details");
		driver.findElement(By.xpath("//input[@id='upload_promoterPhoto']"))
				.sendKeys(uploadfilejpg);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		// Promoter Bank Details
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.='Add Promoter bank details']"));

		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e);
		Thread.sleep(2000);

		Select PromoterCode = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCode.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='PromIfsc']")).sendKeys("SBIN0040971");
		driver.findElement(By.xpath("//button[@id='btnFetchBankDet']")).click();
		driver.findElement(By.xpath("//input[@id='PrmBankPincode']")).sendKeys("583124");
		driver.findElement(By.xpath("//input[@id='PromAccName']")).sendKeys("SBI");
		driver.findElement(By.xpath("//input[@id='PromBankaccno']")).sendKeys("987654321");

		driver.findElement(By.xpath("//input[@id='confirmpromAccountNumberInput']")).sendKeys("987654321");
		Select PromAcctype = new Select(driver.findElement(By.xpath("//select[@id='PromAcctype']")));
		PromAcctype.selectByVisibleText("Joint Account");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// Add address -
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//a[.='Add Address']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1);
		Thread.sleep(2000);
		Select PromoterCode1 = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCode1.selectByIndex(1);

		driver.findElement(By.xpath("//textarea[@id='PromAddress']")).sendKeys("new promoter Address");

		Select ddlDistrict1 = new Select(driver.findElement(By.xpath("//select[@id='ddlDistrict']")));
		ddlDistrict1.selectByVisibleText("BALLARI");

		Select ddlPincodeCd1 = new Select(driver.findElement(By.xpath("//select[@id='ddlPincodeCd']")));
		ddlPincodeCd1.selectByVisibleText("583124");

		driver.findElement(By.xpath("//input[@id='PromAdrPermanent']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();

		// Add Asset -
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//a[contains(text(),'Add Asset Details')])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e2);
		Thread.sleep(2000);
		Select PromoterCode11 = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCode11.selectByIndex(1);

		Select AssetTypeId = new Select(driver.findElement(By.xpath("//select[@id='AssetTypeId']")));
		AssetTypeId.selectByVisibleText("Movable Asset");

		Select AssetCatId = new Select(driver.findElement(By.xpath("//select[@id='AssetCatId']")));
		AssetCatId.selectByVisibleText("DEPOSITS");

		driver.findElement(By.xpath("//textarea[@id='EnqAssetDesc']")).sendKeys("Address of Asset Details");
		driver.findElement(By.xpath("//input[@id='EnqAssetValue']")).sendKeys("1000000");
		driver.findElement(By.xpath("//input[@class='btn btn-primary promotor-btn' ]")).click();

		// Add Liablity -

		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("(//a[contains(text(),'Add Liability')])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e3);
		Thread.sleep(2000);
		Select PromoterCode2 = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		PromoterCode2.selectByIndex(1);

		driver.findElement(By.xpath("//textarea[@id='EnqLiabDesc']")).sendKeys("Address of EnqAssetDesc");
		driver.findElement(By.xpath("//input[@id='EnqLiabValue']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@class='btn btn-primary promotor-btn' ]")).click();

		// // Guranture details -

		// Guranture details
		Thread.sleep(2000);
		WebElement e11 = driver.findElement(By.xpath("//strong[contains(text(),'Promoter Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e11);
		Thread.sleep(2000);
		WebElement e7 = driver.findElement(By.xpath("//button[@id='gurantoraccordian']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e7);
		Thread.sleep(2000);
		WebElement e9 = driver.findElement(By.xpath("(//a[contains(text(),'Add Guarantor')])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e9);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gurantorpansearch']")).sendKeys("DZMPK1234A");
		driver.findElement(By.xpath("//button[@id='btnpanSearchGuar']")).click();

		Select DomCd1 = new Select(driver.findElement(By.xpath("//select[@id='DomCd']")));
		DomCd1.selectByVisibleText("NON-LOCAL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Submit'])")).click();

		// Guarantor Bank Details
		Thread.sleep(2000);
		WebElement e4 = driver.findElement(By.xpath("//a[@id='Guarantor_addBankClick']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e4);

		Select Gur = new Select(driver.findElement(By.xpath("//select[@id='PromoterCode']")));
		Gur.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='GuarIfsc']")).sendKeys("SBIN0013285");
		driver.findElement(By.xpath("//button[@id='btnFetchGuarBankDet']")).click();
		driver.findElement(By.xpath("//input[@id='GuarBankPincode']")).sendKeys("583124");
		driver.findElement(By.xpath("//input[@id='GuarAccName']")).sendKeys("asdasd");
		driver.findElement(By.xpath("//input[@id='GuarBankaccno']")).sendKeys("123456788");
		driver.findElement(By.xpath("//input[@id='confirmgranAccountNumberInput']")).sendKeys("123456788");
		Select banktype = new Select(driver.findElement(By.xpath("//select[@id='GuarAcctype']")));
		banktype.selectByVisibleText("Joint Account");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// Guarantor Address Details

		Thread.sleep(2000);
		WebElement e5 = driver.findElement(By.xpath("(//a[contains(text(),'Add Address Details')])[1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e5);

		Select GuarnatorCode = new Select(driver.findElement(By.xpath("//select[@id='GuarnatorCode']")));
		GuarnatorCode.selectByIndex(1);

		driver.findElement(By.xpath("//textarea[@id='GuarAddress']")).sendKeys("df");

		Select ddlDistrict2 = new Select(driver.findElement(By.xpath("//select[@id='ddlDistrict']")));
		ddlDistrict2.selectByIndex(1);
		Select ddlPincodeCd2 = new Select(driver.findElement(By.xpath("//select[@id='ddlPincodeCd']")));
		ddlPincodeCd2.selectByVisibleText("587102");

		driver.findElement(By.xpath("//input[@id='GuarAdrPermanent']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();

		// Guarantor Asset Details-
		Thread.sleep(2000);
		WebElement e6 = driver.findElement(By.xpath("(//a[contains(text(),'Add Asset Details')])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e6);

		Select PromoterCode21 = new Select(driver.findElement(By.xpath("(//select[@id='PromoterCode'])")));
		PromoterCode21.selectByIndex(1);

		Select AssetGuaranterTypeId = new Select(driver.findElement(By.xpath("//select[@id='AssetGuaranterTypeId']")));
		AssetGuaranterTypeId.selectByVisibleText("Movable Asset");
		Thread.sleep(2000);
		Select AssetGuaranterCatId = new Select(driver.findElement(By.xpath("//select[@id='AssetGuaranterCatId']")));
		AssetGuaranterCatId.selectByVisibleText("DEPOSITS");

		driver.findElement(By.xpath("//textarea[@id='GuarAssetDesc']")).sendKeys("Address of Guarantor Asset Details");
		driver.findElement(By.xpath("//input[@id='GuaranterAssetValue']")).sendKeys("1000000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// Guarantor Liability Details
		Thread.sleep(2000);
		WebElement e8 = driver.findElement(By.xpath("(//a[contains(text(),'Add Liability')])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e8);

		Select GuarnatorPromoterCode = new Select(driver.findElement(By.xpath("(//select[@id='PromoterCode'])")));
		GuarnatorPromoterCode.selectByIndex(1);
		driver.findElement(By.xpath("//textarea[@id='GuarLiabDesc']")).sendKeys("Guarantor Liability desc");

		driver.findElement(By.xpath("//input[@id='GuarLiabValue']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);

		WebElement e10 = driver.findElement(By.xpath("//button[@id='PAGsaveBTN']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e10);

		// Associate Concern//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Associate-tab']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Add Associate Concern Details')]")).click();
		Select EnqSisPromCode = new Select(driver.findElement(By.xpath("(//select[@id='EnqSisPromCode'])")));
		EnqSisPromCode.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='EnqSisName']")).sendKeys("ABC");

		driver.findElement(By.xpath("//input[@id='EnqSisAddress']")).sendKeys("fsdfsdff");
		driver.findElement(By.xpath("//input[@id='EnqSisDesg']")).sendKeys("sdfsdfsf");
		driver.findElement(By.xpath("//input[@id='EnqSisAssConc']")).sendKeys("sdfsdfsf");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		// Add Associate -
		Thread.sleep(3000);

		WebElement e111 = driver.findElement(By.xpath("//input[@id='has_associate_sisterconcernFY_checked']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e111);

		WebElement e12 = driver.findElement(By.xpath("//button[.='Save Associate Details & Continue']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e12);

		// Project Cost

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Project-tab']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Add Project Cost')]")).click();

		Select GuarnatorPromoterCode1 = new Select(
				driver.findElement(By.xpath("//select[@id='ProjectCostComponent']")));
		GuarnatorPromoterCode1.selectByVisibleText("  Building and Other Civil works");
		driver.findElement(By.xpath("//input[@id='projectcostvalue']")).sendKeys("60000000");
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-pdpc']")).click();

		// Means of Finance

		WebElement e13 = driver.findElement(By.xpath("//strong[contains(text(),'Means of Finance (Rs. In Lakhs)')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e13);
		WebElement e14 = driver.findElement(By.xpath("//a[contains(text(),'Add Means Of Finance')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e14);

		Select ddlfinancecatEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlfinancecatEnq']")));
		ddlfinancecatEnq.selectByVisibleText("Debt");

		Select ddlfinanceTypeEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlfinanceTypeEnq']")));
		ddlfinanceTypeEnq.selectByVisibleText("Other short term borrowings");

		driver.findElement(By.xpath("//input[@id='EnqPjmfValue']")).sendKeys("30000000");
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-pdmf']")).click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement e15 = driver.findElement(By.xpath("//a[contains(text(),'Add Means Of Finance')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e15);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Select ddlfinancecatEnq1 = new Select(driver.findElement(By.xpath("//select[@id='ddlfinancecatEnq']")));
		ddlfinancecatEnq1.selectByVisibleText("Equity");

		Select ddlfinanceTypeEnq2 = new Select(driver.findElement(By.xpath("//select[@id='ddlfinanceTypeEnq']")));
		ddlfinanceTypeEnq2.selectByVisibleText("Addl. Equity share Capital");

		driver.findElement(By.xpath("//input[@id='EnqPjmfValue']")).sendKeys("30000000");
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-pdmf']")).click();

		// Working capital arrangement details

		WebElement e16 = driver
				.findElement(By.xpath("//strong[contains(text(),'Working Capital Arrangement Details')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e16);

		driver.findElement(By.xpath("//input[@id='EnqWcIfsc']")).sendKeys("SBIN0011580");
		Thread.sleep(2000);
		WebElement e1120 = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1120);
		

		driver.findElement(By.xpath("//input[@id='EnqWcAmt']")).sendKeys("60000");

		// Previous2 years Financial Details (in case of Additional Loan) – minimum of
		// past 3 years

		WebElement e17 = driver.findElement(By.xpath(
				"//strong[contains(text(),'Previous2 years Financial Details (in case of Additional Loan) – minimum of past 3 years')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e17);

		Thread.sleep(1000);

		WebElement e20 = driver.findElement(By.xpath("//input[@value='Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e20);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary bootbox-accept']")).click();
		Thread.sleep(1000);

		WebElement e21 = driver.findElement(By.xpath("//button[@id='PDsaveBTN']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e21);
		Thread.sleep(1000);

		// Security -
		WebElement e22 = driver.findElement(By.xpath("//button[@id='Security-tab']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e22);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Add Security Details')]")).click();

		Select secdetailsID = new Select(driver.findElement(By.xpath("//select[@id='secdetailsID']")));
		secdetailsID.selectByVisibleText("Collateral Security");

		Select ddlsecTypeEnq = new Select(driver.findElement(By.xpath("//select[@id='ddlsecTypeEnq']")));
		ddlsecTypeEnq.selectByVisibleText("VACANT SITE");

		driver.findElement(By.xpath("//textarea[@id='EnqSecDesc']")).sendKeys("Description of Security ");
		driver.findElement(By.xpath("//input[@id='EnqSecName']")).sendKeys("joshi");

		Select PromrelCd = new Select(driver.findElement(By.xpath("//select[@id='PromrelCd']")));
		PromrelCd.selectByVisibleText("Father");

		driver.findElement(By.xpath("//input[@id='EnqSecValue']")).sendKeys("410");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-ssds']")).click();
		Thread.sleep(2000);
		// Documents--

		WebElement e18 = driver.findElement(By.xpath("//strong[contains(text(),'Documents')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e18);

		Thread.sleep(2000);
		Select CategoryId = new Select(driver.findElement(By.xpath("//select[@id='CategoryId']")));
		CategoryId.selectByValue("3");
		Thread.sleep(2000);
		Select NameId = new Select(driver.findElement(By.xpath("//select[@id='NameId']")));
		NameId.selectByVisibleText("Income Tax Returns");

		driver.findElement(By.xpath("//input[@id='uploadFile_SecurityDoc']")).sendKeys(uploadpdf);
		driver.findElement(By.xpath("//input[@id='btn_upload']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnHideModal']")).click();

		Thread.sleep(1000);

		WebElement e19 = driver.findElement(By.xpath("//button[@id='SADsaveBTN']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e19); // review and Submit

		driver.findElement(By.xpath("//button[@id='Review-tab']")).click();
		driver.findElement(By.xpath("//input[@id='Confirmation']")).click();
		driver.findElement(By.xpath("//button[@id='btnSubmitCompleteEnquiry']")).click();

		// Send to Scrutiny
		Thread.sleep(1000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[.='Loan Application Acknowledgement']")).click();
		search().sendKeys(EGNum);
		Thread.sleep(1000);
		Select loanScrutiny = new Select(
				driver.findElement(By.xpath("//select[@class='form-select ddl-loanScrutiny']")));
		loanScrutiny.selectByVisibleText("Send For Legal Scrutiny");
		Select map = new Select(driver.findElement(By.xpath("//select[@id='ddl_loanScrutiny_map']")));
		map.selectByValue(approverofficer);
		driver.findElement(By.xpath("//textarea[@id='txtRemarks']")).sendKeys("ssdfsdf");
		driver.findElement(By.xpath("//button[@id='btn_loan_ok']")).click();

		Thread.sleep(2000);
		EGmenu().click();

		driver.findElement(By.xpath("//a[contains(text(),'Legal Scrutiny')]")).click();

		search().sendKeys(EGNum);

		driver.findElement(By.xpath("//input[@value='Legal Opinion']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='OveralllegalOpinion-tab']")).click();
		driver.findElement(By.xpath("//textarea[@id='EnqLegalObservations']")).sendKeys("EnqLegalObservations");

		Select EnqLegalStatus = new Select(driver.findElement(By.xpath("//select[@id='EnqLegalStatus']")));

		EnqLegalStatus.selectByVisibleText("Acceptable");

		Select IsExternalReport = new Select(driver.findElement(By.xpath("//select[@id='IsExternalReport']")));

		IsExternalReport.selectByVisibleText("No");

		driver.findElement(By.xpath("//input[@id='upload_IntReportPath']")).sendKeys(
				uploadpdf);

		driver.findElement(By.xpath("//textarea[@id='EnqLegalRemarks']")).sendKeys("EnqLegalRemarks");
		Thread.sleep(2000);

		WebElement e211 = driver.findElement(By.xpath("//input[@id='btn_overalllegalOp_Save']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e211);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideSucessModal']")).click();

		// send to Loan scrutiny
		Thread.sleep(2000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[.='Loan Application Acknowledgement']")).click();
		Thread.sleep(2000);
		search().sendKeys(EGNum);

		Select loanScrutiny1 = new Select(
				driver.findElement(By.xpath("//select[@class='form-select ddl-loanScrutiny']")));
		loanScrutiny1.selectByVisibleText("Send For Loan Scrutiny");
		Select map1 = new Select(driver.findElement(By.xpath("//select[@id='ddl_loanScrutiny_map']")));
		map1.selectByValue(approverofficer);
		driver.findElement(By.xpath("//textarea[@id='txtRemarks']")).sendKeys("ssdfsdf");
		driver.findElement(By.xpath("//button[@id='btn_loan_ok']")).click();

		// Loan scrutiny
		Thread.sleep(2000);
		EGmenu().click();

		driver.findElement(By.xpath("//a[.='Loan Scrutiny']")).click();
		Thread.sleep(2000);
		search().sendKeys(EGNum);

		driver.findElement(By.xpath("//input[@value='Scrutiny Details']")).click();

		driver.findElement(By.xpath("//textarea[@id='EnqScrObservations']")).sendKeys("Scrutiny Details Observations");

		driver.findElement(By.xpath("//textarea[@id='CommitteeDecision']"))
				.sendKeys("Scrutiny Details Decision of Committee");

		driver.findElement(By.xpath("//input[@id='uploadFile_CommitteeReportPath']")).sendKeys(
				uploadpdf);
Thread.sleep(2000);

   WebElement e21a = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
js.executeScript("var evt = document.createEvent('MouseEvents');"
		+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
		+ "arguments[0].dispatchEvent(evt);", e21a);


		driver.findElement(By.xpath("//button[@id='btnHideSucessModal']")).click();
		
		  WebElement e21b = driver.findElement(By.xpath("//button[@id='btnSendForAcceptance']"));
		  js.executeScript("var evt = document.createEvent('MouseEvents');"
		  		+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
		  		+ "arguments[0].dispatchEvent(evt);", e21b);



		Select EnqLegalStatus1 = new Select(driver.findElement(By.xpath("//select[@id='ChairCode']")));
		EnqLegalStatus1.selectByValue(approverofficer);

		driver.findElement(By.xpath("//textarea[@id='EnqscrScrutinyRemakrs']")).sendKeys("EnqscrScrutinyRemakrs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();

		// Loan Application Acceptance
		Thread.sleep(2000);
		EGmenu().click();

		driver.findElement(By.xpath("//a[.='Loan Application Acceptance']")).click();
		search().sendKeys(EGNum);
		driver.findElement(By.xpath("//input[@value='Scrutiny Details']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("#btnAccept")).click();
		WebElement e22a = driver.findElement(By.xpath("//button[@id='btnAccept']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e22a);
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='EnqscrScrutinyRemakrs']")).sendKeys("EnqscrScrutinyRemakrs");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
		String Appln_no = driver.findElement(By.xpath("//h5[contains(text(),'Eg. No')]")).getText();
		String Appln_no1 = Appln_no.substring(10, 21);
		System.out.println(Appln_no1);

		// Final Acceptance
		Thread.sleep(2000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[contains(text(),'Loan Application Final Acceptance')]")).click();
		search().sendKeys(Appln_no1);

		driver.findElement(By.xpath("//button[contains(text(),'Signed Document')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Upload')]")).click();
		driver.findElement(By.xpath("//input[@id='txtSigngeddoc']")).sendKeys(
				uploadpdf);
		driver.findElement(By.xpath("//button[@id='btnEnqGenerateOtp1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtEnqEntOtp']")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@id='btnEnqValOtp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn_uploadsigndoc_ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnHideSucessModal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Review Loan Application']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnAccept']")).click();

		driver.findElement(By.xpath("//textarea[@id='Remarks']")).sendKeys("Remarks");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
		Loginas().click();
		D.Customer().click();
		D.PAN().sendKeys(pan);
		Thread.sleep(2000);
		D.GenerateOTP().click();
		Thread.sleep(2000);

		List<WebElement> message12 = driver.findElements(By.xpath("//input[@value='Force-Login']"));
		if (message12.size() > 0) {
			String message11 = driver.findElement(By.xpath("//div[@id='divModelAlertCust']")).getText();

			if (message11.contains("A session is already active for")) {
				ForceLogin().click();
			}
		}
		Thread.sleep(2000);
		D.OK().click();
		D.OTP().sendKeys("111111");
		D.VrfOTP().click();
		Thread.sleep(2000);
		D.OK().click();
		D.CustLogin().click();

//Loan Application Fee Deposit List
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='navbarDropdownla']")).click();

		driver.findElement(By.xpath("//a[.='Loan Application Fee Deposit']")).click();
		Thread.sleep(2000);
		search().sendKeys(Appln_no1);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='btn_showWarning']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnContinue']")).click();
		Thread.sleep(1000);
		WebElement e23a = driver.findElement(By.xpath("//button[@id='btn_pay']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e23a);
		
		
		//driver.findElement(By.xpath("//button[@id='btn_pay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		Loginas().click();
		EmpId().sendKeys(ksfcuser);
		Password().sendKeys(password);
		loginbutton().click();
		Thread.sleep(2000);

		List<WebElement> message3 = driver.findElements(By.xpath("//div[@id='divModelAlertAdmin']"));
		if (message3.size() > 0) {

			String message4 = driver.findElement(By.xpath("//div[@id='divModelAlertAdmin']")).getText();
			if (message4.contains("session")) {
				ForceLogin().click();
				EmpId().sendKeys(ksfcuser);
				Password().sendKeys(password);
				loginbutton().click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'"+selectbranch+"')]")).click();
		continueas().click();

		// Create proposal -
		Thread.sleep(1000);
		EGmenu().click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Proposal')]")).click();
		Thread.sleep(1000);
		search().sendKeys(Appln_no1);

		driver.findElement(By.xpath("//input[@value='Create Proposal']")).click();

		Thread.sleep(2000);

		WebElement e221 = driver.findElement(By.xpath("//button[@id='btnSendProposal']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e221);

		Thread.sleep(2000);
		Select ChairCode = new Select(driver.findElement(By.xpath("//select[@id='ChairCode']")));
		ChairCode.selectByValue(approverofficer);
		driver.findElement(By.xpath("//textarea[@id='NoteSheetComments']")).sendKeys("adfasfsdfdf");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		// Initiate proposal -
		Thread.sleep(1000);
		EGmenu().click();
		
		WebElement e221a = driver.findElement(By.xpath("//a[contains(text(),'Initiate Receipt')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e221a);
		//driver.findElement(By.xpath("//a[contains(text(),'Initiate Receipt')]")).click();
		Thread.sleep(1000);
		search().sendKeys(Appln_no1);

		driver.findElement(By.xpath("//input[@value='Generate Receipt']")).click();
		Thread.sleep(2000);

		WebElement e231 = driver.findElement(By.xpath("//button[@id='btnSendapproval']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e231);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ChairCode']")));
		Select ChairCode1 = new Select(driver.findElement(By.xpath("//select[@id='ChairCode']")));
		ChairCode1.selectByValue(approverofficer);
		driver.findElement(By.xpath("//textarea[@id='NoteSheetComments']")).sendKeys("adfasfsdfdf");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		// Approve proposal -
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='EG']")));
		EGmenu().click();
		WebElement e231a = driver.findElement(By.xpath("//a[contains(text(),'Approve Receipt')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e231a);
		//driver.findElement(By.xpath("//a[contains(text(),'Approve Receipt')]")).click();
		search().sendKeys(Appln_no1);

		driver.findElement(By.xpath("//input[@value='View']")).click();

		WebElement e241 = driver.findElement(By.xpath("//button[@id='btnSendapproval']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e241);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='NoteSheetComments']")));
		driver.findElement(By.xpath("//textarea[@id='NoteSheetComments']")).sendKeys("adfasfsdfdf");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		/// Send to Apprisal -
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='EG']")));
		
		EGmenu().click();
		WebElement e27 = driver.findElement(By.xpath("//a[contains(text(),'Send To Appraisal')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e27);

		Thread.sleep(1000);
		search().sendKeys(Appln_no1);

		Select dllSendToAppraisal = new Select(driver.findElement(By.xpath("//select[@id='dllSendToAppraisal']")));
		dllSendToAppraisal.selectByVisibleText("Accept");

		driver.findElement(By.xpath("//textarea[@id='ta_SendToAppraisal']")).sendKeys("adfasfsdfdf");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn_app_sendtoapp']")));
		driver.findElement(By.xpath("//button[@id='btn_app_sendtoapp']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'OK')])[2]")));
		driver.findElement(By.xpath("(//button[contains(text(),'OK')])[2]")).click();

		// Check in Appraisal -
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Appraisal')])[2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Start Appraisal')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Start Appraisal')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='yes-button']")));
		driver.findElement(By.xpath("//button[@id='yes-button']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='search'])[2]")));
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Appln_no1);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='No matching records found']")));
//
//		List<WebElement> message1a = driver.findElements(By.xpath("//td[.='No matching records found']"));
//		if (message1a.size() <= 0) {
//			System.out.println(Appln_no1 + " sent to Appraisal successfully");
//
//		} else {
//			System.out.println(Appln_no1 + " 'ERROR' has not sent to Appraisal");
//		}

		return EGNum;
	}
}