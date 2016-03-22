package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Someactions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		
		Actions abc=new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		
		abc.moveToElement(element1).build().perform();
		//System.out.println("Mouse Over Action");
		
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(element2).sendKeys("hello").build().perform();
		
		}

}
