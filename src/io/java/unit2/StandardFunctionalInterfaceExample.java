package io.java.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {
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
		performConditionally(people,p -> true,p -> System.out.println(p));
		//Step:3 create a method that prints all people that have last name beginning with C
		System.out.println("LastName calling");
		performConditionally(people,p -> p.getLastName().startsWith("C"),p -> System.out.println(p));
		System.out.println("First name calling ");
		performConditionally(people, p -> p.getFirstName().startsWith("C"),p -> System.out.println(p.getFirstName()));
	}

	private static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer){
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);	
			}
		}
	}
}