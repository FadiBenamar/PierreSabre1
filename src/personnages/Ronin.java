package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = argent / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		argent -= don;
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			argent += adversaire.getargent();
			honneur++;
			adversaire.perdre();
			parler("Je t’ai eu petit yakusa!");
		} else {
			int perte = getargent();
			argent = 0;
			honneur -= 1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(perte);
		}
	}

}
