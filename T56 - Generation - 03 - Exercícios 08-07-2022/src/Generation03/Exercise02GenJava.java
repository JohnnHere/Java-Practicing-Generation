package Generation03;

import java.util.Scanner;

import java.util.Arrays; 

public class Exercise02GenJava {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        long[] valor = new long[3]; 

        System.out.println("Digite um n�mero: ");
        valor[0] = entry.nextLong();
        System.out.println("Digite mais um n�mero: ");
        valor[1] = entry.nextLong();
        System.out.println("Digite o �ltimo n�mer: ");
        valor[2] = entry.nextLong();

        entry.close(); 

        boolean flag;

        do {
            flag = false; 
            
            for(int i = 0; i < valor.length - 1; i++) {

              if (valor[i] > valor[i + 1]) {

                  long value = valor[i];
                  valor[i] = valor[i + 1];
                  valor[i + 1] = value;

                  flag = true;
              }
            }
        } while (flag); 
        
        System.out.println("Os n�meros digitados na ordem crescente s�o: " + Arrays.toString(valor));
    }
}