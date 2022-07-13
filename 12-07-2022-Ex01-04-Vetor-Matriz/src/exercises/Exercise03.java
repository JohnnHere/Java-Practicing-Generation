package exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner (System.in);
		
	    int n1[][] = new int [4][6], n2[][] = new int [4][6], m1[][] = new int [4][6], m2[][] = new int [4][6];
	    
	    System.out.println("Digite os valores da n1: ");
	    
	    for(int linha = 0; linha <= 3; linha++) {
	    	for(int coluna = 0; coluna <= 5; coluna++) {
	    		n1[linha][coluna] = entry.nextInt();
	    	}
	    }
	    
        System.out.println("Digite os valores da n2: ");
	    
	    for(int linha = 0; linha <= 3; linha++) {
	    	for(int coluna = 0; coluna <= 5; coluna++) {
	    		n2[linha][coluna] = entry.nextInt();
	    	}
	    }
	    
	    for(int linha = 0; linha <= 3; linha++) {
	    	for(int coluna = 0; coluna <= 5; coluna++) {
	    		m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
	    	}
	    }
        
	    System.out.println("O resultado da m1 é: ");
		for(int linha = 0; linha <= 3; linha++) {
			for(int coluna = 0; coluna <= 5; coluna++) {
				System.out.print(m1[linha][coluna] + " || "); 
			}
		}
	
		System.out.println("O resultado da m2 é: ");
		for(int linha = 0; linha <= 3; linha++) {
			for(int coluna = 0; coluna <= 5; coluna++) {
				System.out.print(m2[linha][coluna] + " || "); 
			}
		}	
		entry.close();
	}
}