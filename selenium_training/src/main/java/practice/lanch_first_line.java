package practice;
//import org.openqa.selenium.chrome.RemolteWebDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class lanch_first_line {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		//RemoteWebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
	   // RemoteWebDriver driver=new EdgeDriver();
	    //WebDriver driver=new ChromeDriver();
		String browser="firefox";
		
		WebDriver driver;
		
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		
	}

}

