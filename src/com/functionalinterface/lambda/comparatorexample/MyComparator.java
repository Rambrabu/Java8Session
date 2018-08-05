package com.functionalinterface.lambda.comparatorexample;

import java.util.Comparator;

import com.model.Student;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		/*if(s1.getPercentage()<s2.getPercentage())
			return -1;
		else if(s1.getPercentage()>s2.getPercentage())
			return +1;
		else
			return 0;*/
		
		return  s1.getPercentage()<s2.getPercentage()?-1:s1.getPercentage()>s2.getPercentage()?+1:0;
	}
	
}
