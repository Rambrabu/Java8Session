package com.streamsapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamClass {
	
	List<Integer> al = new ArrayList<Integer>();
	
	StreamClass(){
		al.add(10);
		al.add(22);
		al.add(5);
		al.add(17);
		al.add(35);
		al.add(27);
	}
	
	public static void main(String[] args) {
		StreamClass demo = new StreamClass();
		demo.filterMethod();
		demo.mapMethod();
		demo.sortingMethod();
		demo.printMin();
		demo.printMax();
		demo.printAllValues();
	}

	public void filterMethod(){
		
		System.out.println(al);
			
		System.out.println(al.stream().filter((i)->i%5==0).collect(Collectors.toList()));
		
		List<Integer> filteredal = new ArrayList<Integer>();
		for(Integer i :al){
			if(i%5==0)
				filteredal.add(i);
		}
		System.out.println(filteredal);
		
		System.out.println("-----------------------------------------------------------");
		
	}
	
	public void mapMethod(){
		
		System.out.println(al);
			
		System.out.println(al.stream().map((i)->i*10).collect(Collectors.toList()));
		
		List<Integer> mapal = new ArrayList<Integer>();
		for(Integer i :al){
				mapal.add(i*10);
		}
		System.out.println(mapal);
		
		System.out.println("-----------------------------------------------------------");
		
	}
	
	public void sortingMethod(){
		
		System.out.println(al);
				
		System.out.println(al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()));
			
		System.out.println("-----------------------------------------------------------");
	}
	
	public void printMin(){
		
		System.out.println(al);
				
		System.out.println(al.stream().min((i1,i2)->i1.compareTo(i2)).get());
		
		System.out.println("-----------------------------------------------------------");
			
	}
	
	public void printMax(){
		
		System.out.println(al);
				
		System.out.println(al.stream().max((i1,i2)->i1.compareTo(i2)).get());
		
		System.out.println("-----------------------------------------------------------");
			
	}
	
	public void printAllValues(){
		
		System.out.println(al);
		
		System.out.println("Lambda Expression ");
		al.stream().forEach(s->System.out.println(s));
		
		System.out.println("Method Reference ");
		al.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------");
		
	}
	
}
