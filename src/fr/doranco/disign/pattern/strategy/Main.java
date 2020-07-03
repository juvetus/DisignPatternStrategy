package fr.doranco.disign.pattern.strategy;

public class Main {

	public static void main(String[] args) {
        
		
		Article article1 = new Article("Livre : 'Tout savoir sur le pattern Strategy'", 25);
		Article article2 = new Article("Piano steinway & sons B 211" , 51000);
		Article article3 = new Article("Maison : 'Maison sur pilotis au Maldives'", 497);
		
		// Paiement par Paypal
		article1.payer(new PaypalStrategy("emailExemple", "passwordExemple"));
		
		
		// Paiement par Carte de credit
		
		article2.payer(new CarteDeCreditStrategy("1234567890123456", "786", "12/22"));
		
		// Paiement par Bitcoin
		article3.payer(new BitcoinStrategy("idPortefeuilleExemple", "passwordExemple"));
	}

}
