package sel_webelementmwthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskusingnavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("gLFyf")).sendKeys("Atomation");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tools");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}

}
