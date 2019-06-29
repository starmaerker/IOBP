package onlineshop.waren;

public class Sachbuch extends Buch {
	protected String thema;
	
	public String getBeschreibung() {
		return super.getBeschreibung() + Artikel.TRENNZEICHEN + thema;
	}
	
	@Override
	public String getTwitterBeschreibung() {
		// TODO Auto-generated method stub
		return "Sachbuch zum Thema: " + thema;
	}
}
