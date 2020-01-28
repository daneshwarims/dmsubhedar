package com.abc.Magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento1 {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.magento.com");
	  
	  driver.findElement(By.linkText("My Account")).click();
	  Thread.sleep(5000);
	  
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  driver.navigate().forward();
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
	}

}
