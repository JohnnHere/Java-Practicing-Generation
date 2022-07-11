package prova04.dowhile;

import java.util.Scanner;

public class Exercise03p04dowhile {

	public static void main(String[] args) {
		
		int age, people = 0, peopleBetween = 0, peopleMore50 = 0, peopleLess21 = 0;
		
		Scanner entry = new Scanner(System.in);
		
		while(people <= 4) {
			people++;
			System.out.println("Type the age: ");
			age = entry.nextInt();
		if(age > 99) {
			System.out.println("Invalid value.");
			break;
		}
		if(age >= 0 && age < 21) {
			peopleLess21++;
		}
		if(age >= 21 && age <= 50) {
			peopleBetween++;
		}
		if(age > 50 && age <= 99) {
			peopleMore50++;
		}
	}
		System.out.println("The amount of people more or equal than 0 year and less than 21 years are: " + peopleLess21);
		System.out.println("The amount of people more or equal than 21 years and less or equal than 50 years are: " + peopleBetween);
		System.out.println("The amount of people more than 50 years and less or equal 99 years are: " + peopleMore50);
        
		entry.close();
  }

}
