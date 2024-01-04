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
      wd.get("https://www.castleclothing.shop/login?ReturnUrl=/");
      wd.findElement(By.cssSelector("input#Username")).sendKeys("abc@gmail.com");
      //wd.findElement(By.cssSelector(".input.signin-form")).sendKeys("def@gmail.com");
      wd.findElement(By.cssSelector("input[name=Password]")).sendKeys("abcd");
      
      wd.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/button"));
    }
}
