package Exercises;

public class Avi�oTeste {

public static void main(String[] args) {
		
        Avi�o a1 = new Avi�o();
        
        a1.setId("afe6g03e-32cf-12ed-b939-0242ac120002");
        
        Avi�o.voar();
        Avi�o.acelerou();
        Avi�o.acelerou();
        Avi�o.freou();
        Avi�o.pousar();
        
        System.out.println("O avi�o que pousou � o: " + a1.getId());
    }
 
}