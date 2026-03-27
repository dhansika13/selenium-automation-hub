package webdriverinterogationmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		//fetching the 32 char windowID
		System.out.println(driver.getWindowHandle());
		//refreshing the page
		//driver.navigate().refresh();
		driver.quit();
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		System.out.println(driver.getWindowHandle());
//		Thread.sleep(2000);
//		driver.navigate().to("https://demoapps.qspiders.com/");
//		System.out.println(driver.getWindowHandle());
//		Thread.sleep(2000);
	}

}
