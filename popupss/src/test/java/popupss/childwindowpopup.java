package popupss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		       // Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Navigate to URL
				driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
				Thread.sleep(2000);

	}
}
