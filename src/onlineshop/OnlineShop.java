package onlineshop;

import onlineshop.abwicklung.*;
import onlineshop.exception.MindestbestellwertNegativException;
import onlineshop.exception.UngueltigesGeschlechtException;
import onlineshop.nutzer.*;
import onlineshop.waren.*;

public class OnlineShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Kunde me = new Kunde("Alpha", "Centauri");
		  Kunde max = new Kunde("Max", "Mustermann", "", "01.01.01");
		  
		  max.setMindestbestellwert(-0.1);
		  
		  try {
			  max.returnMindestbestellwert();
		  }
		  catch(MindestbestellwertNegativException ex) {
			  System.out.println(ex.getMessage());
		  }
		  
		  try{
				Kunde k1 = new Kunde();
				k1.getGeschlecht();
			} catch (UngueltigesGeschlechtException ex) {
				System.out.println(ex.getMessage());
			}
		  
		  //Premiumkunde elite = new Premiumkunde("elia", "felia");
		/*
		 * try { System.out.println(max.getWarenkorb().preisProArtikel()); } catch
		 * (ArithmeticException ex) { System.out.println(ex instanceof
		 * RuntimeException); System.out.println(ex.getMessage()); }
		 */
		 // System.out.println(max.getWarenkorb().preisProArtikel());
		  
		  
		/*
		 * Sachbuch buch = new Sachbuch(); buch.setAutor("Adam Douglas");
		 * buch.setTitel("Per Anhalter durch die Galaxy"); buch.setHersteller("42");
		 * 
		 * System.out.println(buch.getBeschreibung());
		 * System.out.println(buch.getTwitterBeschreibung());
		 */
		 
		
		
	}

}
