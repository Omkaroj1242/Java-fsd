package com.multithreading.thread;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Concurrent thread started running..");
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}
}
