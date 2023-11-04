package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public void extorquer(Commercant victime) {
		int argentVictime = victime.getargent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		argent += argentVictime;
		parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + " , ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
		reputation++;

	}
}
