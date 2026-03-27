package webdriverinterogationmethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class titleverification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetching the title
		String et="Demo Web Shop";
		String title=driver.getTitle();
		if(title.equals(et)) {
			System.out.println("the navigation is successfull");
		}
		else {
			System.out.println("navigation failed");
		}
		driver.quit();
		
		
	}
}
