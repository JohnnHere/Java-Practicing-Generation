package Generation02;

import java.util.Scanner;

public class Galao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a, b, soma;
		
		System.out.println("Escreva o valor de A ");
		a = leia.nextInt();
		System.out.println("Escreva o valor de B ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println();
		
		leia.close();
		
		

	}

}
