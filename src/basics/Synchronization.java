package basics;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
//the above 2 lines will allow you to get past an unsecured site (The connection is untusted. Remember to pass the object in the line below..) Only in FF, IE and Chrome handles it fine 
		
		WebDriver driver = new FirefoxDriver(prof);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//the global 5 second implicit wait above applies for all code below
		
		driver.get("www.ebay.com");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000L);//explicit wait to wait for 5 seconds to do other tasks
		//But if you need to keep adding sleeps like this it can cause performance issues. So instead let's set a global implicit wait
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
		
	}

}
