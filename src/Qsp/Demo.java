package Qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
   @Test
    public void openandClose()throws MalformedURLException
{
	/*URL url=new URL("http://localhost:4444/wd/hub");
	DesiredCapabilities d=new DesiredCapabilities();
	d.setBrowserName("chrome");
	WebDriver driver=new RemoteWebDriver(url,d);
	driver.get("http://www.google.com");
	driver.quit();*/
	   
	   	System.setProperty("webdriver.chrome.driver", "./exes/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		System.out.println("Done");
		Reporter.log("This is done",true);
		driver.quit();
}
}
