package ClasseyObjeto;

public class Aluno {
    
    // Esse é o molde, a classe
    
    // Características, ou variáveis ou atributos de classe
    private int idade;
    private String nome;
    private String curso;
    
    // getters e setters -> serviços que me ajudam no acesso e modificação dos dados
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
    
    // Ações, ou métodos, ou funções
        public static void estudar() {
            System.out.println("Aluno está estudando.");
        }
 
}