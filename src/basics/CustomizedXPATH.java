package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("chirag");
		//driver.findElement(By.name("pass")).sendKeys("1234");
		//driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcde");
		driver.findElement(By.cssSelector("#email")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	}

}
