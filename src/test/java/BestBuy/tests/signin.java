package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.SignIn;

public class signin extends SignIn{
	@Test
	
	
	public void Sign() {
		
		try {
			launchBrowser("https://www.bestbuy.com/");
			SignIn sign=PageFactory.initElements(driver, SignIn.class);
			sign.Country();
			sign.Account();
			sign.CreateAccount();
			sign.firstname("kasi");
			sign.lastname(" T");
			sign.mailId("kaac2507@gmail.com");
			sign.password("Kasi @140597");
			sign.Confirmpassword("Kasi @140597");
			sign.phonenumber("6374875107");
			sign.recovery();
			sign.Create();
			sign.Skip();
			sign.profile();
			sign.Signout();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
