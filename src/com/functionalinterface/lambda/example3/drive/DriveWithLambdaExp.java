package com.functionalinterface.lambda.example3.drive;

import com.functionalinterface.lambda.example3.MyFunctionalInterface;

public class DriveWithLambdaExp {

	public static void main(String[] args) {
		MyFunctionalInterface mfi = s->"Hello world "+s;
		System.out.println(mfi.myFunction("I hope this session is going well so far"));
		System.out.println(mfi.myFunction("Welcome to the session"));
		
		MyFunctionalInterface mfi1 = s->s+" length is "+s.length();
		System.out.println(mfi1.myFunction("This string"));
	}
}
