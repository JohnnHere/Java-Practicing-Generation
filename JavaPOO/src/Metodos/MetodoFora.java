package Metodos;

public class MetodoFora {
	public static String metodo06(int i, int f) {
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			numeroString += c + " | "; 
		}
		
		return numeroString;
	}

}
