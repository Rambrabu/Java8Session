package com.methodreferance;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MRExample {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s->System.out.println(s);
		c1.accept("Ram");
		
		Consumer<String> c2 = MRExample::display;
		c2.accept("Prabhu");
		
		MRExample mr = new MRExample();
		Consumer<String> c3 = mr::displayObj;
		c2.accept("Prabhu");
		
		Supplier<MRExample> obj = MRExample::new;
		obj.get();
	}
	
	public static void display(String name){
		System.out.println(name);
	}
	
	public void displayObj(String name){
		System.out.println(name);
	}

}
