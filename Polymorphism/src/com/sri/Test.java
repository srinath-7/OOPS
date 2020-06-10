package com.sri;

public class Test {
	
	public static void m1(String name, int i) {
		System.out.println(name + i);
	}
	
	public void m1() {
		System.out.println("no- arguments");
	}
	
	

	public void m1(int i) {
		System.out.println("It is the integer argument");
	}

	public void m1(double d) {
		System.out.println("It is the double argument");
	}
	
	public void m1(String s) {
		System.out.println("String method is called");
		
	}
	
	public void m1(Object o) {
		System.out.println(" This is the new object class ");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("StringBUffer version");
	}
	
	public void m1(int i, float f) {
		System.out.println("int-float version");
	}
	
	public void m1(float f, int i) {
		System.out.println("float- int version");
	}

	public static void main(String args[]) {
		
		Test test = new Test();
		
//		test.m1();
//		test.m1(2.5);
//		test.m1(3);
//		//automatic prompotion 
//		test.m1('a');
//        test.m1("Sri");
////		test.m1(new Object());
//        test.m1("durga");
//        test.m1(new StringBuffer("durga"));
//     	test.m1(null);
		test.m1(20, 3.5f);
		test.m1(10.5f, 10);
		test.m1("sri" , 2);
		
		
		
	}

}


