package com.functionalinterface.lambda.example1.drive;
import com.functionalinterface.lambda.example1.MyInterface;
import com.functionalinterface.lambda.example1.WithoutLambdaExp;

public class DriveWithoutLambdaExp {
	
	public static void main(String[] args) {
		
		MyInterface mi = new WithoutLambdaExp();
		mi.myFunction();
		
	}
	
}
