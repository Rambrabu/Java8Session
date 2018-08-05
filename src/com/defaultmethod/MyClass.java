package com.defaultmethod;


public class MyClass implements MyInterfaceA, MyInterfaceB {
	
	public static void main(String [] args){
		
		MyInterfaceA mc = new MyClass();
		mc.myFunction();
		
		MyInterfaceA.myStaticMethod();
	}

	@Override
	public void myFunction() {
		MyInterfaceA.super.myFunction();
	}

}
