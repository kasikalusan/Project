package BestBuy.tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.BrokenLink;

public class Broken extends BrokenLink {
@Test
	public void brokenLink() {
		
		launchBrowser("https://www.bestbuy.com/");
		BrokenLink bro=PageFactory.initElements(driver, BrokenLink.class);
		bro.broken();
		
	}
}
