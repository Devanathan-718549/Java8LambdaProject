package io.deva;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",60),
				new Person("Lewis", "Carroll",60),
				new Person("Devanathan", "Narasimhan",33),
				new Person("ArunKumar", "Srinivasan",32),
				new Person("Srivatsan","Narasimhan",43)
				);
		//Step:1 Sort List by last name
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//Step:2 Create the method that prints all element in the list
		System.out.println("Print all in person object");
		printConditionally(people,p -> true);
		//Step:3 create a method that prints all people that have last name beginning with C
		System.out.println("LastName calling");
		printConditionally(people,p -> p.getLastName().startsWith("C"));
		System.out.println("First name calling ");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for(Person p : people){
			if(predicate.test(p)){
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