package onlineshop.waren;

public class Sachbuch extends Buch {
	protected String thema;
	public String getBeschreibung() {
		return super.getBeschreibung() + " zum Thema " + thema;
	}
}
