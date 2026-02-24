package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resource.Base;


public class Vehicle extends Base {

	public void Vehicleregi(String a) throws InterruptedException {
				
		driver.findElement(By.xpath("//Span[(.='Vehicle')]")).click();	
		driver.findElement(By.xpath("//Span[(.='Vehicle  Creation and  Registration')]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[contains(@class,'choices__placeholder') and text()='Select asset code']")).click();

		String c=a;
		WebElement f = driver.findElement(By.xpath("//span[text()='" + c + "']"));
		
		f.click();
		
		driver.findElement(By.xpath("//input[contains(@id,'goPoWoSoOrderNumber')]")).sendKeys("PO-14524");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Select Order Date')]/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[contains(@class,'flatpickr-day') and contains(@class,'today')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Select vehicle type')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Four Wheeler']")).click();
		Thread.sleep(500);	
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Select vehicle category')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Personal']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[contains(@id,'vehicleName')]")).sendKeys("Mahindra SUV700");

		
		driver.findElement(By.xpath("//div[contains(text(),'Select manufacturer')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Mahindra and Mahindra ']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[contains(text(),'Select model')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Mahindra and Mahindra ']")).click();
		Thread.sleep(500);
		
	}
	
	
}
