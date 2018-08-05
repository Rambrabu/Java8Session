package com.defaultmethod;

public interface MyInterfaceA {
	
	default void myFunction(){
		System.out.println("Default method in Interface A");
	}
	
	static void myStaticMethod(){
		System.out.println("Static method in Interface A");
	}
	
}
