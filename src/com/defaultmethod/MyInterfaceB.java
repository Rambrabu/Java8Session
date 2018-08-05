package com.defaultmethod;

public interface MyInterfaceB {

	default void myFunction(){
		System.out.println("Default method in Interface B");
	}
}
