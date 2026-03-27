package locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class learnclassname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-register")).click();
	}

}
