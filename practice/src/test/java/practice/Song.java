package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Song
{
	WebDriver driver;
	@Test
	public void kannada()
	{
    	String browser ="chrome";
    	//String browser1 ="firefox";
    	if(browser.contains("chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	else
    	{
    		driver=new FirefoxDriver();
    	}
		System.out.println("---nuru janmku-----nuraru janmku----");
		
		String url="https://amazon.in";
		String url1="https://flipkart.com";
		if(url.contains("amazon"))
		{
			driver.get(url);
		}
		else
		{
			driver.get(url1);
		}
	}
	@Test
	public void English()
	{
		System.out.println("---i am unstoppeble----");
	}
	@Test
	public void Telagu()
	{
		System.out.println("---kalamnito nedavadu----");
	}
	@Test
	public void Hindi()
	{
		System.out.println("---teri meri gall ohimasabur----");
	}

}
