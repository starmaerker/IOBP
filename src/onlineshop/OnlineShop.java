package onlineshop;

import onlineshop.abwicklung.Warenkorb;
import onlineshop.nutzer.Kunde;

public class OnlineShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kunde me = new Kunde();
		
		me.setName("Centauri");
		me.setVorname("Alpha");
				
	    //System.out.println(me.getVorname() + " " + me.getName());
		
		Warenkorb ware = new Warenkorb();
		ware.pruefeAltersfreigabe(17);
	}

}
