package com.sri;

public class Main {
    
	public static void main(String args[]) {
		
//		A a =  new A();
//		a.marry();
//	
//		
//		B b = new B();
//		b.marry();
//		b.m1();
//		b.m2();
       
//		
    	A a1 = new B();
//     	a1.number(3);
////		a1.marry();
////		a1.m1();
		
		//Method hiding: When both the methods are static. 
//     	It is resolved the complier at compile time based on the reference type 
		
      	a1.m2();
		
		Object o = new String("Durga");
		String sb = (String) o;
		System.out.println(sb);
		
		
		
	}

}
