package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.VerifyLink;

public class verifylink extends VerifyLink {
@Test
	public void tops() {
		try {
			launchBrowser("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494&intl=nosplash");
			VerifyLink link=PageFactory.initElements(driver, VerifyLink.class);
			link.Topdeals();
			link.Deals();
			link.Totaltech();
			link.Credit();
			link.Gift();
			link.Giftidea();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
