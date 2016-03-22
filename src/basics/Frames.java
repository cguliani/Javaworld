package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		
		//Frames
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getPageSource());
		/*we used the above since the site didn't allow right click to get the page source. 
		If the html has anything with "iFrame" or "Frameset", it has frames
		*/
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("input[class='input password']")).sendKeys("10000");
		
		
	}

}
