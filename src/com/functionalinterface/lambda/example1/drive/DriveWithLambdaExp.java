package com.functionalinterface.lambda.example1.drive;

import com.functionalinterface.lambda.example1.MyFunctionalInterface;

public class DriveWithLambdaExp {

	public static void main(String[] args) {
		MyFunctionalInterface mfi = ()->System.out.println("Hello world With Lambda function");
		mfi.myFunction();
	}
	
}
