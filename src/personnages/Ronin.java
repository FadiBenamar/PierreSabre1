package personnages;

public class Ronin extends Humain {

	private int honneur = 0;

	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = argent / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + "sous.");
		beneficiaire.recevoir(don);
		argent -= don;
	}

}
