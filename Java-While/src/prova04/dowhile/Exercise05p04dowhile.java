package prova04.dowhile;

import java.util.Scanner;

public class Exercise05p04dowhile {

	public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
		
		double number = 0, plus = 0;
		
		do {
			
			System.out.println("Digite o número: ");
			number = entry.nextDouble();
			plus = plus + number;
			
		} while(number != 0.0);
		
		System.out.println("A soma dos números é: " + plus);
		
		entry.close();
	}
}
