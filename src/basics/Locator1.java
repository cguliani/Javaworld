package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("chirag");
		//driver.findElement(By.name("pass")).sendKeys("1234");
		//driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		

	}

}
