package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);

		Commercant marco = new Commercant("Marco", "thé", 10);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(5);
		marco.boire();

		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
		yaku.boire();
		yaku.extorquer(marco);

		Ronin roro = new Ronin("Roro", "shochu", 60, 1);
		roro.boire();
		roro.donner(marco);
		
		roro.provoquer(yaku);

	}

}
