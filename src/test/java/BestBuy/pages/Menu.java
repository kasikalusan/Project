package BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import BestBuy.utils.BaseClass;

public class Menu extends BaseClass{

	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement menubar;
	
	@FindBy(xpath="(//button[@type='button'])[8]")
	WebElement department;
	
	@FindBy (xpath="(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[3]")
	WebElement brand;
	
	@FindBy(xpath="//a[text()='Samsung TVs']")
	WebElement samsung;
	
	@FindBy(xpath="//button[@data-sku-id='6401738']")
	WebElement addcart;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement cart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement guest;
	
	@FindBy(id="user.emailAddress")
	WebElement id;
	
	@FindBy(id="user.phone")
	WebElement ph;
	
	@FindBy(id="text-updates")
	WebElement button;
	
	
	
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepayment;
	
	
	
	public void menu() {
		menubar.click();
	}
	public void Department() {
		department.click();
	}
	public void Brand() {
		brand.click();
	}
	public void Samsung() {
		samsung.click();
	}
	public void Addcart() {
		addcart.click();
	}
	public void Cart() {
		cart.click();
	}
	public void Checkout() {
		checkout.click();
	}
	public void Guest() {
		guest.click();
	}
	public void Id(String mail) {
		id.sendKeys(mail);
		
	}
	public void Ph(String num) {
		ph.sendKeys(num);
		
	}
	public void Button() {
		button.click();
	}
	public void Continuepayment() {
		continuepayment.click();
	}
}
