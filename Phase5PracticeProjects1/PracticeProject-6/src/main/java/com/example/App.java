package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws FindFailed
    {
    	//register the webdriver =>browser vendor 
    			WebDriverManager.chromedriver().setup();
    			//creating an object to the object
    			WebDriver wd=new ChromeDriver();
    			//maximize the browser
    			wd.manage().window().maximize();
               wd.get("https://www.amazon.in/");
    			
    			
    			Screen sc=new Screen();
    			Pattern p1=new Pattern("D:\\1.png");
    			sc.type(p1,"samsung");
    			Pattern p2=new Pattern("D:\\2.png");
    			sc.click(p2);
    }

    }
