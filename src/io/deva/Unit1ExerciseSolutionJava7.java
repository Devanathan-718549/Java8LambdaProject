package io.deva;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",60),
				new Person("Lewis", "Carroll",60),
				new Person("Devanathan", "Narasimhan",33),
				new Person("ArunKumar", "Srinivasan",32),
				new Person("Srivatsan","Narasimhan",43)
				);
		
		
		//Step:1 Sort List by last name
		
		Collections.sort(people, new Comparator<Person>() 
				{
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getLastName().compareTo(o2.getLastName());
					}
				}
		
		);
		
		
		//Step:2 Create the method that prints all element in the list
		
		printAll(people);
		
		//Step:3 create a method that prints all people that have last name beginning with C
		System.out.println("LastName calling");
		printConditionally(people,new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("First name calling ");
		printConditionally(people,new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}


	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p : people){
			
			if(condition.test(p)){
				System.out.println("Begin with C " + p);	
			}
		}
			
	}

	private static void printAll(List<Person> people) {

		for(Person p : people)
			System.out.println(p);
	}

	
	interface Condition{
		boolean test(Person p);
	}
}
