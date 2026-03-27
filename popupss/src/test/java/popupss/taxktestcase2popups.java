package popupss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class taxktestcase2popups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='Search']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[value='Search']")).click();
		Thread.sleep(2000);
	}

}
