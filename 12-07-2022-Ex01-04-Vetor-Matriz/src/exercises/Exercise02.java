package exercises;

import java.util.Random;

public class Exercise02 {

	public static void main(String[] args) {
		
		Random dados = new Random();
		
		double soma = 0, maior = 0, media;
		int maiorFrequencia = 0, numeroJogadas = 10, valorDado[] = new int [10];
		
		for(int i = 0; i <= numeroJogadas - 1; i++) {
			
			valorDado[i] = dados.nextInt(6) + 1;
			
			soma += valorDado[i];
			
			if(valorDado[i] > maior) {
				maior = valorDado[i];
				maiorFrequencia = 1;
			}
			
			if(valorDado[i] == maior) 
			maiorFrequencia++;
		}
		
		media = soma / valorDado.length;
		
		System.out.println("Valor do dado: ");
		
		for(int i = 0; i < valorDado.length; i++) {
			System.out.print(valorDado[i]);
		}
		
		System.out.println("\nA média dos lançamentos é: " + media);
		System.out.println("O maior número foi: " + maior);
		System.out.println("A maior ocorrência foi: " + maiorFrequencia);
	}
}