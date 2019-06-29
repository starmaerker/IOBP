package onlineshop.nutzer;

public class Kunde {
	private String name;
	private String vorname;
	private String geschlecht;
	private String geburtsdatum;
	private boolean istPremiumKunde = false;
	private int anzahlDerEinkaeufe = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public boolean isIstPremiumKunde() {
		return istPremiumKunde;
	}
	public void setIstPremiumKunde(boolean istPremiumKunde) {
		this.istPremiumKunde = istPremiumKunde;
	}
	public int getAnzahlDerEinkaeufe() {
		return anzahlDerEinkaeufe;
	}
	public void setAnzahlDerEinkaeufe(int anzahlDerEinkaeufe) {
		this.anzahlDerEinkaeufe = anzahlDerEinkaeufe;
	}
}
