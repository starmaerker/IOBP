package onlineshop;

import onlineshop.abwicklung.Warenkorb;
import onlineshop.nutzer.Kunde;
import onlineshop.waren.Buch;

public class OnlineShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kunde me = new Kunde();
		 * 
		 * me.setName("Centauri"); me.setVorname("Alpha");
		 * 
		 * //System.out.println(me.getVorname() + " " + me.getName());
		 * 
		 * Warenkorb ware = new Warenkorb(); ware.pruefeAltersfreigabe(17);
		 */
		
		Buch buch = new Buch();
		buch.setAutor("Adam Douglas");
		buch.setTitel("Per Anhalter durch die Galaxy");
		buch.setHersteller("42");
		
		System.out.println(buch.getBeschreibung());
	}

}
