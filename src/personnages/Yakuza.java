package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
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

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void perdre() {
		parler("J’ai perdu mon duel et mes " + getargent() + " sous, snif... J'ai déshonoré le clan de " + getClan() + " .");
		argent = 0;
		reputation -= 1;
	}

	public void gagner(int perte) {
		int argentGagne = perte;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan()
				+ " ? Je l'ai dépouillé de ses " + argentGagne + "  sous.");
		argent += argentGagne;
		reputation += 1;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon clan est celui de " + clan + ".");
	}
}
