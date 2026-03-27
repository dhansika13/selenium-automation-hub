package webelementinterogationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//locating the search button
		WebElement searchbtn=driver.findElement(By.id("nav-search-submit-button"));
		Dimension dims=searchbtn.getSize();
		System.out.println("the dimention of search btn:"+dims);
		//fetch the height
		System.out.println(dims.height);
		System.out.println(dims.getHeight());
		//fetch the width
		System.out.println(dims.width);
		System.out.println(dims.getWidth());
		System.out.println(searchbtn.getCssValue("height"));
		
		driver.quit();
	}

}
