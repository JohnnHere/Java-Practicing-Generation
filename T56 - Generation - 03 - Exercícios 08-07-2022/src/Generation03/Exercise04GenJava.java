package Generation03;

import java.util.Scanner;

public class Exercise04GenJava {
	public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
	    
	    System.out.println("O n�mero �: ");
	    double numberOne = entry.nextInt();
	    
	    if(numberOne % 2 == 0) {
	    	
	    System.out.println("A raiz quadrada do n�mero �: " + Math.sqrt(numberOne));
	    }
	    if(numberOne % 2 != 0) {
	    	System.out.println("O valor do n�mero elevado ao quadrado �: " + numberOne * numberOne);
	    }
	    
	    entry.close();
	}
}