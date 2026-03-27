package sel_webelementmwthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetostring {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.close();
	}

}
