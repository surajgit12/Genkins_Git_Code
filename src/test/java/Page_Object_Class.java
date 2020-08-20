import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Page_Object_Class {
	
	
	
	@Test
	void m1() {
		
		/*System.setProperty("webdriver.chrome.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.google.com/");

}

	@Test
	void m2() {
		
		/*System.setProperty("webdriver.chrome.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.google.com/");




	}



}
