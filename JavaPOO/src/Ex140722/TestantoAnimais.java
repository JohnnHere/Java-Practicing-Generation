package Ex140722;

public class TestantoAnimais {

	public static void main(String[] args) {
		
		Fazendinha farm = new Fazendinha();
		
		farm.nomeAnimal(new Cavalo());
		
		farm.nomeAnimal(new Cachorro());
		
		farm.nomeAnimal(new Preguiça());
		
		farm.idadeAnimal(new Cavalo());
		
		farm.idadeAnimal(new Cachorro());
		
		farm.idadeAnimal(new Preguiça());
		
		farm.correrAnimal(new Cavalo());
		
		farm.correrAnimal(new Cachorro());
		
		farm.correrAnimal(new Preguiça());
		
        farm.somAnimal(new Cavalo());
		
		farm.somAnimal(new Cachorro());
		
		farm.somAnimal(new Preguiça());

	}

}
