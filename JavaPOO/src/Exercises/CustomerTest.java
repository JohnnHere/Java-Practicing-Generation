package Exercises;

public class CustomerTest {

	public static void main(String[] args) {
		
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        
        c1.setNome("Ingrid"); c1.setIdade(22); c1.setId("bfe6f03e-02cf-11ed-b939-0242ac120002");
        c2.setNome("Jo�o"); c2.setIdade(26); c2.setId("bfe6f2e6-02cf-11ed-b939-0242ac120002");
        c3.setNome("M�rio"); c3.setIdade(52); c3.setId("bfe6f444-02cf-11ed-b939-0242ac120002");
        
		
        
        System.out.println("As informa��es do cliente 1 s�o: " + c1.getNome() + ", " + c1.getIdade() + " anos e o ID � " + c1.getId());
        Customer.parcelar();
        System.out.println("As informa��es do cliente 2 s�o: " + c2.getNome() + ", " + c2.getIdade() + " anos e o ID � " + c2.getId());
        System.out.println("As informa��es do cliente 3 s�o: " + c3.getNome() + ", " + c3.getIdade() + " anos e o ID � " + c3.getId());
        
    }
 
}