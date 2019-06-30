package onlineshop;

import onlineshop.abwicklung.*;
import onlineshop.nutzer.*;
import onlineshop.waren.*;

public class OnlineShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Kunde me = new Kunde("Alpha", "Centauri");
		  Kunde max = new Kunde("Max", "Mustermann", "m", "01.01.01");
		  
		  Premiumkunde elite = new Premiumkunde("elia", "felia");
		  
		  System.out.println(elite.toString());
		  
		  
		  
		  
		  
		  
		 
		
		
		  Sachbuch buch = new Sachbuch(); buch.setAutor("Adam Douglas");
		  buch.setTitel("Per Anhalter durch die Galaxy"); buch.setHersteller("42");
		  
		  System.out.println(buch.getBeschreibung());
		  System.out.println(buch.getTwitterBeschreibung());
		 
		
		
	}

}
