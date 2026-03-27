package popupss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchnewwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.oracle.com/in/java/technologies/downloads/");
        System.out.println(driver.getTitle());
	}

}
