package com.functionalinterface.lambda.example2.drive;

import com.functionalinterface.lambda.example2.MyFunctionalInterface;

public class DriveWithLambdaExp {

	public static void main(String[] args) {
		MyFunctionalInterface mfi = (a,b)->System.out.println("Addition of two numbers is "+(a+b));
		mfi.operation(2,6);
	}
	
}
