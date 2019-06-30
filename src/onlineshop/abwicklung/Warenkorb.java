package onlineshop.abwicklung;

import onlineshop.nutzer.Kunde;

public class Warenkorb {
	private int anzahlArtikel;
	private int artikelSumme;
	private boolean gutscheinEingeloest;
	
	public Warenkorb() {
		anzahlArtikel = 0;
		artikelSumme = 0;
	}
	
	public double preisProArtikel() throws ArithmeticException {
		double ergebnis;
		try {
			ergebnis = artikelSumme / anzahlArtikel;
		}
		catch(ArithmeticException ex) {
			throw new ArithmeticException("Warenkorb ist leer!");
		}
		return ergebnis;		
	}
	
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
