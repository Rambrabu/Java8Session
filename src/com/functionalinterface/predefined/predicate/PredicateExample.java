package com.functionalinterface.predefined.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<String> p = s->s.length() == 5;
		System.out.println(p.test("ram"));
		System.out.println(p.negate().test("ram"));
	}

}
