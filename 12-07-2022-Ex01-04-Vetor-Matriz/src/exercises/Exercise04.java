package exercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner (System.in);
		
       double matriz[][] = new double [3][3], soma = 0, primeiraDiagonal = 0;
       
       for(int linha = 0; linha < 3; linha++) {
    	   for(int coluna = 0; coluna < 3; coluna++) {
    		   System.out.print("Escreva um número na matriz [linha] e [coluna]: " );
    		   matriz[linha][coluna] = entry.nextDouble();
    		   soma += matriz[linha][coluna];
    		   if(linha == coluna) {
    			   primeiraDiagonal += matriz[linha][coluna];
    		   }
       }

	}
       System.out.println("Soma dos elementos da matriz: " + soma);
	   System.out.println("Soma da primeira diagonal: " + primeiraDiagonal);
	   
	   entry.close();
	}
	
}
