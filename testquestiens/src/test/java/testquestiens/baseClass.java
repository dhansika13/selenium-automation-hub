package testquestiens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseClass {
	WebDriver driver=null;
    @BeforeSuite
	public void beforeSute() {
		Reporter.log("--Executing Suite--",true);
	}
    @BeforeTest
    public void beforeTest() {
    	Reporter.log("--Executing Test--",true);
	}
    @BeforeClass
    public void beforeClass() {
    	ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
    	driver=new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	//login with valid credential
    	driver.get("https://www.saucedemo.com/inventory.html");
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
	}
    @BeforeMethod
    public void beforeMethod() {
    	Reporter.log("--Executing Method--",true);
	}
    @AfterMethod
    public void afterMethod() {
		
	}
    @AfterClass
    public void afterClass() {
    	driver.findElement(By.id("react-burger-menu-btn")).click();
    	driver.findElement(By.id("logout_sidebar_link")).click();
    	Reporter.log("--Executing AfterClass and logout--",true);
	}
    @AfterTest
    public void afterTest() {
    	Reporter.log("--Executing AfterTest--",true);
	}
    @AfterSuite
    public void afterSute() {
    	Reporter.log("--Executing AfterSuite--",true);
	}
}
