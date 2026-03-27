package xpathlocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class STSRTSWITHxpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();
		
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//input[starts-with(@id,'g')]")).sendKeys("Toys",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[starts-with(text(),'Toys')]")).click();
	}

}
