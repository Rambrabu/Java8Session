package com.defaultmethod;

public class MyParentClass {

	public static void main(String [] args){
		MyInterfaceA.myStaticMethod();
	}
	
	public void myFunction(){
		System.out.println("Parent class");
	}
	
}
