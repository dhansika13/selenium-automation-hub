package web_driver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearninggetMethod {

	public static void main(String[] args) throws InterruptedException {
		//launching the browser
		WebDriver driver=new ChromeDriver();
		//navigating to amazon
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1744817567615941045&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302928&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		//fetching the title of the webpage
		//wait statement
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getTitle());
	}

}
