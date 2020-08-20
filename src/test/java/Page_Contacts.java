import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Page_Contacts {
	
	
	
	@Test(priority =0)
	void Search_Page() {
		
	
	System.setProperty("webdriver.gecko.driver",
			"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
     driver.get("https://dailyseven.doselab.com/login-manual/");
	
	driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("week5s-m1@yopmail.com");
	
	driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Test_123");
	
	driver.findElement(By.xpath("//input[@class='login-modal__submit button--primary']")).click();
	
	}
}
