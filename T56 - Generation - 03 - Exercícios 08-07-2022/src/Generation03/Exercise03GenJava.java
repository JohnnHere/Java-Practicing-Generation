package Generation03;

import java.util.Scanner;

public class Exercise03GenJava {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
	    
	    System.out.println("A idade desta pessoa é: ");
	    int ageOne = entry.nextInt();
	    
	    if(ageOne >= 10 && ageOne <= 14) {
	    	System.out.println("Esta pessoa é da categoria infantil");
	    }
	    if(ageOne >= 15 && ageOne <= 17) {
		    System.out.println("Esta pessoa é da categoria juvenil");
	    }
		if(ageOne >= 18 && ageOne <= 25) {
			System.out.println("Esta pessoa é da categoria adulto");
	    }
		if(ageOne >= 0 && ageOne <= 13 || (ageOne >= 26 && ageOne <= 150)) {
			System.out.println("A idade desta pessoa não possui categoria");
		}
		if(ageOne >= 151) {
			System.out.println("Esta não é a idade de um humano. Tente novamente.");
		}

		entry.close();
	}

}
