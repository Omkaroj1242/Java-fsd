package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
        //creating an object to the object
        WebDriver wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //go to browser and open this url 
        wd.get("https://www.amazon.in/");

        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
        wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        wd.findElement(By.className("nav-a"));
        wd.findElement(By.name("url")).sendKeys("Books");
        wd.findElement(By.linkText("Help"));
        wd.findElement(By.cssSelector("#ap_email")).sendKeys("abc@gmail.com");
        
        
    	
    	
    }
    
}
