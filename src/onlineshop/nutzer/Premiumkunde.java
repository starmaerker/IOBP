package onlineshop.nutzer;

public class Premiumkunde extends Kunde {
	double mbwBonus = 10;
	
	public Premiumkunde(String vorname, String name) {
		super(vorname, name);
		mindestbestellwert = mindestbestellwert - mbwBonus;
	}
}
