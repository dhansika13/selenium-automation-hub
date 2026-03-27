package web_driver_methods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class learng_quit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//clicking on FB in the follow us section
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		//clicking on twitter in the follow us section
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
	}

}
