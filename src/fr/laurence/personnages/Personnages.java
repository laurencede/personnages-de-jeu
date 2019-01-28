package fr.laurence.personnages;

public abstract class Personnages {
	protected int nombreDeVies;
	protected String nom;
	protected String arme;
	protected String type;
	protected int puissance;

	public abstract void attack();

	public void manger() {
		System.out.println("je mange");
	}

	public void sauter() {
		System.out.println("je saute");
	}

	public void changerArme(String nouvelleArme) {
		System.out.println("je change d'arme");
		arme = nouvelleArme;
	}

	public void seCacher() {
		System.out.println("je me cache");
	}

	public Personnages() {
		super();

	}

	public Personnages(int nombreDeVies, String nom, String arme, String type, int puissance) {
		super();
		this.nombreDeVies = nombreDeVies;
		this.nom = nom;
		this.arme = arme;
		this.type = type;
		this.puissance = puissance;
	}

	public int getNombreDeVies() {
		return nombreDeVies;
	}

	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArme() {
		return arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

}
