package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int vol = argent;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		vol = 0;
		return vol;
	}

	public void recevoir(int don) {
		parler(don + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(don);
	}
}
