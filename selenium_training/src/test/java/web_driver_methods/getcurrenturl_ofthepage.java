package web_driver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getcurrenturl_ofthepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetching the url of the current web page
		System.out.println(driver.getCurrentUrl());
		//navigating to google
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		//fetching the source code of the page
		System.out.println(driver.getPageSource());//you will not get or print any url because it is huge.

		//closing driver controlled window
		driver.close();
		driver.quit();
	}

}
