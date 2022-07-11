package prova04.dowhile;

import java.util.Scanner;

public class Exercise06p04dowhile {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		int number = 0, amount = 0, plus = 0;
		
		do {
			System.out.println("Digite o número: ");
			number = entry.nextInt();
			
			if(number % 3 == 0) {
				plus = plus + number;
				amount++;
			}
			
		} while(number != 0);
		
		System.out.println("A média dos múltiplos de 3 é: " + plus / amount);
		
		entry.close();

	}

}
