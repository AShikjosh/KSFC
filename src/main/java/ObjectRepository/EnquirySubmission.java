package ObjectRepository;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resource.Base;

public class EnquirySubmission extends Base {

	By Customer = By.xpath("//button[@id='pills-customer-tab']");

	public WebElement Customer() {
		return driver.findElement(Customer);
	}

	By PAN = By.xpath("//input[@id='txtPanLogin']");

	public WebElement PAN() {
		return driver.findElement(PAN);
	}

	By GenerateOTP = By.xpath("//button[@id='btnGenOtpForPanLogin']");

	public WebElement GenerateOTP() {
		return driver.findElement(GenerateOTP);
	}

	By OK = By.xpath("//button[@id='btnHideModalCust']");

	public WebElement OK() {
		return driver.findElement(OK);
	}

	By OTP = By.xpath("//input[@id='txtEnterOtpLogin']");

	public WebElement OTP() {
		return driver.findElement(OTP);
	}

	By VrfOTP = By.xpath("//button[@id='btnVerOtpLogin']");

	public WebElement VrfOTP() {
		return driver.findElement(VrfOTP);
	}

	By CustLogin = By.xpath("//button[@id='btnSubLogin']");

	public WebElement CustLogin() {
		return driver.findElement(CustLogin);
	}

	By enquriynav = By.xpath("//a[.='Enquiry']");

	public WebElement enquriynav() {
		return driver.findElement(enquriynav);
	}

	By newenquriynav = By.xpath("//input[@value='New Enquiry']");

	public WebElement newenquriynav() {
		return driver.findElement(newenquriynav);
	}

	By UnitName = By.xpath("//textarea[@id='UnitName']");

	public WebElement UnitName() {
		return driver.findElement(UnitName);
	}

	By UnitGstnumber = By.xpath("//input[@id='UnitGstnumber']");

	public WebElement UnitGstnumber() {
		return driver.findElement(UnitGstnumber);
	}

	By uploadFile_gstnumber = By.xpath("//input[@id='uploadFile_gstnumber']");

	public WebElement uploadFile_gstnumber() {
		return driver.findElement(uploadFile_gstnumber);
	}

	By UnitAddresss = By.xpath("//textarea[@id='UnitAddresss']");

	public WebElement UnitAddresss() {
		return driver.findElement(UnitAddresss);
	}

	By UnitDistrictId = By.xpath("//select[@id='UnitDistrictId']");

	public WebElement UnitDistrictId() {
		return driver.findElement(UnitDistrictId);
	}

	By UnitTalukaId = By.xpath("//select[@id='UnitTalukaId']");

	public WebElement UnitTalukaId() {
		return driver.findElement(UnitTalukaId);
	}

	By UnitHobliId = By.xpath("//select[@id='UnitHobliId']");

	public WebElement UnitHobliId() {
		return driver.findElement(UnitHobliId);
	}

	By UnitVillageId = By.xpath("//select[@id='UnitVillageId']");

	public WebElement UnitVillageId() {
		return driver.findElement(UnitVillageId);
	}

	By UnitPinCodeId = By.xpath("//select[@id='UnitPinCodeId']");

	public WebElement UnitPinCodeId() {
		return driver.findElement(UnitPinCodeId);
	}

	// Loan Details

	By Loan_accor_btn = By.xpath("//button[@id='Loan_accor_btn']");

	public WebElement Loan_accor_btn() {
		return driver.findElement(Loan_accor_btn);
	}

	By EnqLoanamt = By.xpath("//input[@id='EnqLoanamt']");

	public WebElement EnqLoanamt() {
		return driver.findElement(EnqLoanamt);
	}

	By KSFC_Branch = By.xpath("//select[@id='OffcCd']");

	public WebElement KSFC_Branch() {
		return driver.findElement(KSFC_Branch);
	}

	// Product Details

	By Product_Details = By.xpath("//button[@id='Product_accor_btn']");

	public WebElement Product_Details() {
		return driver.findElement(Product_Details);
	}

	By ProdName = By.xpath("//input[@id='ProdName']");

	public WebElement ProdName() {
		return driver.findElement(ProdName);
	}

	// Contact Details

	By Contact_Details = By.xpath("//button[@id='Contact_accor_btn']");

	public WebElement Contact_Details() {
		return driver.findElement(Contact_Details);
	}

	By EnqApplName = By.xpath("//textarea[@id='EnqApplName']");

	public WebElement EnqApplName() {
		return driver.findElement(EnqApplName);
	}

	By EnqEmail = By.xpath("//input[@id='EnqEmail']");

	public WebElement EnqEmail() {
		return driver.findElement(EnqEmail);
	}

	By EnqAddress = By.xpath("//textarea[@id='EnqAddress']");

	public WebElement EnqAddress() {
		return driver.findElement(EnqAddress);
	}

	By UserDistrictId = By.xpath("//select[@id='UserDistrictId']");

	public WebElement UserDistrictId() {
		return driver.findElement(UserDistrictId);
	}

	By UserPinCodeId = By.xpath("//select[@id='UserPinCodeId']");

	public WebElement UserPinCodeId() {
		return driver.findElement(UserPinCodeId);
	}

	// OTP Verication

	By SubmissionNote = By.xpath("//textarea[@id='SubmissionNote']");

	public WebElement SubmissionNote() {
		return driver.findElement(SubmissionNote);
	}

	By btnEnqGenerateOtp = By.xpath("//button[@id='btnEnqGenerateOtp']");

