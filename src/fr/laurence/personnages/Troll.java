package fr.laurence.personnages;

public class Troll extends Personnages {

	public Troll() {
		super();
	}

	public Troll(int nombreDeVies, String nom, String arme, String type, int puissance) {
		super(nombreDeVies, nom, arme, type, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attaque de Troll");

	}

}
