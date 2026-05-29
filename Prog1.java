package Seleniumwithtestng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(Listen.class)
public class Prog1 extends Listen {

	
	@Test()
	public  void google_openabout() 
	{
		
		WebElement w2 = w1.findElement(By.xpath("//a[text()='About']"));
		w2.click();
		
	}
      
      
	@Test()
	public   void selectautomation() 
	{
		
		WebElement w3 = w1.findElement(By.id("APjFqb"));
		w3.sendKeys("Automation");
		w3.sendKeys(Keys.ENTER);
		
		
		
	}
	
@BeforeMethod
@Parameters("p")
	public  void launch(String a)  throws InterruptedException
	{
	if(a.equals("chrome"))
			{
		 w1 = new ChromeDriver();
			}
	if(a.equals("edge"))
	{
		w1 = new EdgeDriver();
	}
	if(a.equals("firefox"))
	{
		w1 = new FirefoxDriver();
	}
	
	
		 
		w1.get("https://www.google.com/");
		w1.manage().window().maximize();
		Thread.sleep(4000);
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
	Thread.sleep(4000);
	
		w1.close();
	}
	
}

