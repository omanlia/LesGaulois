package histoire;

import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",8);
		asterix.parler("Bonjour � tous");
		Romain minus = new Romain("Minus",6);
		minus.parler("Un GAU...UN GAUGAU...>>");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
