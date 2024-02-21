package aula2RPG;

public class FabricaPersonagens {

	public static void main(String[] args) {
		
		Personagem p1 = new Personagem();
		p1.setNome ("Arnaldo"); 
		
		Personagem p2 = new Personagem("Edmundo");
		
		
		System.out.println("p1 - "+p1.getNome());
		System.out.println("p2 - "+p2.getNome());
		
		p2.atacar();
		p2.atacar();
		
		System.out.println("XP - "+p2.getXp());
		System.out.println(Personagem.getMarca());
		
		//Personagem.marca;
	}

}
