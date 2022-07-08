package Generation03;

import java.util.Scanner;

public class Exercise01GenJava {

	public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    
    System.out.println("O primeiro número é: ");
    int number1 = entry.nextInt();
    
    System.out.println("O segundo número é: ");
    int number2 = entry.nextInt();
    
    System.out.println("O terceiro número é: ");
    int number3 = entry.nextInt();
    
    if(number1 > number2 && number1 > number3) {
    	System.out.println("O maior número é: " + number1);
    }
    if(number2 > number1 && number2 > number3) {
    	System.out.println("O maior número é: " + number2);
    }
    if(number3 > number1 && number3 > number2) {
    	System.out.println("O maior número é " + number3);
    }
    
    entry.close();
    
}
}
