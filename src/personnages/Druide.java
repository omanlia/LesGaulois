package personnages;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotonMax;

	public Druide(String nom, int effetPotionMin, int effetPotonMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotonMax = effetPotonMax;
		parler("Bonjour , je suis le druide" + nom + "et ma potion peut aller d'une force" + effetPotionMin + "à"
				+ effetPotonMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le druide" + nom + ":";

	}

}
