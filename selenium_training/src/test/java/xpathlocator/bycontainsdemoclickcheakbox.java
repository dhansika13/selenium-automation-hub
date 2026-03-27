package xpathlocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class bycontainsdemoclickcheakbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[contains(@class,'ico-cart')]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Shopping cart')]")).click();
	}

}
