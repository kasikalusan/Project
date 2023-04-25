package BestBuy.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	
	public static WebDriver driver = null;

    public void launchBrowser(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);
			} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while launching the browser");
		}

	}
    @AfterTest
  public void close() {
	  driver.close();
  }
	 
}
