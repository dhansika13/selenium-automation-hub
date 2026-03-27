package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasktouploadpopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cFRyY5T9ukMLW4Ep3j1bMDL9&gclid=Cj0KCQiA8KTNBhD_ARIsAOvp6DLccTBTftfA34zlakS33iWqXXT0OBbm22SW1vldWHCunb47vC17j2oaAoOoEALw_wcB");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-val=\"exp\"]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\dhans\\Downloads\\2022PECIT127-R.Dhansika-Devops.pdf");
		Thread.sleep(2000);
	}

}
