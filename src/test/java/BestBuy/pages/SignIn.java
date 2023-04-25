package BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuy.utils.BaseClass;

public class SignIn extends BaseClass{
	
	@FindBy(xpath="(//img[@alt='United States'])[1]")
	WebElement country;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createaccount;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(name="fld-p1")
	WebElement Password;
	
	@FindBy(xpath="(//input[@class='tb-input'])[5]")
	WebElement ConfirmPassword;
	

	@FindBy(xpath="(//input[@class='tb-input'])[6]")
	WebElement Phonenumber;
	
	@FindBy(id="is-recovery-phone")
	WebElement Recovery;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement create;
	
	@FindBy(xpath="//button[text()='Skip for now']")
	WebElement skip;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement Profile;
	
	@FindBy(id="logout-button-bby")
	WebElement signout;
	
	public void Country() {
		country.click();
	}
	public void Account() {
		account.click();
	}
	
	public void CreateAccount() {
		createaccount.click();
	}
	public void firstname(String fname) {
		FirstName.sendKeys(fname);;
	}
	public void lastname(String lname) {
		LastName.sendKeys(lname);;
	}
	
	public void mailId(String mail) {
		Email.sendKeys(mail);
		
	}
	public void password(String pass ) {
		Password.sendKeys(pass);
	}
	public void Confirmpassword(String password ) {
		ConfirmPassword.sendKeys(password);
	}
	
	public void phonenumber(String num) {
		Phonenumber.sendKeys(num);
	}
	
	public void recovery() {
		Recovery.click();
	}
	
	public void Create() {
		create.click();
	}
	public void Skip() {
		skip.click();
	}
	public void profile() {
		Profile.click();
	}
	public void Signout() {
		signout.click();
	}
}
