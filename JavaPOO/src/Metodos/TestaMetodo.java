package Metodos;

import java.util.Scanner;

public class TestaMetodo {
    
	static int numero3 = 50, numero4 = 25, subtracao; // vari�veis globais
	
	public static void main(String[] args) {
		
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite os valores: ");
			int numero7 = input.nextInt();
			int numero8 = input.nextInt();
			
			metodo01();
			metodo02();
			metodo03();
			metodo04();
			metodo05(2,4);
			System.out.println(MetodoFora.metodo06(numero7, numero8));

		}
		
		public static void metodo01() {
			System.out.println("Ol�, eu sou o m�todo 01!");
		}
		
		public static void metodo02() {
			int soma, numero1 = 10, numero2 = 20;
			
			soma = numero1 + numero2; // vari�veis locais, funcionam dentro do m�todo.
			
			System.out.println("Soma no m�todo 02: " + soma);
		}
		
		public static void metodo03() {
			subtracao = numero3 - numero4;
		}
		
		public static void metodo04() {
			System.out.println("M�todo 04 mostrando resultado do m�todo 03: " + subtracao);
		}
		
		public static void metodo05(int numero5, int numero6) { // par�metros (receber)
			int multiplicacao = numero5 * numero6;
			System.out.println("O resultado da multiplica��o no m�todo 05 �: " + multiplicacao);
		}

	}
