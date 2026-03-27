package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdemositeofqspiders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		//"b3wTlE"
		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@placeholder=\'Password\']")).sendKeys("user123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
	
	}

}
