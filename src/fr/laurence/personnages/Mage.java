package fr.laurence.personnages;

public class Mage extends Personnages implements Voler {

	public Mage() {
		super();
	}

	public Mage(int nombreDeVies, String nom, String arme, String type, int puissance) {
		super(nombreDeVies, nom, arme, type, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attaque de Mage");

	}

	@Override
	public void voler() {
		System.out.println("je vole");

	}

}
