package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class surrounding2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[.='Samsung']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//label[.=' RedMi ']/..//input[@type='checkbox']")).click();
	}
}
