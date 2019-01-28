package fr.laurence.personnages;

public class Gnome extends Personnages {

	public Gnome() {
		super();
	}

	public Gnome(int nombreDeVies, String nom, String arme, String type, int puissance) {
		super(nombreDeVies, nom, arme, type, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attaque de Gnome");

	}

}
