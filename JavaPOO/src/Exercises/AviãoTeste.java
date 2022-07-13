package Exercises;

public class AviãoTeste {

public static void main(String[] args) {
		
        Avião a1 = new Avião();
        
        a1.setId("afe6g03e-32cf-12ed-b939-0242ac120002");
        
        Avião.voar();
        Avião.acelerou();
        Avião.acelerou();
        Avião.freou();
        Avião.pousar();
        
        System.out.println("O avião que pousou é o: " + a1.getId());
    }
 
}