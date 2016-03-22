package basics;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			WebDriver driver = new FirefoxDriver();
			driver.get("hhtp//accounts.google.com/signup");
			driver.findElement(By.xpath(""));
			driver.switchTo().window(args[0]);
			//Below: Multiple window code. ids will get all windows
			//and Iterator is an existing class to parse each window
			//and using .next() will keep going through windows
			Set<String>ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			String parentid=it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());
	}

}
