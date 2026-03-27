package popupss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//clicking on view more of laptops
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		//switch the tool control to child window to perform action on its web element
		String parantId = driver.getWindowHandle();
		Set<String> allwindowid=driver.getWindowHandles();
		for(String childid:allwindowid) {
			//switching the tool control to the child popup
			driver.switchTo().window(childid);
		}
		//click on add to cart in child window
		WebElement addtocart = driver.findElement(By.tagName("button"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		//click on cart logo
		WebElement cartlogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartlogo.click();
		Thread.sleep(2000);
		//verify if the shopping list is visible
		WebElement shopingcartlist = driver.findElement(By.tagName("h2"));
		if(shopingcartlist.isDisplayed()) {
			System.out.println("test case status: passed");
		}
		else{
			System.out.println("test case status: failed");
		}
		//close the popup
		driver.close();	
	}

}
