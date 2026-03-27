package sel_webelementmwthods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetourl {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//navigate to flipkart
		URL url=new URL("https://www.facebook.com/flipkart/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		//navigate to uber eats
		driver.navigate().to(new URL("https://www.ubereats.com/in?srsltid=AfmBOoq-ASG7YP5ld2snqPhQw-4tkxUlX8YIqeZ2y1S1UtRzsk3_1T8G"));
		
	}

}