	public WebElement btnEnqGenerateOtp() {
		return driver.findElement(btnEnqGenerateOtp);
	}

	By OKBUTTON = By.xpath("//button[@id='btnHideModal']");

	public WebElement OKBUTTON() {
		return driver.findElement(OKBUTTON);
	}

	By Otp_accor_btn = By.xpath("//button[@id='Otp_accor_btn']");

	public WebElement Otp_accor_btn() {
		return driver.findElement(Otp_accor_btn);
	}

	By txtEnqEntOtp = By.xpath("//input[@id='txtEnqEntOtp']");

	public WebElement txtEnqEntOtp() {
		return driver.findElement(txtEnqEntOtp);
	}

	By btnEnqValOtp = By.xpath("//button[@id='btnEnqValOtp']");

	public WebElement btnEnqValOtp() {
		return driver.findElement(btnEnqValOtp);
	}

	// button[@id='Otp_accor_btn']
	// Submit
	By btnTabUnitDetails = By.xpath("//input[@id='btnTabUnitDetails']");

	public WebElement btnTabUnitDetails() {
		return driver.findElement(btnTabUnitDetails);
	}

	By divEnquirySuccessPopup = By.xpath("//div[@id='divEnquirySuccessPopup']");

	public WebElement divEnquirySuccessPopup() {
		return driver.findElement(divEnquirySuccessPopup);
	}

	By OKsubmit = By.xpath("//button[@id='btnHideSucessModal']");

	public WebElement OKsubmit() {
		return driver.findElement(OKsubmit);
	}

	// method
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

	By ForceLogin = By.xpath("//input[@id='btnLoginHere']");

	public WebElement ForceLogin() {
		return driver.findElement(ForceLogin);
	}

	By Profile = By.xpath("//button[contains(text(),'Profile')]");

	public WebElement Profile() {
		return driver.findElement(Profile);
	}

	By Logout = By.xpath("(//a[contains(text(),'Logout')])[1]");

	public WebElement Logout() {
		return driver.findElement(Logout);
	}

	public String NewEnquiry(String pan, String branch, String uploadpdf, String GST) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Advance().click();
		Advanceconti().click();
		Loginas().click();
		Customer().click();
		PAN().sendKeys(pan);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnGenOtpForPanLogin']")));
		GenerateOTP().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divModelAlertCust']")));
		String message = driver.findElement(By.xpath("//div[@id='divModelAlertCust']")).getText();

		if (message.contains("A session is already active for")) {
			ForceLogin().click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnHideModalCust']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnHideModalCust']")));
		Thread.sleep(1000);
		OK().click();
		OTP().sendKeys("111111");
		VrfOTP().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnHideModalCust']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnHideModalCust']")));
		Thread.sleep(1000);
		OK().click();
		CustLogin().click();
		enquriynav().click();
		newenquriynav().click();

		// random String Start
		String SALTCHARS = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		System.out.println(saltStr);

		// random String End

		UnitName().sendKeys("ksfc-" + saltStr);
		UnitGstnumber().sendKeys(GST);
		uploadFile_gstnumber().sendKeys(
				uploadpdf);
		UnitAddresss().sendKeys(saltStr);

		Select District = new Select(UnitDistrictId());
		District.selectByValue("3");

		Select Taluka = new Select(UnitTalukaId());
		Taluka.selectByValue("186");

		Select Hobli = new Select(UnitHobliId());
		Hobli.selectByValue("593");

		Select Village = new Select(UnitVillageId());
		Village.selectByValue("25011");

		Select PinCode = new Select(UnitPinCodeId());
		PinCode.selectByValue("583124");

		// Loan Details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='Loan_accor_btn']")));
		WebElement e1 = driver.findElement(By.xpath("//button[@id='Loan_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1);

		EnqLoanamt().sendKeys("400");

		Select Branch = new Select(KSFC_Branch());
		Branch.selectByVisibleText(branch);

		// Product_Details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='Product_accor_btn']")));
		Product_Details().click();
		ProdName().sendKeys("ksfc Product name");

		// Contact Details
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Contact_accor_btn']")));
		Contact_Details().click();

		EnqApplName().sendKeys("Ksfc Applicant name");
		EnqEmail().sendKeys("sdfsd@asd.sdd");
		EnqAddress().sendKeys("ksfc EG address");

		Select UserDistrict = new Select(UserDistrictId());
		UserDistrict.selectByValue("251");

		Select UserPinCode = new Select(UserPinCodeId());
		UserPinCode.selectByValue("583124");

		// OTP Verication

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Otp_accor_btn']")));
		WebElement e2 = driver.findElement(By.xpath("//button[@id='Otp_accor_btn']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e2);

		SubmissionNote().sendKeys("ksfc-10-1");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnEnqGenerateOtp']")));
		btnEnqGenerateOtp().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnHideModal']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnHideModal']")));
		OKBUTTON().click();
		txtEnqEntOtp().sendKeys("111111");
		btnEnqValOtp().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnHideModal']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnHideModal']")));
		OKBUTTON().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnTabUnitDetails']")));
		btnTabUnitDetails().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='divEnquirySuccessPopup']")));
		String a = divEnquirySuccessPopup().getText();
		String Enquiry_No = a.replace("\r\n", " ");
		String EnquiryNo1 = Enquiry_No.substring(54, 65);
		System.out.println(EnquiryNo1);

		OKsubmit().click();

		Profile().click();
		Logout().click();
		return EnquiryNo1;
	}

}
