package handlingdroupdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectionmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
	    Select sel=new Select(driver.findElement(By.id("select-multiple-native")));
	    List<WebElement> allopt=sel.getOptions();
	      for(WebElement opt:allopt) {
	    	  System.out.println(opt.getText());
	      }
	    sel.selectByVisibleText("John Hardy Women's L...");
	    sel.selectByVisibleText("Solid Gold Petite Mi...");
	    sel.selectByVisibleText("White Gold Plated Pr...");
	    sel.selectByVisibleText("WD 2TB Elements Port...");
	    Thread.sleep(2000);
	    //de-select by index//
	    sel.deselectByIndex(6);
	    Thread.sleep(2000);
	    //de-select by value//
	    sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
	    Thread.sleep(2000);
	    //de-select by visible text
	    sel.deselectByVisibleText("Solid Gold Petite Mi...");
	    Thread.sleep(2000);
	    //de-select by contains visible text
	    sel.deSelectByContainsVisibleText("WD 2TB Elements Port...");
	    Thread.sleep(2000);
	    sel.selectByVisibleText("John Hardy Women's L...");
	    sel.selectByVisibleText("Solid Gold Petite Mi...");
	    sel.selectByVisibleText("White Gold Plated Pr...");
	    sel.selectByVisibleText("WD 2TB Elements Port...");
	    Thread.sleep(2000);
	    //de-select all the selected elements
	    sel.deselectAll();
	}

}
