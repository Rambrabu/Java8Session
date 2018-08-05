package com.functionalinterface.lambda.comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Student;

public class DriveWithLambda {
	
	public static void main (String [] args){
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Mahadev", 18, "CSE", 67.00));
		students.add(new Student(2,"Siva", 19, "ECE", 78.00));
		students.add(new Student(3,"Ashok", 18, "CSE", 82.00));
		students.add(new Student(4,"David", 18, "IT", 71.00));
		students.add(new Student(5,"Jeeva", 19, "IT", 63.00));
		
		System.out.println(students);
		
		System.out.println("*****************************************");
		
		Collections.sort(students, (s1,s2)->s1.getPercentage()<s2.getPercentage()?-1:s1.getPercentage()>s2.getPercentage()?+1:0);
		
		System.out.println(students);
	}

}
