package Generation02;

import java.util.Scanner;

public class GalaoEx01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double galoes, litros;
		
		
		
		System.out.println("Escreva o valor de gal�es ");
		galoes = leia.nextInt();
		litros = galoes * 3600;
		
		
		System.out.println(galoes + " gal�es s�o " + litros + "litros.");
		leia.close();
		
	}

}
