package br.com.generation.hello;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][2];
		double soma = 0.0, media = 0.0;
		
		// Inserção dos valores
		for(int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos.length; c++) {
				System.out.printf("Nota na posição [%d][%d]: " , l , c);
				notasAlunos[l][c] = input.nextDouble();
				soma += notasAlunos[l][c];
				media = soma / (notasAlunos.length + notasAlunos[l].length);
			}
		}
		
		System.out.println();
		
		// Visualização da matriz
		for(int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos.length; c++) {
					System.out.print(" | " + notasAlunos[l][c] + " | ");
				}
			System.out.println();
			}
		
		System.out.println();
		System.out.println("Média dos alunes: " + media);
		
		input.close();
		
		}
	}