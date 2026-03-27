package sel_webelementmwthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//clicking on checkbox
		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();
		Thread.sleep(2000);
		//unselecting the checkbox
		cricket.click();
	}

}
