package Exercises;

public class Customer {
    
    private int idade;
    private String nome;
    private String id;
    
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
    
        public static void comprar() {
            System.out.println("O cliente comprou este produto.");
        }
        
        public static void devolver() {
            System.out.println("O cliente devolveu este produto.");
        }
        
        public static void parcelar() {
            System.out.println("O cliente parcelou este produto.");
        }
 
}
