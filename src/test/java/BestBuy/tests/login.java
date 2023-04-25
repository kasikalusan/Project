package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.Login;



public class login extends Login {
	@Test
	
	public void Log() {
		try {
			launchBrowser("https://www.bestbuy.com/");
			Login log = PageFactory.initElements(driver, Login.class);
			log.Country();
			log.Account();
			log.Loggin();
			log.Mail("kaac2507@gmail.com");
			log.Password("Kasi @140597");
			log.Submit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
