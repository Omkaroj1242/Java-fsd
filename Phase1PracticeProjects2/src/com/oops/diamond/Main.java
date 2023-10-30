package com.oops.diamond;

public class Main implements First, Second{
	public void show() {  
        First.super.show(); 
        Second.super.show(); 
    } 
	
	public static void main(String[] args) {
		Main ob = new Main(); 
        ob.show(); 
	}
}
