package testquestiens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class weeklytestass2qp2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.xpath("//ul[@id = 'admin_Employees']/child::li/child::a")).click();
		
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
	}

}
