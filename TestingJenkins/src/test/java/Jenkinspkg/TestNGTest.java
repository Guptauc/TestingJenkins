package Jenkinspkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
	
	
	WebDriver driver;
	
	@BeforeMethod 
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
       
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://aajtak.intoday.in/");
	}
	
	@Test(priority=3,groups="ujj")
	public void login()
	{
		String s=driver.getTitle();
		System.out.println(s);
	}
	
	@Test(priority=4,groups="gup")
	public void valdt()
	{
		driver.findElement(By.xpath("/html/body/header/div/div/divul/li[1]")).click();
	}
	
	@Test(priority=1,groups="chup")
	public void A()
	{
		System.out.println("1st");
	}
	
	@Test(priority=2,groups="ujj")
	public void A1()
	{
		System.out.println("2nd");
		
	}
	
	
	@AfterMethod
	
	public void logoutt()
	{
		driver.close();
	}

}
