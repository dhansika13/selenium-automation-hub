package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyaxes_followingsibiling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/following::a[@data-cy='superOfferCtaText1']")).click();
		//driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/../../..//a[.='BOOK NOW']")).click();
		//driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/following-sibling::div/child::div/child::a[.='BOOK NOW']")).click();
		
	}

}
