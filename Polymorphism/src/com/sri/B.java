package com.sri;

public class B extends A{
	
	//Overriding method 
	@Override
	public void marry() {
		System.out.println("I want to marry B");
	}
	
	public String color() {
	   return "sri";
	}
	
	public void m1() {
		System.out.println("This is the testing for the final class in the child");
	}
	
	public void number(int i) {
		System.out.println("This the class B " + i);
	}
	
	
	public static void m2() {
		System.out.println("It is the child class of the B");
	}

}
