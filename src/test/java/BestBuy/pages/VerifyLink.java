package BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuy.utils.BaseClass;

public class VerifyLink extends BaseClass {

	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement deal;	
	
	@FindBy(xpath="//a[text()='Totaltech Membership']")
	WebElement totaltech;	
	
	@FindBy(xpath="//a[text()='Credit Cards']")
	WebElement credit;	
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement gift;
	

	@FindBy(xpath="//a[text()='Gift Ideas']")
	WebElement giftidea;
	
	public boolean Topdeals() {
		topdeals.click();
			boolean retVal=false;
			
			try {
				if (topdeals.isDisplayed()) {
					System.out.println("Pass : Element is Displayed");
					retVal=true;	
				} else
				{
					System.out.println("Fail : Element is Displayed");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return retVal;
		}
	
public boolean Deals() {
	deal.click();
	boolean retVal=false;
	
	try {
		if (deal.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			retVal=true;	
		} else
		{
			System.out.println("Fail : Element is Displayed");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return retVal;
}

public boolean Totaltech() {
	totaltech.click();
	boolean retVal=false;
	
	try {
		if (totaltech.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			retVal=true;	
		} else
		{
			System.out.println("Fail : Element is Displayed");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return retVal;
}

public boolean Credit() {
	credit.click();
	boolean retVal=false;
	
	try {
		if (credit.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			retVal=true;	
		} else
		{
			System.out.println("Fail : Element is Displayed");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return retVal;
}
public boolean Gift() {
	gift.click();
	boolean retVal=false;
	
	try {
		if (gift.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			retVal=true;	
		} else
		{
			System.out.println("Fail : Element is Displayed");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return retVal;
}
public boolean Giftidea() {
	giftidea.click();
	boolean retVal=false;
	
	try {
		if (giftidea.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			retVal=true;	
		} else
		{
			System.out.println("Fail : Element is Displayed");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return retVal;
}
}
	

