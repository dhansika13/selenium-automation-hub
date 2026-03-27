package popupss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuptasktestcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=gh_toi&utm_medium=toi_rev&utm_campaign=gh_toi_Listicle_11&gad_source=1&gad_campaignid=23588906141&gbraid=0AAAAA_JeJTK2P2XirJlkFmAViT9TE1w9L&gclid=CjwKCAiAzZ_NBhAEEiwAMtqKyxIW_A9TIkSmCKV2M-YogrpjHR15-aT7yv91m2QN65lz5wYdwgDucRoCX8wQAvD_BwE");
		Thread.sleep(2000);
		WebElement dress=driver.findElement(By.className("desktop-searchBar"));
		dress.sendKeys("dresses");
		Thread.sleep(2000);
		dress.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("img-responsive")).click();
		//String parantId = driver.getWindowHandle();
		Set<String> allwindowid=driver.getWindowHandles();
		for(String childid:allwindowid) {
			//switching the tool control to the child popup
			driver.switchTo().window(childid);
		}
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		WebElement telenum=driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		if(telenum.isDisplayed()) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		driver.quit();
	}

}
