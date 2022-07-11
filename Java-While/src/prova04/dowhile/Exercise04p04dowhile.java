package prova04.dowhile;

import java.util.Scanner;

public class Exercise04p04dowhile {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner entry = new Scanner(System.in);
		
		int people = 0, gender = 0, genderM = 0, genderO = 0, genderF = 0, scale = 0, agress = 0, 
			nervous = 0, calm = 0,  more40 = 0, less18 = 0, smaller18 = 0, higher40 = 0,  
			calmOther = 0, nervousF = 0, agressM = 0;
		
		while(people <= 2) {
			System.out.println("Please, put the new person's data: ");
			people++;
			System.out.println("Say your gender; 1 = Man, 2 = Woman and 3 = Other: ");
			gender = entry.nextInt();
			
			if(gender == 2){
				genderF++;
			}
			
			if(gender == 3){
				genderO++;
			}
			
			if(gender == 1){
				genderM++;
			}
			
			System.out.println("If you are calm, type 1. If you are nervous, type 2. If you are agressive, type 3. ");
			
			scale = entry.nextInt();
			
			if(scale == 1){
				calm++;
				System.out.println("Are you under 18 ? Yes: type 1. No: type 2. ");
				
				less18 = entry.nextInt();
				
				if(less18 == 1) {
					smaller18++;
				               }
				
			             }
			if(scale == 2){
				nervous++;
				
				System.out.println("Are you above 40 ? Yes: 1. No: 2. ");
				
				more40 = entry.nextInt();
				
				if(more40 == 1) {
					higher40++;
				              }
				
			             }
			
			 if(scale == 3){
				agress++;
			              }
			 
			 if(scale == 1 && gender == 2) {
				nervousF++;
				                     }
			 
			 if(scale == 3 && gender == 1) {
				agressM++;
			                         }
			 
			 if(scale == 1 && gender == 3) {
				calmOther++;
			 }
				
		}
		
		System.out.println("\n");
		System.out.println("Were interviewd: " + genderM + " Masculine people, " + genderF + " Female people, " + genderO + " Other gender people.");
		System.out.println("Number of calm people: " + calm);
		System.out.println("Under 18 people: " + smaller18 + " being " + nervous + " nervous.");
		System.out.println("Number of +40 people: " + higher40 + " being " + agress + " agressive.");
		System.out.println("\n");
		System.out.println("Nervous women: " + nervousF + " Agressive men: " + agressM + " Calm neutral gender: " + calmOther);	
		
		entry.close();
	}
	
	}