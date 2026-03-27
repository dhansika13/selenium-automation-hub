package handlingdroupdowns;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selectionmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//locating the skills drop down
		WebElement dropdown = driver.findElement(By.id("Skills"));
		//making object of select class
		Select sel = new Select(dropdown);
		//calling select method
//_____________________________________________________________________________________________
//*********************************************************************************************
//_____________________________________________________________________________________________
		//by index//
		sel.selectByIndex(9);
		Thread.sleep(2000);		
		//value attribute//
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		//by using visible Text attribute//
		sel.selectByVisibleText("Engineering");
		Thread.sleep(2000);
		//by using contains visible text to click on js //
		sel.selectByContainsVisibleText("script");
		//fetch the options from the drop down
		List<WebElement> allopt=sel.getOptions();
		   for(WebElement opt:allopt) {
			   System.out.println(opt.getText());
		   }
		
		
	}

}
