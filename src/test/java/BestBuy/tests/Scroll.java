package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.scroll;

public class Scroll extends scroll {
@Test
	
	public void scroll() {
		try {
			launchBrowser("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494&intl=nosplash");
			scroll sc=PageFactory.initElements(driver, scroll.class);
			sc.bottom();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
