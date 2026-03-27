package handlingdroupdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		//locating the list box
		WebElement listbox=driver.findElement(By.id("cars"));
		//select class object
		Select sel= new Select(listbox);
		//select few options
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		//verifying all the above options are selected or not
		List<WebElement> allselectedopts=sel.getAllSelectedOptions();
		  for(WebElement allopt:allselectedopts) {
			  System.out.println(allopt.getText());
		  }
		  driver.quit();
	}

}
