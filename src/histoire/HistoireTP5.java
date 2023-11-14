package histoire;

import personnages.Commercant;
import personnages.Samourai;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 10);
		Commercant chonin = new Commercant("Chonin","thé", 40);
		Commercant kumi = new Commercant("Kumi","thé", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		Ronin roro = new Ronin("Roro", "shochu", 60, 1);
		Samourai akimoto = new Samourai("Akimoto", "saké", 60, 1, "Miyamoto");
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
		akimoto.boire("thé");
		
		
	}

}
