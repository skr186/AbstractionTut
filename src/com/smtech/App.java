package com.smtech;

public class App {
	
	public static void main(String[] args) {
		
		Bank b1 = new NBB();
		System.out.println("Rate of Interest(NBB): " + b1.Interest() +"%");
		
		Bank b2 = new SBI();
		System.out.println("Rate of Interest(SBI): "+ b2.Interest()+ "%");
	}
}
