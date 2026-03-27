package testquestiens;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class testqp1addtocart  {
		WebDriver driver=null;
	    @Test(priority=-1)
		public void lanchingBrowser() {
	    	ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
	    	driver=new ChromeDriver(options);
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority=2)
	public void logInVerification() {
		//login with valid credential
    	driver.get("https://www.saucedemo.com/inventory.html");
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
		WebElement swagLabText=driver.findElement(By.className("app_logo"));

		String actualvalue=swagLabText.getText();
		String expectedvalue="Swag Labs";
		//Hard assert
		if(actualvalue.equals(expectedvalue)) {
			System.out.println("Ststus: pass");
		}
		else {
			System.out.println("Ststus: fail");
		}
	}
	  @Test(priority=5,dependsOnMethods="logIn")
	    public void addToCart() {
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			//verifying
			driver.findElement(By.id("shopping_cart_container")).click();
			List<WebElement> product=driver.findElements(By.className("cart_list"));
			String productverifyed="";
			for(WebElement cartproduct:product) {
				productverifyed+=cartproduct.getText();
			}
			if(productverifyed.contains("Sauce Labs Backpack")&&productverifyed.contains("Sauce Labs Bike Light")){
	    		Reporter.log("Both the product has been added",true);
			}
			else {
	    		Reporter.log("product was not added",true);
			}
}
}
