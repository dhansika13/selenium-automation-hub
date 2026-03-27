package javaScriptExrctoruses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiononhiddenelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php/");
		//select your gender
		driver.findElement(By.cssSelector("[id='_R_mad6p4jikacppb6amH2_']")).click();
		Thread.sleep(2000);
		//custom
		driver.findElement(By.xpath("//div[contains(@id,'_R_mad6p4jikacppb6am___2')]")).click();
		WebElement hiddenele=driver.findElement(By.xpath("//input[contains(@id,'_r_q_')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sceret'",hiddenele);
	}

}
