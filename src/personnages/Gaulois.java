package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPortion=" + effetPortion + "]";
	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

}
