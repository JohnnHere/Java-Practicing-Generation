package Exercises;

public class Avião {
	public Boolean ligado;
    public String modelo;
    public String tamanho;
    private String id;
    
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
    
        public static void voar() {
            System.out.println("O avião decolou.");
        }
        
        public static void pousar() {
            System.out.println("O avião pousou.");
        }
        
        public static void acelerou() {
            System.out.println("O avião acelerou.");
        }
        
        public static void freou() {
        	System.out.println("O avião freou.");
        }
 
}


