package testquestiens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testweeklyass2qp1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("invalid");
		driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("invalid");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();


		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.xpath("//ul[@id = 'admin_Employees']/child::li/child::a")).click();
		driver.findElement(By.id("tabEmployeeSkill")).click();
		driver.findElement(By.xpath("(//div[@class = 'ant-space-item']/child::button)[4]")).click();
		
//		driver.findElement(By.id("rc_select_0")).sendKeys("emp1");
//		driver.findElement(By.id("rc_select_1")).sendKeys("developer");
//		driver.findElement(By.id("//span[.='Save']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label=\'Close\']")).click();
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
		driver.quit();		
	}

}
