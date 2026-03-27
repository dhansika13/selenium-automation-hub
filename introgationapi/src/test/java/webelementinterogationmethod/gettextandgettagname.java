package webelementinterogationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextandgettagname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.lkjkldev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//locating about link
		WebElement aboutlink=driver.findElement(By.id("navbarDropdown"));
		System.out.println("name of my link:"+aboutlink.getText());
        //fetch the tag name
		System.out.println("the tagname is:"+aboutlink.getTagName());
		driver.quit();
	}

}
