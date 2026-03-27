package testcasetask;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigateandgivevalidcredentialstologin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
	
		
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	
		driver.findElement(By.cssSelector("'.oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'"));
	}

}///html/body//div/(2)/div(3)/div/a/picture/img
