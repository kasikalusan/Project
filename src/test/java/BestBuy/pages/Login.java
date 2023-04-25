package BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuy.utils.BaseClass;

public class Login extends BaseClass{

	@FindBy(xpath="(//img[@alt='United States'])[1]")
	WebElement country;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement mail;
	

	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void Country() {
		country.click();
	}
	
	public void Account() {
		account.click();
	}
	public void Loggin()
	{
		login.click();
	}
	
	public void Mail(String email) {
		mail.sendKeys(email);
	}
	public void Password(String pass) {
		password.sendKeys(pass);
		
		
	}
	public void Submit() {
		submit.click();
	}
}
