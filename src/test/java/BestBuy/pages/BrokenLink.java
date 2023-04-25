package BestBuy.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BestBuy.utils.BaseClass;

public class BrokenLink extends BaseClass {
	@Test
	
public void broken() {
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("No.of.Links = " + links.size());

	List<String> urllist = new ArrayList<String>();
	for (WebElement e : links) {
		String url = e.getAttribute("href");
		urllist.add(url);

		if (url == null || url.isEmpty()) {
			System.out.println("URL is empty");
			continue;
		}
		try {
			HttpURLConnection httpConnection = (HttpURLConnection) (new URL(url).openConnection());
			httpConnection.connect();
			int respCode= httpConnection.getResponseCode();
			
			
			
			if ( respCode >= 400) {

				System.out.println(url + " is broken and its response code is "+respCode);

			} else {

				System.out.println(url + " is a valid link and its reponse code is "+respCode);

			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	System.out.println("All the URLS: "+urllist);

}
}


