package com.functionalinterface.predefined.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<String, String> f1 = s->"Hello "+s;
		System.out.println(f1.apply("Ram"));
		System.out.println(f1.apply("Prabhu"));
		
		Function<String, Integer> f2 = s->s.length();
		System.out.println(f2.apply("Ram"));
		System.out.println(f2.apply("Prabhu"));
		
		Function<Integer, Integer> sqr = i->i*i;
		System.out.println(sqr.apply(2));
		System.out.println(sqr.apply(7));

	}

}
