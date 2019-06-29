package onlineshop.waren;

public class Artikel {
	protected String hersteller;
	protected String titel;
	protected String artikelnummer;
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	public String getArtikelnummer() {
		return artikelnummer;
	}
	
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
	public String getBeschreibung() {
		return artikelnummer + "; " + hersteller + "; " + titel;
	}
	
	public void zumWarenkorbHinzufuegen (Artikel artikel) {}
	
	public void zumWarenkorbHinzufuegen (Artikel artikel, int anzahl) {}
}
