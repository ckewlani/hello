package com.selenium.webdriver.learning;

import java.util.concurrent.TimeUnit;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;


public class Day1 {

	WebDriver driver;
	
public void invokebrowser()
{
		
		try {
			
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\acer\\IEDriverServer.exe");
			driver =  new InternetExplorerDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("https://html.com/tables/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		//	driver.findElement(By.cssSelector("input.nav-input")).click();
	
		String s=	driver.getPageSource();
			org.jsoup.nodes.Document dc = Jsoup.parse(s);
			
			
			
			org.jsoup.nodes.Document dc2 = Jsoup.parseBodyFragment(s);
			
			
			
			Elements xy = dc.getElementsByTag("h2");
			
			Elements yz = dc2.getElementsByTag("h2");
			System.out.println(xy);
			System.out.println(yz);
		//	for ( Element x : xy)
	
			//	System.out.println(x.text());
		}
			
			
			
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void browseweb()
		
		{
			driver.findElement(By.partialLinkText("Melenia's")).click();
			
		}
	
	
	public static void main(String[] args)
	{
		Day1 x = new Day1() ;
		x.invokebrowser();
		//x.browseweb();
		
		
	}
	
		
		
}
