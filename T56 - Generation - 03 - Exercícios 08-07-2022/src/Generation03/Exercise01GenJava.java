package Generation03;

import java.util.Scanner;

public class Exercise01GenJava {

	public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    
    System.out.println("O primeiro n�mero �: ");
    int number1 = entry.nextInt();
    
    System.out.println("O segundo n�mero �: ");
    int number2 = entry.nextInt();
    
    System.out.println("O terceiro n�mero �: ");
    int number3 = entry.nextInt();
    
    if(number1 > number2 && number1 > number3) {
    	System.out.println("O maior n�mero �: " + number1);
    }
    if(number2 > number1 && number2 > number3) {
    	System.out.println("O maior n�mero �: " + number2);
    }
    if(number3 > number1 && number3 > number2) {
    	System.out.println("O maior n�mero � " + number3);
    }
    
    entry.close();
    
}
}
