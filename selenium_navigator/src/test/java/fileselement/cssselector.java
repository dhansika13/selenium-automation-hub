package fileselement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		WebElement uid=driver.findElement(By.xpath("//input[@placeholder='Username']"));
//		uid.click();
		

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://opensource-demo.orangehrmlive.com/");
		        Thread.sleep(3000);
		        WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
		        username.sendKeys("Admin");
		       
		        WebElement password = driver.findElement((By.tagName("input")));
		        password.sendKeys("admin123");

		        System.out.println("Password entered successfully");

		        WebElement loginBtn = driver.findElement(
		                By.xpath("//button[contains(.,'Login')]"));
		        loginBtn.click();

		        Thread.sleep(3000);

		        driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();

		        driver.findElement(By.partialLinkText("Change")).click();

		        String changePwdURL = driver.getCurrentUrl();
		        System.out.println("Change Password URL: " + changePwdURL);

		        driver.navigate().back();
		        Thread.sleep(2000);

		        if (driver.getTitle().contains("OrangeHRM")) {
		            System.out.println("Back Navigation Verified");
		        }

		        // 8. Navigate forward
		        driver.navigate().forward();
		        Thread.sleep(2000);

		        if (driver.getCurrentUrl().contains("password")) {
		            System.out.println("Forward Navigation Verified");
		        }

		        driver.navigate().refresh();
		        System.out.println("Page Refreshed");

		        if (driver.getCurrentUrl().contains("changePassword")) {
		            System.out.println("URL Validation Successful");
		        }

		        driver.quit();
		    
	}

}
