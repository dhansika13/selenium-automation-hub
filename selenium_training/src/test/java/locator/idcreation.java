package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class idcreation {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//typing selenium in search text field.
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("_r_3_")).sendKeys("dhansika");
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		
	}
}
