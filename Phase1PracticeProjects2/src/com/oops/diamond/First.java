package com.oops.diamond;

public interface First {
	default void show() 
    { 
        System.out.println("Default First"); 
    } 
}
