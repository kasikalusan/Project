package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.Menu;

public class menuBar extends Menu{
	@Test
	
	
	public void order() {
		
		try {
			launchBrowser("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494&intl=nosplash");
			Menu menubar=PageFactory.initElements(driver, Menu.class);
			menubar.menu();
			menubar.Department();
			menubar.Brand();
			menubar.Samsung();
			menubar.Addcart();
			menubar.Cart();
			menubar.Checkout();
			menubar.Guest();
			menubar.Id("kaac2507@gmail.com");
			menubar.Ph("6374875107");
			menubar.Button();
			menubar.Continuepayment();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
