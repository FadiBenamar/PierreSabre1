package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	private int nbConnaissance = 0;
	public Humain[] memoire;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		memoire = new Humain[30];
	}

	public String getNom() {
		return nom;
	}

	public int getargent() {
		return argent;
	}

	public String prendreParole() {
		return "( " + nom + " ) - ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + prix + " sous");
		}
	}
	
	public void faireConnaissanceAvec(Humain rencontre) {
		direBonjour();
		rencontre.repondre(this);
		memoriser(rencontre);
	}
	
	private void repondre(Humain homme) {
		direBonjour();
		this.memoriser(homme);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<30) {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}else {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissance-1]=humain;
		}
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for (int i = 0; i < nbConnaissance-1; i++) {
			parler(memoire[i].getNom()+",");
		}
		parler(memoire[nbConnaissance-1].getNom()+".");
		
	}
}
