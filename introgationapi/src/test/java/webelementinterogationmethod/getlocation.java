package webelementinterogationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//locate the search text field
		WebElement search=driver.findElement(By.name("q"));
		//fetching the location
		Point loc=search.getLocation();
		System.out.println(loc);
		//fetch y offset
		System.out.println(loc.getY());
        System.out.println(loc.y);
        driver.quit();
	}

}
