package handlingdroupdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcaseformultiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		WebElement listbox=driver.findElement(By.id("cars"));
		Select sel=new Select(listbox);
	    Thread.sleep(2000);
	    
		System.out.println(sel.isMultiple());
		driver.quit();
	}

}
