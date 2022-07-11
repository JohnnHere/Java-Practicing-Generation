package prova04.dowhile;

public class Exercise01p04dowhile {

	public static void main(String[] args) throws InterruptedException {
		for(int number = 1000; number <= 1999; number++) {
			if(number % 11 == 5) {
				System.out.println("Estes números quando divididos por 11 tem resto 5: " + number);
				Thread.sleep(500);
			}
		}
	}
}
