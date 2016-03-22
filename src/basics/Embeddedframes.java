package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Embeddedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://https://fantasycricket.dream11.com/IN/");
		
		
	}
	
	public void switchtoFrame(WebDriver driver)
	{
	int framecount=driver.findElements(By.tagName("iframe")).size();	
	
	
	for(int i=0; i<framecount;i++)
	{
	driver.switchTo().frame(i);
	
	List<WebElement> count = driver.findElements(By.xpath("The im a robot captcha xpath"));
	
	/*if (count.size()>0)
	{
	
		
		driver.findElement(((WebElement) By.xpath("same captcha as above")).click());
		
	}*/
	
	
		
	}
	}
}

	

