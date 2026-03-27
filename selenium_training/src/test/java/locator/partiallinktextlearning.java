package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class partiallinktextlearning {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Com")).click();
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	}

}
