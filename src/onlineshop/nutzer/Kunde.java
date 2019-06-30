package onlineshop.nutzer;

import onlineshop.abwicklung.Warenkorb;

public class Kunde {
	private String name;
	private String vorname;
	private String geschlecht;
	private String geburtsdatum;
	protected double mindestbestellwert;
	private boolean istPremiumKunde = false;
	private int anzahlDerEinkaeufe = 0;
	private Warenkorb warenkorb;
	
	public Kunde() {
		warenkorb = new Warenkorb();
		mindestbestellwert = 10;
	}
	
	public Kunde(String vorname, String name) {
		this();
		this.vorname = vorname;
		this.name = name;
	}
	
	public Kunde(String vorname, String name, String geschlecht, String datum) {
		this(vorname, name);
		this.geschlecht = geschlecht;
		this.geburtsdatum = datum;
	}
	
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
