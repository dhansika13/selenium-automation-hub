package sel_webelementmwthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatebackandforth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to mynthra
		driver.get("https://www.myntra.com/?utm_source=gh_toi&utm_medium=toi_rev&utm_campaign=gh_toi_Listicle_3&gad_source=1&gad_campaignid=23485853448&gbraid=0AAAABCrN4sOs2CKrPBuBKrhWBQzagKEPq&gclid=Cj0KCQiA5I_NBhDVARIsAOrqIsag24oAjvwu_V1cfQBWMSuqmnBpH01__5zPdOQLv_YmwGNlh5QYVdsaAqulEALw_wcB");
		Thread.sleep(2000);
		//navigate to bigbasket
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		//navigate to Ajio
		driver.get("https://www.ajio.com/?srsltid=AfmBOornBRz3l373yWlGAXkVvcaG_ovJrol9urFpwnwxaaJ9dWzdGA4y");
		Thread.sleep(2000);
		//navigate to biggbasket and verify
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//navigate to ajio and verifying
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
	}

}
