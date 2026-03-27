package popupss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
	   ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
	   driver.manage().window().maximize();
	   driver.get("https://www.irctc.co.in/nget/train-search");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("jDate")).click();
	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//a[.='11']")).click();
//	   Thread.sleep(2000);
	   //to use xpath dynamically we use the following that the below code to select 11 from what ever month needed
	   driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c69-9']/following::a[.='30']")).click();
	   
	}

}
