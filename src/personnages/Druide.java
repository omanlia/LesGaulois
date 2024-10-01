package personnages;

import java.util.Random;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotonMax;
	private int forcePotion = 1;
	private int forceMoyenne;
	private Random random = new Random();

	public Druide(String nom, int effetPotionMin, int effetPotonMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotonMax = effetPotonMax;
		parler("Bonjour , je suis le druide" + nom + "et ma potion peut aller d'une force" + effetPotionMin + "à"
				+ effetPotonMax + ".");
	}
	public void preparerPotion() {
		forcePotion = random.nextInt(effetPotionMin,effetPotonMax);
		if (forcePotion >forceMoyenne) {
			
		} else {

		}
		
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
