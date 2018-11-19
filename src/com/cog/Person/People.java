package com.cog.Person;

import java.util.List;
import java.util.stream.Collectors;

public class People {
public static void main(String[] args) {
	Person John = new Person("John", 20, "Teacher");
	Person Mary = new Person("Mary", 21, "Electrician");
	Person Stuart = new Person("Stuart", 22, "Doctor");
	People people1 = new People();
	
	List<Person> peoplestring = Person.getPeople().stream()
			.peek(p-> System.out.println(p))
			.collect(Collectors.toList());
	
	System.out.println(people1.findPersonByName("John"));
}

//find person by name

private List<Person> findPersonByName(String name) {
	return Person.getPeople().stream()
			.filter(p -> p.getName().equals(name))
			.collect(Collectors.toList());
			
}
}
