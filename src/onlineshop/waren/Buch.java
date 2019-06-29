package onlineshop.waren;

public abstract class Buch extends Artikel {	
	protected String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getBeschreibung() {
		return super.getBeschreibung() + Artikel.TRENNZEICHEN + autor;
	}

	public abstract String getTwitterBeschreibung();
}
