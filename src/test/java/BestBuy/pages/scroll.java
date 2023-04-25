package BestBuy.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import BestBuy.utils.BaseClass;

public class scroll extends BaseClass {
@Test
	
	public void bottom() {
	try {
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-10000)");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
