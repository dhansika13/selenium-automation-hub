package sel_webelementmwthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobottun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//clicking on male radio
		driver.findElement(By.cssSelector("[value=\'Male\']")).click();
	}

}
