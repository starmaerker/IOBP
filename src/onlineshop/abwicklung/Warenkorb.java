package onlineshop.abwicklung;

import onlineshop.nutzer.Kunde;

public class Warenkorb {
	private float anzahlArtikel;
	private float artikelSumme;
	private boolean gutscheinEingeloest;
	
	public float berechneSumme(Kunde kunde) {
		float result = artikelSumme;
		
		if(kunde.isIstPremiumKunde()) {
			if(anzahlArtikel > 3) {
				result = artikelSumme * 0.88f;
			}
			else {
				result = artikelSumme * 0.90f;
			}			
		}
		else {
			if(gutscheinEingeloest) {
				result = artikelSumme * 0.95f;
			}			
		}
		
		return result;		
	}
	
	public void pruefeAltersfreigabe(int alterDesKunden) {
		if (alterDesKunden >= 18) {
			System.out.println("Kunde ist volljährig");
		}
		else if (alterDesKunden >= 16) {
			System.out.println("Kunde ist nicht volljährig aber mindestens 16 Jahre alt.");
		}
		else {
			System.out.println("Kunde ist jünger als 16 Jahre.");
		}
	}
}
