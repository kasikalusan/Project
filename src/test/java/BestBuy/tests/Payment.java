package BestBuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BestBuy.pages.payment;

public class Payment extends payment{
	@Test

	
	public void payMent() {
		
		try {
			launchBrowser("https://www.bestbuy.com/checkout/r/payment");
			payment pay=PageFactory.initElements(driver, payment.class);
			pay.Cardno("9876543210987654");
			pay.Fname("kasi");
			pay.Lname("T");
			pay.Address("12,west street");
			pay.city("madurai");
			pay.State("4");
			pay.post("647738");
			pay.placed();
			pay.screenShot("confirmed");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	public void closeBrowser() {
		try {
			driver.close();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}}
}
