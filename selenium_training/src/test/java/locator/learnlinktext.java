package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class learnlinktext {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://demowebshop.tricentis.com/login");
//		Thread.sleep(2000);
//		
//		//locate FB link
//		driver.findElement(By.linkText("YouTube")).click();
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//locate FB link
		driver.findElement(By.linkText("Images")).click();
	}
}