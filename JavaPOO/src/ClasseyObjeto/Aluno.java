package ClasseyObjeto;

public class Aluno {
    
    // Esse � o molde, a classe
    
    // Caracter�sticas, ou vari�veis ou atributos de classe
    private int idade;
    private String nome;
    private String curso;
    
    // getters e setters -> servi�os que me ajudam no acesso e modifica��o dos dados
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
 
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // A��es, ou m�todos, ou fun��es
        public static void estudar() {
            System.out.println("Aluno est� estudando.");
        }
 
}