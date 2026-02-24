package ObjectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resource.Base;

public class Vendor_Registration extends Base {

	
	public void VendorRegi( String uploadpdf) throws AWTException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//Span[(.='Vendor ')]")).click();	
		driver.findElement(By.xpath("//Span[(.='Vendor Registration')]")).click();
		
		int num = (int)(Math.random() * 1000);
		driver.findElement(By.xpath("//input[contains(@id,'vendorId')]")).sendKeys("Vendor ID " +num);

		driver.findElement(By.xpath("//input[contains(@id,'vendorName')]")).sendKeys("Vendor Name ");
		
		By vendorType = By.xpath("//div[contains(text(),'Select vendor type')]");

		wait.until(ExpectedConditions.elementToBeClickable(vendorType)).click();

		
		driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice')]//span[text()='Material Supplier']")).click();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Select vendor category')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice')]//span[text()='Distributor']"))
	      .click();
		
		driver.findElement(By.xpath("//input[contains(@id,'contactPerson')]")).sendKeys("Ashik");
		
		driver.findElement(By.xpath("//input[contains(@id,'phoneNumber')]")).sendKeys("9916307977");
		
		driver.findElement(By.xpath("//input[contains(@id,'emailAddress')]")).sendKeys("Ashik@gmail.com");
		
		driver.findElement(By.xpath("//textarea[contains(@id,'address1')]")).sendKeys("Csg Yeshwantapura - 560020");
		
		
		// Statutory Details
		
		driver.findElement(By.xpath("//input[contains(@id,'panNumber')]")).sendKeys("BFTPJ"+num+"7J");
		
		driver.findElement(By.xpath("//input[contains(@id,'gstin')]")).sendKeys("29BFTPJ"+num+"7J1ZA");
		
		driver.findElement(By.xpath("//input[contains(@id,'registrationNumber')]")).sendKeys("REG44655454");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'registration date')]/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[contains(@class,'flatpickr-day') and contains(@class,'today')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'isoCertificationDetails')]")).sendKeys("ISO 44655454");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Select validity period')]/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[contains(@class,'flatpickr-day') and contains(@class,'today')]")).click();
		
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys(uploadpdf);
		
	
		WebElement e24 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e24);
		//driver.findElement( By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a")).sendKeys(uploadpdf);

		WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));fileInput.sendKeys(uploadpdf);
		Robot rb = new Robot();
		
		Thread.sleep((1000));
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);

		
		//driver.findElement(By.xpath("//input[@name='data[complianceStatus]']")).click();
		
		
		WebElement e21 = driver.findElement(By.xpath("//input[@name='data[complianceStatus]']"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e21);
		
		

		//Financial Details
		
		driver.findElement(By.xpath("//a[contains(text(),'Financial Details')]")).click();
	
		driver.findElement(By.xpath("//input[contains(@id,'bankName')]")).sendKeys("SBI");
		
		driver.findElement(By.xpath("//input[contains(@id,'branchName')]")).sendKeys("Rajajinagar");
		
		driver.findElement(By.xpath("//input[contains(@id,'accountHolderName')]")).sendKeys("ASHIKJOSHI");

		driver.findElement(By.xpath("//input[contains(@id,'accountNumber')]")).sendKeys("8777978645"+num);
		
		driver.findElement(By.xpath("//input[contains(@id,'ifsc')]")).sendKeys("SBIN000"+num);
		
		driver.findElement(By.xpath("//input[contains(@id,'paymentTerms')]")).sendKeys("Payment Terms");
		
		driver.findElement(By.xpath("//input[contains(@id,'creditLimit')]")).sendKeys("25000");
		
		driver.findElement(By.xpath("//input[contains(@id,'tdsCategory')]")).sendKeys("134J");
		
		driver.findElement(By.xpath("//textarea[contains(@id,'remarks1')]")).sendKeys("remarks of the financial details");
		
//		WebElement browse = driver.findElement(By.xpath("//label[contains(text(),'FD Document Upload')]/following::a[@ref='fileBrowse'][1]"));
//		browse.click();
		
		
		WebElement e22 = driver.findElement(By.xpath("//label[contains(text(),'FD Document Upload')]/following::a[@ref='fileBrowse'][1]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e22);

		WebElement fileInput1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));
		fileInput1.sendKeys(uploadpdf);
		
		
		Thread.sleep((2000));

		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);


//		
		WebElement e23 = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e23);
		Thread.sleep((2000));

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();





		
		
		
		
		
		

}}
