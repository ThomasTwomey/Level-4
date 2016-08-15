package HumansAndVampires;

import java.util.ArrayList;

public class HumansAndVampires {

	public static void main(String[] args) {
		
	}

}

class Person{
	private String name;
	private int yearOfBirth;
	private final int currentYear = 2016;
	
	public Person(String name, int yearOfBirth){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return currentYear - yearOfBirth;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

class Demographics{
	ArrayList<Person> list;
	
	public Demographics(ArrayList<Person> list){
		this.list = list;
	}
	
	public int getAverageAge(){
		int total = 0;
		for(Person p: list){
			total += p.getAge();
		}
		return total / list.size();
	}
}

class Vampire extends Person{
	private int ageAtDeath;
	
	public Vampire(String name, int yearOfBirth) {
		super(name, yearOfBirth);
	}
}