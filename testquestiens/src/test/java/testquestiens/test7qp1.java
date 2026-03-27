package testquestiens;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7qp1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		Thread.sleep(9000);		
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(3000);
		
		
		Set<String> allWindows = driver.getWindowHandles();
		 for(String window : allWindows)
	        {
	            if(!window.equals(parentWindow))
	            {
	                driver.switchTo().window(window);
	                String url = driver.getCurrentUrl();
	                if(url.contains("orangehrm.com"))
	                {
	                    System.out.println("validated url");
	                }
	                String title = driver.getTitle();
	                if(!title.isEmpty())
	                {
	                    System.out.println("validated title");
	                }
	             
	                driver.close();
	            }}
		 driver.switchTo().window(parentWindow);

	        boolean loginDisplayed = driver.findElement(By.name("username")).isDisplayed();
	        if(loginDisplayed)
	        {
	            System.out.println("Login page is displayed");
	        }
	        driver.quit();
	}
}



       
