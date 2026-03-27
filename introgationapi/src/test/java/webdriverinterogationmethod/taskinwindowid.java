package webdriverinterogationmethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskinwindowid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetch the window id of the parent window
		String parentID=driver.getWindowHandle();
	    System.out.println("window id of parent window"+parentID);
	    //click on the tab to get child window popup
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		//click on the tab to get child window popup
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(2000);
		//fetching the both parent and child window id popups
		Set<String> allwindowsids = driver.getWindowHandles();
	    System.out.println("parant id and chlid id"+allwindowsids);
		//removing parent id from all windowid
		allwindowsids.remove(parentID);
	    //child id is still in set<String>
		System.out.println(allwindowsids);
		//fetch the child id out of the collection
		for(String string:allwindowsids) {
			driver.switchTo().window(string);
			String title=driver.getTitle();
			System.out.println(title+"->");
			System.out.println(string);
				}
	    Thread.sleep(2000);
	    driver.quit();	
		
	}

}
