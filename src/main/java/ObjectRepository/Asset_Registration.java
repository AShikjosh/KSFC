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

public class Asset_Registration extends Base {

	public String Asset_regi(String uploadpdf) throws AWTException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		driver.findElement(By.xpath("//Span[(.='Asset Creation')]")).click();	
		driver.findElement(By.xpath("//Span[(.='Asset Creation and Registration')]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'financialYear')]")).sendKeys("2024-2025");
		
		int num = (int)(Math.random() * 10000);
		String s = String.valueOf(num);	
		
		driver.findElement(By.xpath("//input[contains(@id,'goPoWoSoOrderNumber')]")).sendKeys(s);
		
		WebElement e24 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/a"));
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
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Select order date')]/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[contains(@class,'flatpickr-day') and contains(@class,'today')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Select asset type')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice')]//span[text()='Non Fixed Assets']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Select asset category')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(@class,'choices__item') and text()='Movable']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Asset Sub Category')]")).click();
		Thread.sleep(500);
		
	//	driver.findElement(By.xpath("//input[@aria-label='Select sub category name']")).sendKeys("Godow");
		Thread.sleep(500);
//					rb.keyPress(KeyEvent.VK_BACK_SPACE);
//			rb.keyPress(KeyEvent.VK_BACK_SPACE);
			
			//		
		
	driver.findElement(By.xpath("//div[contains(@class,'choices__item') and text()='Manhole']")).click();
		Thread.sleep(500);
		
		
		
		//Manhole
		
		driver.findElement(By.xpath("//input[contains(@id,'assetIdCode6')]")).sendKeys(" Godown ID/Asset Code" +s);
		
		driver.findElement(By.xpath("//input[contains(@id,'reservoirNameLocation1')]")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//input[contains(@id,'typeOfManhole')]")).sendKeys(" Steel Manhole");
		driver.findElement(By.xpath("//input[contains(@id,'depthOfManhole')]")).sendKeys(s +" Feet");
		
		driver.findElement(By.xpath("//input[contains(@id,'sizeDimensions')]")).sendKeys(s +" inchs");
		
		driver.findElement(By.xpath("//input[contains(@id,'coverType')]")).sendKeys(" Steel");
		
		driver.findElement(By.xpath("//input[contains(@id,'coverCondition')]")).sendKeys(" Good");
		
		driver.findElement(By.xpath("//input[contains(@id,'internalCondition')]")).sendKeys(" New one");
		
		
		// add date 
		
		driver.findElement(By.xpath("//input[contains(@id,'connectedPipelineSizeDiameter')]")).sendKeys( s+" MM");
		
		driver.findElement(By.xpath("//input[contains(@id,'materialOfConstruction')]")).sendKeys( " Steel");
	
		WebElement e2 = driver.findElement(By.xpath("//div[contains(text(),'Select usage type')]"));
	js.executeScript("var evt = document.createEvent('MouseEvents');"
			+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e2);

		//driver.findElement(By.xpath("//div[contains(text(),'Select usage type')]")).click();
		
//		WebElement e21 = driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice')]//span[text()='Drinking']"));
//		js.executeScript("var evt = document.createEvent('MouseEvents');"
//				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
//				+ "arguments[0].dispatchEvent(evt);", e21);
		Thread.sleep(1000);
																								
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice')]//span[text()='Drinking']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Select current condition')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(@class,'choices__item--choice') and text()='New']")).click();
		Thread.sleep(500);
		
		
		// Maintenance Details
		
		
		driver.findElement(By.xpath("//input[contains(@id,'inspectionHistory')]")).sendKeys("Inspection History"+s);
		
		driver.findElement(By.xpath("//input[contains(@id,'maintenanceHistory1')]")).sendKeys("Maintenance History"+s);
		
		
		// add date 	
		
		driver.findElement(By.xpath("//input[contains(@id,'responsibleDepartmentOfficer1')]")).sendKeys("Responsible Department / Officer "+s);
		
		driver.findElement(By.xpath("//input[contains(@id,'geotagGpsCoordinates1')]")).sendKeys("5656532656:3636587");
		
		driver.findElement(By.xpath("//textarea[contains(@id,'remarksNotes1')]")).sendKeys("Remarks / Notes");
		
		// upload photo
		WebElement a = driver.findElement(By.xpath("//input[contains(@id,'assetcode')]"));
		String b=a.getAttribute("Value");
		System.out.println(b);
		
		WebElement e1 = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", e1);
		

//		js.executeScript("window.scrollBy(0,300)");
//		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	
		return b;

	}
}
