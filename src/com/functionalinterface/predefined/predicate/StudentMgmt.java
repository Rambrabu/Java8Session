package com.functionalinterface.predefined.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.model.Student;

public class StudentMgmt {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"Mahadev", 18, "CSE", 67.00));
		students.add(new Student(2,"Siva", 19, "ECE", 78.00));
		students.add(new Student(3,"Ashok", 18, "CSE", 82.00));
		students.add(new Student(4,"David", 18, "IT", 71.00));
		students.add(new Student(5,"Jeeva", 19, "IT", 63.00));
		
		Predicate<Student> studAgeAbove18 = s->s.getAge()==18;
		Predicate<Student> studPerAbove75 = s->s.getPercentage()>75;
		Predicate<Student> studIsCSE = s->s.getDept().equals("CSE");
		
		filterAndDisplay(studAgeAbove18,students);
		filterAndDisplay(studPerAbove75,students);
		filterAndDisplay(studIsCSE,students);
		filterAndDisplay(studIsCSE.negate(),students);
		filterAndDisplay(studAgeAbove18.and(studPerAbove75),students);
		filterAndDisplay(studIsCSE.or(studPerAbove75),students);

	}
	
	public static void filterAndDisplay(Predicate<Student> studp, List<Student> students){
		
		for(Student student : students)
			if(studp.test(student))
				System.out.println(student);
			
		System.out.println("------------------------------------------");
		
	}

}
