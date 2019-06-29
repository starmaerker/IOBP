package onlineshop;

import onlineshop.abwicklung.*;
import onlineshop.nutzer.*;
import onlineshop.waren.*;

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
		
		Sachbuch buch = new Sachbuch();
		buch.setAutor("Adam Douglas");
		buch.setTitel("Per Anhalter durch die Galaxy");
		buch.setHersteller("42");
		
		System.out.println(buch.getBeschreibung());
		System.out.println(buch.getTwitterBeschreibung());
		
		
	}

}
