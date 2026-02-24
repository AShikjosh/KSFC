package ObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Resource.Base;

public class DIALOG_LOGIN extends Base {


//	By Loginas = By.xpath("//input[@id='ecgv3a-username']");
//
//	public WebElement Loginas() {
//		return driver.findElement(Loginas);
//	}

	public void Login() {
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Dialog-joshi");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("csg@2025");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//*[@id=\"drop1\"]/div/div/img")).click();
		
		// Project Selection
		
		Select PRJT = new Select(driver.findElement(By.xpath("//select[@class='profile-select']")));
		PRJT.selectByVisibleText("Asset-Management");
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
