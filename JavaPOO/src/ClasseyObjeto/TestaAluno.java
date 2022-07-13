package ClasseyObjeto;

public class TestaAluno {
	 
    public static void main(String[] args) {
        
        // Esse é o objeto (instanciar o objeto = criar o objeto)
        
        Aluno al1 = new Aluno();
        
        al1.setNome("Ingrid");
        al1.setIdade(22);
        al1.setCurso("Java Puro");
        
        System.out.println(al1.getNome());
        System.out.println(al1.getIdade());
        System.out.println(al1.getCurso());
 
    }
 
}