package BestBuy.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import BestBuy.utils.BaseClass;

public class payment extends BaseClass {
	
	@FindBy(id="number")
	WebElement cardno;
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="address-input")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="postalCode")
	WebElement pincode;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;
	
	
	public void Cardno(String num) {
		cardno.sendKeys(num);
		
	}
	public void Fname(String fname) {
		firstname.sendKeys(fname);
		
	}
	public void Lname(String lname) {
		lastname.sendKeys(lname);
		
		
	}
	public void Address(String add) {
		address.sendKeys(add);
		
	}
	public void city(String CITY) {
		city.sendKeys(CITY);
		
	}
	public void State( String value) {
		
			try {
				Select sel = new Select(state);
				sel.selectByValue(value);
			} catch (Exception ex) {
				ex.printStackTrace();
		}
		
	}
	public void post(String code) {
		pincode.sendKeys(code);
		
	}
	public void placed() {
		placeorder.click();
	}
	
	public void screenShot(String ssname) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("C:\\Users\\lenovo\\eclipse-workspace\\Ecommerce\\photos" + ssname + ".png");

			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
