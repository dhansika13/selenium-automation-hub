package locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
public class tagnamelearn {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//locating all the links in the page
		List<WebElement> allLink=driver.findElements(By.tagName("a"));
		//fetch the name of the each link
		for(WebElement link:allLink) {
			System.out.println(link.getText());
		}
		for(WebElement link:allLink) {
//			if(link.getText().equals("Store")) {
//				link.click();
//			    break;
//			}
			if(link.getText().contains("Store")) {
				link.click();
			    break;
			}
		}
		
		
	}

}
