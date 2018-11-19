package com.cog.Person;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private String job;
	
	private static ArrayList<Person> people = new ArrayList<Person>();
	
	//constructor - always runs when a person is made
	Person(String name, int age, String job) {
		this.setName(name);
		this.setAge(age);
		this.setJob(job);
		Person.getPeople().add(this);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJob() {
		return job;	
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String toString() {
		return name + " " + age + " " + job; 
	}
	public static ArrayList<Person> getPeople() {
		return people;
	}
	public static void setPeople(ArrayList<Person> people) {
		Person.people = people;
	}
}
