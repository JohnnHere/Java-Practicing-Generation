package exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner entry = new Scanner (System.in);
		
		double notas[] = new double [5], melhor = 0;
		
		System.out.println("Insira a nota da prova: ");
		
		for(int i = 0; i <= 4; i++) {
			notas[i] = entry.nextDouble();
			
			if(notas[i] > melhor) {
				melhor = notas[i];
			}
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Você inseriu: " + notas[i]);
		}

		System.out.println("A melhor nota foi: " + melhor);
		
		entry.close();
		
	}
}