package com.sri;

public class A {

	public void property() {
		System.out.println("I have got the cash and gold methods");
	}
	
	//overridden method 
	public void marry() {
		System.out.println("I want marry to X");
	}
	
	public Object color() {
		return null;
	}
	
	public void number(int i) {
		System.out.println("This the class A" + i);
	}
	
	protected void m1() {
		System.out.println("This is testing for the final method");
	}
	
	//Method hiding based on the reference type 
	public static void m2() {
		System.out.println("It is the parent class of the A");
	}
}
