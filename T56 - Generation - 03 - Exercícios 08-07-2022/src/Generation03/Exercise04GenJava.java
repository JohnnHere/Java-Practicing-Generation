package Generation03;

import java.util.Scanner;

public class Exercise04GenJava {
	public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
	    
	    System.out.println("O número é: ");
	    double numberOne = entry.nextInt();
	    
	    if(numberOne % 2 == 0) {
	    	
	    System.out.println("A raiz quadrada do número é: " + Math.sqrt(numberOne));
	    }
	    if(numberOne % 2 != 0) {
	    	System.out.println("O valor do número elevado ao quadrado é: " + numberOne * numberOne);
	    }
	    
	    entry.close();
	}
}