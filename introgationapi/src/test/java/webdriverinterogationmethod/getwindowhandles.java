package webdriverinterogationmethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//fetch the window id of the parent window
		String parentID=driver.getWindowHandle();
		System.out.println("window id of parent window"+parentID);
		//click on the tab to get child window popup
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
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
			System.out.println("child windowid:"+string);
		}
		Thread.sleep(2000);
		driver.quit();	
		}
}
