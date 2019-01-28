package fr.laurence.personnages;

public class Main {

	public static void main(String[] args) {
		System.out.println("Gnome");
		Gnome gimmlit = new Gnome(5, "Gimmlit", "Hache", "A", 123);
		gimmlit.attack();
		gimmlit.changerArme("Hache à double tranchant");
		System.out.println(gimmlit.arme);

		Mage merlin = new Mage(10, "Merlin", "Septre", "B", 1259);
		System.out.println(merlin.arme);
		merlin.attack();
		merlin.voler();
		merlin.changerArme("Spectre flamboyant");
		System.out.println(merlin.arme);
	}
}
