package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		//count of the links on the entire page
		//System.out.println("Total Links on page");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links on footer only:
		//System.out.println("Links in footer");
		//WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']")); 
		//System.out.println(footer.findElements(By.tagName("a")).size());
		
		//System.out.println("Links in 2nd column of footer section");
		
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul")); 
		//System.out.println(col.findElements(By.tagName("a")).size());
		String Beforeclicking=null;
		String Afterclicking;
		
		for(int i =0; i<col.findElements(By.tagName("a")).size();i++)
		
		{
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"));
			{
				Beforeclicking = driver.getTitle();
				System.out.println(driver.getTitle());
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
			
		}
		Afterclicking = driver.getTitle();
		//System.out.println(driver.getTitle());
		if(Beforeclicking!=Afterclicking)
		{
		//wite your own xpath for the issue below
			boolean abc = driver.findElement((By.xpath("html/body/div[2]/div[1]/ul/li[1]/a"))).isDisplayed();
		if(abc==true)
		
		{
			System.out.println("Pass");
			
		}
		}
		else
		{
			System.out.println("Fail");
		}
		}
		
		
		}

				/*Lecturer's code for the above
				 * import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		//Count of the Link in the Entire Page
	//	System.out.println("Links in the Page");
	//System.out.println(driver.findElements(By.tagName("a")).size());
	//Count of links in the footer section of the page
	WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
	//System.out.println("Links in the footer section");
	//System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	//System.out.println("Links in the 2nd coloumn of the section");
	//System.out.println(col.findElements(By.tagName("a")).size());
	String Beforeclicking = null;
	String Afterclicking;
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
	
		
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
		
}
	                   
	}



				 */
	


