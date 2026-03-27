package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathbysurroundings {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/desktops");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Build your own computer']/../..//input[@value='Add to cart']")).click();
	}
}
